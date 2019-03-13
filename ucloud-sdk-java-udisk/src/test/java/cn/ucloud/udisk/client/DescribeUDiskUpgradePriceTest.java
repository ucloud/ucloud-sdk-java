package cn.ucloud.udisk.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.udisk.model.DescribeUDiskUpgradePriceParam;
import cn.ucloud.udisk.model.DescribeUDiskUpgradePriceResult;
import cn.ucloud.udisk.pojo.UdiskConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;

/**
 * @description:
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2018/9/26 17:14
 */
public class DescribeUDiskUpgradePriceTest {
    private UdiskClient client;

    private DescribeUDiskUpgradePriceParam param;

    @Before
    public void initData() {
        client = new DefaultUdiskClient(new UdiskConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        param = new DescribeUDiskUpgradePriceParam("cn-sh2","cn-sh2-01","org-4nfe1i",
                32,"bs-4qfrwv","No");
    }

    @Test
    public void describeUDiskUpgradePrice() {
        try {
            DescribeUDiskUpgradePriceResult result = client.describeUDiskUpgradePrice(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void describeUDiskUpgradePriceCallback() {
        client.describeUDiskUpgradePrice(param, new UcloudHandler<DescribeUDiskUpgradePriceResult>() {
            @Override
            public Object success(DescribeUDiskUpgradePriceResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(DescribeUDiskUpgradePriceResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object error(Exception e) {
                assertNull(e);
                return null;
            }
        }, false);
    }
}
