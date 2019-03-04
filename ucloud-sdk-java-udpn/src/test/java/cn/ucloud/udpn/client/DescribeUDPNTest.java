package cn.ucloud.udpn.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.common.pojo.UcloudConfig;
import cn.ucloud.udpn.model.DescribeUDPNParam;
import cn.ucloud.udpn.model.DescribeUDPNResult;
import org.junit.Before;
import org.junit.Test;

/**
 * @description:
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2019-03-04 16:52
 */
public class DescribeUDPNTest {
    private UDPNClient client;

    private DescribeUDPNParam param;

    @Before
    public void initData() {
        client = new DefaultUDPNClient(new UcloudConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        param = new DescribeUDPNParam();
    }

    @Test
    public void describeUDPN() {
        try {
            DescribeUDPNResult describeUDPNResult = client.DescribeUDPN(param);
            System.out.println(describeUDPNResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
