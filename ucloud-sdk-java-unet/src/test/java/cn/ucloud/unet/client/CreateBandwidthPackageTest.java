package cn.ucloud.unet.client;

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
        param = new CreateBandwidthPackageParam("cn-sh2", "eip-vcsnbgi4", 6, 1);
    }

    @Test
    public void createBandwidthPackage() {
        try {
            CreateBandwidthPackageResult bandwidthPackage = client.createBandwidthPackage(param);
            System.out.println(bandwidthPackage);
            JSONComparator.jsonComparator(bandwidthPackage);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}