package cn.ucloud.client;

import cn.ucloud.model.DeleteFirewallParam;
import cn.ucloud.model.DeleteFirewallResult;
import cn.ucloud.pojo.Account;
import cn.ucloud.pojo.UnetConfig;
import org.junit.Before;
import org.junit.Test;

/**
 * @description:
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2018/9/27 18:08
 */
public class DeleteFirewallTest {
    private UnetClient client;

    private DeleteFirewallParam param;

    @Before
    public void initData() {
        client = new DefaultUnetClient(new UnetConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));

        param = new DeleteFirewallParam("cn-sh2", "fwId");
        param.setProjectId("org-4nfe1i");
    }

    @Test
    public void deleteFirewall() {
        try {
            DeleteFirewallResult allocateEIPResult = client.deleteFirewall(param);
            System.out.println(allocateEIPResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
