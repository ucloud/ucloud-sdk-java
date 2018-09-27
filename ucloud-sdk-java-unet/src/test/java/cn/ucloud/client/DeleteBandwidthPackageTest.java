package cn.ucloud.client;

import cn.ucloud.model.DeleteBandwidthPackageParam;
import cn.ucloud.model.DeleteBandwidthPackageResult;
import cn.ucloud.pojo.Account;
import cn.ucloud.pojo.UnetConfig;
import org.junit.Before;
import org.junit.Test;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-27 16:25
 **/
public class DeleteBandwidthPackageTest {


    private UnetClient client;

    private DeleteBandwidthPackageParam param;

    @Before
    public void initData() {
        client = new DefaultUnetClient(new UnetConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        param = new DeleteBandwidthPackageParam("cn-bj2","bwpack-hipzkn");
        param.setProjectId("org-4nfe1i");
    }

    @Test
    public void deleteBandwidthPackage() {
        try {
            DeleteBandwidthPackageResult deleteBandwidthPackageResult = client.deleteBandwidthPackage(param);
            System.out.println(deleteBandwidthPackageResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}