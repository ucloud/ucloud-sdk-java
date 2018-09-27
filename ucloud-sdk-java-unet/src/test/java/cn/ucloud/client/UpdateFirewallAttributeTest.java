package cn.ucloud.client;

import cn.ucloud.model.UpdateFirewallAttributeParam;
import cn.ucloud.model.UpdateFirewallAttributeResult;
import cn.ucloud.pojo.Account;
import cn.ucloud.pojo.UnetConfig;
import org.junit.Before;
import org.junit.Test;

/**
 * @description:
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2018/9/27 18:07
 */
public class UpdateFirewallAttributeTest {
    private UnetClient client;

    private UpdateFirewallAttributeParam param;

    @Before
    public void initData() {
        client = new DefaultUnetClient(new UnetConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));

        param = new UpdateFirewallAttributeParam("cn-sh2", "fwId");
        param.setProjectId("org-4nfe1i");
    }

    @Test
    public void updateFirewallAttribute() {
        try {
            UpdateFirewallAttributeResult allocateEIPResult = client.updateFirewallAttribute(param);
            System.out.println(allocateEIPResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
