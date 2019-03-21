package cn.ucloud.udpn.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.udpn.model.GetUDPNUpgradePriceParam;
import cn.ucloud.udpn.model.GetUDPNUpgradePriceResult;
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
public class GetUDPNUpgradePriceTest {
    private UDPNClient client;

    private GetUDPNUpgradePriceParam param;

    @Before
    public void initData() {
        client = new DefaultUDPNClient(new UdpnConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        param = new GetUDPNUpgradePriceParam("udpn-5bst2lvo", 3);
    }

    @Test
    public void getUDPNUpgradePrice() {
        try {
            GetUDPNUpgradePriceResult result = client.getUDPNUpgradePrice(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }
}
