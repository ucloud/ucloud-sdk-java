package cn.ucloud.client;

import cn.ucloud.model.AllocateEIPParam;
import cn.ucloud.model.AllocateEIPResult;
import cn.ucloud.pojo.Account;
import cn.ucloud.pojo.UnetConfig;
import org.junit.Before;
import org.junit.Test;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-27 10:32
 **/
public class AllocateEIPTest {

    private UnetClient client;

    private AllocateEIPParam param;

    @Before
    public void initData() {
        client = new DefaultUnetClient(new UnetConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        param = new AllocateEIPParam("cn-bj2","Bgp",1);
        param.setProjectId("org-4nfe1i");
    }

    @Test
    public void allocateEIP() {
        try {
            AllocateEIPResult allocateEIPResult = client.allocateEIP(param);
            System.out.println(allocateEIPResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}