package cn.ucloud.example;

import cn.ucloud.common.client.DefaultClient;
import cn.ucloud.common.config.Config;
import cn.ucloud.common.credential.Credential;
import cn.ucloud.common.exception.RetCodeException;
import cn.ucloud.common.exception.UCloudException;
import cn.ucloud.common.exception.ValidatorException;
import cn.ucloud.common.request.Request;
import cn.ucloud.common.response.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        Config config = new Config();
        config.setRegion("cn-bj2");

        config.setLogger(logger);
        Credential credential =
                new Credential(
                        System.getenv("UCLOUD_PUBLIC_KEY"), System.getenv("UCLOUD_PRIVATE_KEY"));
        DefaultClient client = new DefaultClient(config, credential);

        Request request = new Request();
        request.setAction("GetRegion");

        Response response = null;
        try {
            response = client.invoke(request, Response.class);
        } catch (ValidatorException e) {
            System.out.println(e.getMessage());
        } catch (RetCodeException e) {
            System.out.println(e.getRetCode());
        } catch (UCloudException e) {
            e.printStackTrace();
        }
        System.out.println(response);
    }
}
