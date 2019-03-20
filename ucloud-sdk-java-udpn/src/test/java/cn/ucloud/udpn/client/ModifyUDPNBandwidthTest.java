package cn.ucloud.udpn.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.udpn.model.ModifyUDPNBandwidthParam;
import cn.ucloud.udpn.model.ModifyUDPNBandwidthResult;
import cn.ucloud.udpn.pojo.UdpnConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;

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
        client = new DefaultUDPNClient(new UdpnConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        param = new ModifyUDPNBandwidthParam("udpn-111qalty", 3);
    }

    @Test
    public void modifyUDPNBandwidth() {
        try {
            ModifyUDPNBandwidthResult result = client.modifyUDPNBandwidth(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }
}
