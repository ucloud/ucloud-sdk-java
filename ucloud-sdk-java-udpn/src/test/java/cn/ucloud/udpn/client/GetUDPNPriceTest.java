package cn.ucloud.udpn.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.udpn.model.GetUDPNPriceParam;
import cn.ucloud.udpn.model.GetUDPNPriceResult;
import cn.ucloud.udpn.pojo.UdpnConfig;
import org.junit.Before;
import org.junit.Test;

/**
 * @description:
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2019-03-04 16:52
 */
public class GetUDPNPriceTest {
    private UDPNClient client;

    private GetUDPNPriceParam param;

    @Before
    public void initData() {
        client = new DefaultUDPNClient(new UdpnConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        param = new GetUDPNPriceParam("cn-bj2", "cn-sh2", 2);
    }

    @Test
    public void getUDPNPrice() {
        try {
            GetUDPNPriceResult GetUDPNPriceResult = client.getUDPNPrice(param);
            System.out.println(GetUDPNPriceResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
