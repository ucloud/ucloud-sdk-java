package cn.ucloud.client;

import cn.ucloud.model.GrantFirewallParam;
import cn.ucloud.model.GrantFirewallResult;
import cn.ucloud.pojo.Account;
import cn.ucloud.pojo.UnetConfig;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2018/9/27 17:54
 */
public class GrantFirewallTest {
    private UnetClient client;

    private GrantFirewallParam param;

    @Before
    public void initData() {
        client = new DefaultUnetClient(new UnetConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));

        param = new GrantFirewallParam("cn-sh2", "fwId","UHost","123");
        param.setProjectId("org-4nfe1i");
    }

    @Test
    public void grantFirewall() {
        try {
            GrantFirewallResult allocateEIPResult = client.grantFirewall(param);
            System.out.println(allocateEIPResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
