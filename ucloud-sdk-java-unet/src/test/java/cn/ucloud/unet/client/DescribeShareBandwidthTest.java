package cn.ucloud.unet.client;

import cn.ucloud.unet.client.DefaultUnetClient;
import cn.ucloud.unet.client.UnetClient;
import cn.ucloud.unet.model.DescribeShareBandwidthParam;
import cn.ucloud.unet.model.DescribeShareBandwidthResult;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.unet.pojo.UnetConfig;
import org.junit.Before;
import org.junit.Test;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-27 17:16
 **/
public class DescribeShareBandwidthTest {

    private UnetClient client;

    private DescribeShareBandwidthParam param;

    @Before
    public void initData() {
        client = new DefaultUnetClient(new UnetConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        param = new DescribeShareBandwidthParam("cn-bj2");
        param.setProjectId("org-4nfe1i");
    }

    @Test
    public void describeShareBandwidth() {
        try {
            DescribeShareBandwidthResult describeShareBandwidthResult = client.describeShareBandwidth(param);
            System.out.println(describeShareBandwidthResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}