package cn.ucloud.client;

import cn.ucloud.model.DescribeBandwidthPackageParam;
import cn.ucloud.model.DescribeBandwidthPackageResult;
import cn.ucloud.pojo.Account;
import cn.ucloud.pojo.UnetConfig;
import org.junit.Before;
import org.junit.Test;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-27 15:58
 **/
public class DescribeBandwidthPackageTest {

    private UnetClient client;

    private DescribeBandwidthPackageParam param;

    @Before
    public void initData() {
        client = new DefaultUnetClient(new UnetConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        param = new DescribeBandwidthPackageParam("cn-bj2");
        param.setProjectId("org-4nfe1i");
    }

    @Test
    public void describeBandwidthPackage() {
        try {
            DescribeBandwidthPackageResult describeBandwidthPackageResult = client.describeBandwidthPackage(param);
            System.out.println(describeBandwidthPackageResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}