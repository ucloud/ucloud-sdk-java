package cn.ucloud.client;

import cn.ucloud.model.TerminateUHostInstanceParam;
import cn.ucloud.model.TerminateUHostInstanceResult;
import cn.ucloud.pojo.Account;
import cn.ucloud.pojo.UhostConfig;
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
                        System.getenv("UcloudPublicKey"),
                        System.getenv("UcloudPassword"))));
        param = new TerminateUHostInstanceParam("cn-bj2","uhost-1irm01");
    }



    @Test
    public void terminateUHostInstance() {
        try {
            TerminateUHostInstanceResult terminateUHostInstanceResult = client.terminateUHostInstance(param);
            System.out.println(terminateUHostInstanceResult.getRetCode());
            System.out.println(terminateUHostInstanceResult.getAction());
            System.out.println(terminateUHostInstanceResult.getMessage());
            System.out.println(terminateUHostInstanceResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}