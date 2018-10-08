package cn.ucloud.ufs.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.ufs.model.DescribeUFSVolumeUpgradePriceParam;
import cn.ucloud.ufs.model.DescribeUFSVolumeUpgradePriceResult;
import cn.ucloud.ufs.pojo.UFSConfig;
import org.junit.Before;
import org.junit.Test;

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
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        param = new DescribeUFSVolumeUpgradePriceParam("cn-bj2","",2024);
        param.setProjectId("org-4nfe1i");
    }

    @Test
    public void describeUFSVolumeUpgradePrice() {
        try {
            DescribeUFSVolumeUpgradePriceResult describeUFSVolumeUpgradePriceResult = client.describeUFSVolumeUpgradePrice(param);
            System.out.println(describeUFSVolumeUpgradePriceResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}