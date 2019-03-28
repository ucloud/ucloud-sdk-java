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
                new Account(System.getenv("UCloudPrivateKey"),
                        System.getenv("UCloudPublicKey"))));

        List<UpdateFirewallParam.Rule> rules = new ArrayList<>();
        rules.add(new UpdateFirewallParam.Rule("TCP", 24, "0.0.0.0/0", "ACCEPT", "MEDIUM"));
        param = new UpdateFirewallParam("cn-sh2", "firewall-yzb2r03v", rules);
    }

    @Test
    public void updateFirewall() {
        try {
            UpdateFirewallResult allocateEIPResult = client.updateFirewall(param);
            JSONComparator.jsonComparator(allocateEIPResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
