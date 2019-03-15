package cn.ucloud.unet.client;

import cn.ucloud.unet.model.DescribeBandwidthPackageParam;
import cn.ucloud.unet.model.DescribeBandwidthPackageResult;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.unet.pojo.UnetConfig;
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
        param = new DescribeBandwidthPackageParam("cn-sh2");
    }

    @Test
    public void describeBandwidthPackage() {
        try {
            DescribeBandwidthPackageResult describeBandwidthPackageResult = client.describeBandwidthPackage(param);
            System.out.println(describeBandwidthPackageResult);
            JSONComparator.jsonComparator(describeBandwidthPackageResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}