package cn.ucloud.udpn.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.udpn.model.ReleaseUDPNParam;
import cn.ucloud.udpn.model.ReleaseUDPNResult;
import cn.ucloud.udpn.pojo.UdpnConfig;
import org.junit.Before;
import org.junit.Test;

/**
 * @description:
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2019-03-04 16:52
 */
public class ReleaseUDPNTest {
    private UDPNClient client;

    private ReleaseUDPNParam param;

    @Before
    public void initData() {
        client = new DefaultUDPNClient(new UdpnConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        param = new ReleaseUDPNParam("udpn-5bst2lvo");
    }

    @Test
    public void releaseUDPN() {
        try {
            ReleaseUDPNResult ReleaseUDPNResult = client.ReleaseUDPN(param);
            System.out.println(ReleaseUDPNResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
