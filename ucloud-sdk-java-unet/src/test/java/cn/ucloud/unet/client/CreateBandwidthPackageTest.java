package cn.ucloud.unet.client;

import cn.ucloud.unet.client.DefaultUnetClient;
import cn.ucloud.unet.client.UnetClient;
import cn.ucloud.unet.model.CreateBandwidthPackageParam;
import cn.ucloud.unet.model.CreateBandwidthPackageResult;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.unet.pojo.UnetConfig;
import org.junit.Before;
import org.junit.Test;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-27 15:29
 **/
public class CreateBandwidthPackageTest {

    private UnetClient client;

    private CreateBandwidthPackageParam param;

    @Before
    public void initData() {
        client = new DefaultUnetClient(new UnetConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        param = new CreateBandwidthPackageParam("cn-bj2","eip-44ayct",1,24);
        param.setProjectId("org-4nfe1i");
    }

    @Test
    public void createBandwidthPackage() {
        try {
            CreateBandwidthPackageResult bandwidthPackage = client.createBandwidthPackage(param);
            System.out.println(bandwidthPackage);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}