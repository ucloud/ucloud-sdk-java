package cn.ucloud.udpn.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.common.pojo.UcloudConfig;
import cn.ucloud.udpn.model.ModifyUDPNBandwidthParam;
import cn.ucloud.udpn.model.ModifyUDPNBandwidthResult;
import org.junit.Before;
import org.junit.Test;

/**
 * @description:
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2019-03-04 16:52
 */
public class ModifyUDPNBandwidthTest {
    private UDPNClient client;

    private ModifyUDPNBandwidthParam param;

    @Before
    public void initData() {
        client = new DefaultUDPNClient(new UcloudConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        param = new ModifyUDPNBandwidthParam("udpn-5bst2lvo", 3);
    }

    @Test
    public void modifyUDPNBandwidth() {
        try {
            ModifyUDPNBandwidthResult ModifyUDPNBandwidthResult = client.ModifyUDPNBandwidth(param);
            System.out.println(ModifyUDPNBandwidthResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
