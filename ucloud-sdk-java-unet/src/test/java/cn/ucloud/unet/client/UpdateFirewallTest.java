package cn.ucloud.unet.client;

import cn.ucloud.unet.model.UpdateFirewallParam;
import cn.ucloud.unet.model.UpdateFirewallResult;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.unet.pojo.UnetConfig;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2018/9/27 18:06
 */
public class UpdateFirewallTest {
    private UnetClient client;

    private UpdateFirewallParam param;

    @Before
    public void initData() {
        client = new DefaultUnetClient(new UnetConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));

        List<UpdateFirewallParam.Rule> rules = new ArrayList<>();
        rules.add(new UpdateFirewallParam.Rule("TCP", 24, "120.132.8.183", "ACCEPT", "MEDIUM"));
        param = new UpdateFirewallParam("cn-sh2", "firewall-xujipdz3", rules);
    }

    @Test
    public void updateFirewall() {
        try {
            UpdateFirewallResult allocateEIPResult = client.updateFirewall(param);
            System.out.println(allocateEIPResult);
            JSONComparator.jsonComparator(allocateEIPResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
