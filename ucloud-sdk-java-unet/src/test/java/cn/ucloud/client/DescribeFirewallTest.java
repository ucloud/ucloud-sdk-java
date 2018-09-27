package cn.ucloud.client;

import cn.ucloud.model.DescribeFirewallParam;
import cn.ucloud.model.DescribeFirewallResult;
import cn.ucloud.pojo.Account;
import cn.ucloud.pojo.UnetConfig;
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
        param.setProjectId("org-4nfe1i");
    }

    @Test
    public void describeFirewall() {
        try {
            DescribeFirewallResult allocateEIPResult = client.describeFirewall(param);
            System.out.println(allocateEIPResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
