package cn.ucloud.client;

import cn.ucloud.model.DescribeFirewallResourceParam;
import cn.ucloud.model.DescribeFirewallResourceResult;
import cn.ucloud.pojo.Account;
import cn.ucloud.pojo.UnetConfig;
import org.junit.Before;
import org.junit.Test;

/**
 * @description:
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2018/9/27 18:00
 */
public class DescribeFirewallResourceTest {
    private UnetClient client;

    private DescribeFirewallResourceParam param;

    @Before
    public void initData() {
        client = new DefaultUnetClient(new UnetConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));

        param = new DescribeFirewallResourceParam("cn-sh2", "fwId");
        param.setProjectId("org-4nfe1i");
    }

    @Test
    public void describeFirewallResource() {
        try {
            DescribeFirewallResourceResult allocateEIPResult = client.describeFirewallResource(param);
            System.out.println(allocateEIPResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
