package cn.ucloud.example;

import cn.ucloud.common.config.Config;
import cn.ucloud.common.credential.Credential;
import cn.ucloud.common.exception.RetCodeException;
import cn.ucloud.common.exception.UCloudException;
import cn.ucloud.uhost.client.UHostClient;
import cn.ucloud.uhost.models.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        Config config = new Config();
        config.setRegion("cn-bj2");

        config.setLogger(logger);
        Credential credential =
                new Credential(
                        System.getenv("UCLOUD_PUBLIC_KEY"), System.getenv("UCLOUD_PRIVATE_KEY"));
        UHostClient client = new UHostClient(config, credential);

        String zone = "cn-bj2-05";

        DescribeImageRequest describeImageRequest = new DescribeImageRequest();
        describeImageRequest.setZone(zone);
        describeImageRequest.setImageType("Base");
        describeImageRequest.setOsType("Linux");

        DescribeImageResponse describeImageResponse = null;
        try {
            describeImageResponse = client.describeImage(describeImageRequest);
        } catch (RetCodeException e) {
            System.out.println(e.getRetCode());

        } catch (UCloudException e) {
            e.printStackTrace();
            return;
        }

        DescribeImageResponse.UHostImageSet image = describeImageResponse.getImageSet().get(0);
        String imageId = image.getImageId();

        CreateUHostInstanceRequest createUHostInstanceRequest = new CreateUHostInstanceRequest();
        createUHostInstanceRequest.setName("sdk-java-示例");
        createUHostInstanceRequest.setZone(zone);
        createUHostInstanceRequest.setImageId(imageId);
        createUHostInstanceRequest.setLoginMode("Password");
        createUHostInstanceRequest.setPassword(
                Base64.getEncoder().encodeToString("UCloud1234!".getBytes(StandardCharsets.UTF_8)));
        createUHostInstanceRequest.setCPU(1);
        createUHostInstanceRequest.setMemory(1024);

        List<CreateUHostInstanceRequest.Disks> disks = new ArrayList<>();
        CreateUHostInstanceRequest.Disks disk = new CreateUHostInstanceRequest.Disks();
        disk.setSize(image.getImageSize());
        disk.setType("CLOUD_SSD");
        disk.setIsBoot("True");
        createUHostInstanceRequest.setDisks(disks);

        CreateUHostInstanceResponse createUHostInstanceResponse = null;
        try {
            createUHostInstanceResponse = client.createUHostInstance(createUHostInstanceRequest);
        } catch (UCloudException e) {
            e.printStackTrace();
            return;
        }
        List<String> ids = createUHostInstanceResponse.getUHostIds();

        try {
            Main.waitState(client, ids, zone, "Running");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        PoweroffUHostInstanceRequest poweroffUHostInstanceRequest =
                new PoweroffUHostInstanceRequest();
        poweroffUHostInstanceRequest.setZone(zone);
        poweroffUHostInstanceRequest.setUHostId(ids.get(0));

        PoweroffUHostInstanceResponse poweroffUHostInstanceResponse = null;
        try {
            poweroffUHostInstanceResponse =
                    client.poweroffUHostInstance(poweroffUHostInstanceRequest);
        } catch (UCloudException e) {
            e.printStackTrace();
            return;
        }

        try {
            Main.waitState(client, ids, zone, "Stopped");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        TerminateUHostInstanceRequest terminateUHostInstanceRequest =
                new TerminateUHostInstanceRequest();
        terminateUHostInstanceRequest.setZone(zone);
        terminateUHostInstanceRequest.setUHostId(ids.get(0));

        TerminateUHostInstanceResponse terminateUHostInstanceResponse = null;
        try {
            terminateUHostInstanceResponse =
                    client.terminateUHostInstance(terminateUHostInstanceRequest);
        } catch (UCloudException e) {
            e.printStackTrace();
            return;
        }

        System.out.println("All passed!");
    }

    private static void waitState(UHostClient client, List<String> ids, String zone, String state)
            throws InterruptedException {
        while (true) {
            DescribeUHostInstanceRequest describeUHostInstanceRequest =
                    new DescribeUHostInstanceRequest();
            describeUHostInstanceRequest.setZone(zone);
            describeUHostInstanceRequest.setUHostIds(ids);

            DescribeUHostInstanceResponse describeUHostInstanceResponse = null;
            try {
                describeUHostInstanceResponse =
                        client.describeUHostInstance(describeUHostInstanceRequest);
            } catch (UCloudException e) {
                e.printStackTrace();
                return;
            }

            DescribeUHostInstanceResponse.UHostInstanceSet instance =
                    describeUHostInstanceResponse.getUHostSet().get(0);
            System.out.printf(
                    "wanting %s to %s, got %s\n",
                    instance.getUHostId(), state, instance.getState());
            if (instance.getState().equals(state)) {
                break;
            }
            TimeUnit.SECONDS.sleep(3);
        }
    }
}
