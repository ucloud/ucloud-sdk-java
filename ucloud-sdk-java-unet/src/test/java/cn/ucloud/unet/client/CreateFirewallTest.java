package cn.ucloud.unet.client;

import cn.ucloud.unet.client.DefaultUnetClient;
import cn.ucloud.unet.client.UnetClient;
import cn.ucloud.unet.model.CreateFirewallParam;
import cn.ucloud.unet.model.CreateFirewallResult;
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
 * @date: 2018/9/27 14:06
 */
public class CreateFirewallTest {
    private UnetClient client;

    private CreateFirewallParam param;

    @Before
    public void initData() {
        client = new DefaultUnetClient(new UnetConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));

        List<CreateFirewallParam.Rule> rules = new ArrayList<>();
        rules.add(new CreateFirewallParam.Rule("TCP", 22, "192.168.1.1", "ACCEPT", "LOW"));
        rules.add(new CreateFirewallParam.Rule("TCP", 22, "192.168.1.2", "ACCEPT", "LOW"));
        param = new CreateFirewallParam("cn-sh2", rules,"Firewall");
        param.setProjectId("org-4nfe1i");
    }

    @Test
    public void createFirewall() {
        try {
            CreateFirewallResult allocateEIPResult = client.createFirewall(param);
            System.out.println(allocateEIPResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
