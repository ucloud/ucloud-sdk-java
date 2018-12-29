package cn.ucloud.uhost.client;

import cn.ucloud.uhost.client.DefaultUhostClient;
import cn.ucloud.uhost.client.UhostClient;
import cn.ucloud.uhost.model.TerminateUHostInstanceParam;
import cn.ucloud.uhost.model.TerminateUHostInstanceResult;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.uhost.pojo.UhostConfig;
import org.junit.Before;
import org.junit.Test;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-17 19:08
 **/
public class TerminateUHostInstanceTest {

    private UhostClient client;

    private TerminateUHostInstanceParam param;

    @Before
    public void initData() {
        client = new DefaultUhostClient(new UhostConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        param = new TerminateUHostInstanceParam("cn-bj2","uhost-1irm01");
    }



    @Test
    public void terminateUHostInstance() {
        try {
            TerminateUHostInstanceResult terminateUHostInstanceResult = client.terminateUHostInstance(param);
            System.out.println(terminateUHostInstanceResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}