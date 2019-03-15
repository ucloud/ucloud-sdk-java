package cn.ucloud.unet.client;

import cn.ucloud.unet.model.DescribeFirewallParam;
import cn.ucloud.unet.model.DescribeFirewallResult;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.unet.pojo.UnetConfig;
import org.junit.Before;
import org.junit.Test;

/**
 * @description:
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2018/9/27 17:56
 */
public class DescribeFirewallTest {
    private UnetClient client;

    private DescribeFirewallParam param;

    @Before
    public void initData() {
        client = new DefaultUnetClient(new UnetConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));

        param = new DescribeFirewallParam("cn-sh2");
    }

    @Test
    public void describeFirewall() {
        try {
            DescribeFirewallResult allocateEIPResult = client.describeFirewall(param);
            JSONComparator.jsonComparator(allocateEIPResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
