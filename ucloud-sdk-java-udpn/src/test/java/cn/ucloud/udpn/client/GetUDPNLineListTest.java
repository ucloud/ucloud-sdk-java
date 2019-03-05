package cn.ucloud.udpn.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.udpn.model.GetUDPNLineListParam;
import cn.ucloud.udpn.model.GetUDPNLineListResult;
import cn.ucloud.udpn.pojo.UdpnConfig;
import org.junit.Before;
import org.junit.Test;

/**
 * @description:
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2019-03-04 16:52
 */
public class GetUDPNLineListTest {
    private UDPNClient client;

    private GetUDPNLineListParam param;

    @Before
    public void initData() {
        client = new DefaultUDPNClient(new UdpnConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        param = new GetUDPNLineListParam();
    }

    @Test
    public void getUDPNLineList() {
        try {
            GetUDPNLineListResult GetUDPNLineListResult = client.GetUDPNLineList(param);
            System.out.println(GetUDPNLineListResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
