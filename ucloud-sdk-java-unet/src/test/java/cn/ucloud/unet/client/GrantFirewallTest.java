package cn.ucloud.unet.client;

import cn.ucloud.unet.client.DefaultUnetClient;
import cn.ucloud.unet.client.UnetClient;
import cn.ucloud.unet.model.GrantFirewallParam;
import cn.ucloud.unet.model.GrantFirewallResult;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.unet.pojo.UnetConfig;
import org.junit.Before;
import org.junit.Test;

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
