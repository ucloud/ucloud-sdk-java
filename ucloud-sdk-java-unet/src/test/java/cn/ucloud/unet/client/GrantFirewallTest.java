package cn.ucloud.unet.client;

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

        param = new GrantFirewallParam("cn-sh2", "firewall-xujipdz3", "UHost", "uhost-dwomflqt");
    }

    @Test
    public void grantFirewall() {
        try {
            GrantFirewallResult allocateEIPResult = client.grantFirewall(param);
            JSONComparator.jsonComparator(allocateEIPResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
