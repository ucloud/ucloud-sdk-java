package cn.ucloud.unet.client;

import cn.ucloud.unet.client.DefaultUnetClient;
import cn.ucloud.unet.client.UnetClient;
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
        rules.add(new UpdateFirewallParam.Rule("TCP", 22, "192.168.1.1", "ACCEPT", "LOW"));
        rules.add(new UpdateFirewallParam.Rule("TCP", 22, "192.168.1.2", "ACCEPT", "LOW"));
        param = new UpdateFirewallParam("cn-sh2", "fwId",rules);
        param.setProjectId("org-4nfe1i");
    }

    @Test
    public void updateFirewall() {
        try {
            UpdateFirewallResult allocateEIPResult = client.updateFirewall(param);
            System.out.println(allocateEIPResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
