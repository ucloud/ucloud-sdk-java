package cn.ucloud.unet.client;

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
                new Account(System.getenv("UCloudPrivateKey"),
                        System.getenv("UCloudPublicKey"))));
        param = new DescribeVIPParam("cn-sh2");
    }

    @Test
    public void describeVIP() {
        try {
            DescribeVIPResult describeVIPResult = client.describeVIP(param);
            JSONComparator.jsonComparator(describeVIPResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}