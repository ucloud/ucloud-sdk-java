package cn.ucloud.client;

import cn.ucloud.model.AllocateVIPParam;
import cn.ucloud.model.AllocateVIPResult;
import cn.ucloud.pojo.Account;
import cn.ucloud.pojo.UnetConfig;
import org.junit.Before;
import org.junit.Test;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-27 15:04
 **/
public class AllocateVIPTest {

    private UnetClient client;

    private AllocateVIPParam param;

    @Before
    public void initData() {
        client = new DefaultUnetClient(new UnetConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        param = new AllocateVIPParam("cn-bj2","uvnet-qmrkj1","subnet-i0ab1k");
        param.setProjectId("org-4nfe1i");
    }

    @Test
    public void allocateVIP() {
        try {
            AllocateVIPResult allocateVIPResult = client.allocateVIP(param);
            System.out.println(allocateVIPResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}