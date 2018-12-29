package cn.ucloud.unet.client;

import cn.ucloud.unet.client.DefaultUnetClient;
import cn.ucloud.unet.client.UnetClient;
import cn.ucloud.unet.model.DescribeVIPParam;
import cn.ucloud.unet.model.DescribeVIPResult;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.unet.pojo.UnetConfig;
import org.junit.Before;
import org.junit.Test;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-27 14:52
 **/
public class DescribeVIPTest {

    private UnetClient client;

    private DescribeVIPParam param;

    @Before
    public void initData() {
        client = new DefaultUnetClient(new UnetConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        param = new DescribeVIPParam("cn-bj2");
        param.setProjectId("org-4nfe1i");
    }

    @Test
    public void describeVIP() {
        try {
            DescribeVIPResult describeVIPResult = client.describeVIP(param);
            System.out.println(describeVIPResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}