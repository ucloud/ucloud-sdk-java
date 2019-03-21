package cn.ucloud.ufs.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.ufs.model.DescribeUFSVolumeUpgradePriceParam;
import cn.ucloud.ufs.model.DescribeUFSVolumeUpgradePriceResult;
import cn.ucloud.ufs.pojo.UFSConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-10-08 16:48
 **/
public class DescribeUFSVolumeUpgradePriceTest {

    private UFSClient client;

    private DescribeUFSVolumeUpgradePriceParam param;

    @Before
    public void initData() {
        client = new DefaultUFSClient(new UFSConfig(
                new Account(System.getenv("UCloudPrivateKey"),
                        System.getenv("UCloudPublicKey"))));
        param = new DescribeUFSVolumeUpgradePriceParam("cn-bj2","ufs-qx1waw",2048);
        param.setProjectId("org-izug1m");
    }

    @Test
    public void describeUFSVolumeUpgradePrice() {
        try {
            DescribeUFSVolumeUpgradePriceResult result = client.describeUFSVolumeUpgradePrice(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }
}