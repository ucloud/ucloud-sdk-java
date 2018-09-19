package cn.ucloud.client;

import cn.ucloud.model.CreateVServerParam;
import cn.ucloud.model.CreateVServerResult;
import cn.ucloud.pojo.Account;
import cn.ucloud.pojo.ULBConfig;
import org.junit.Before;
import org.junit.Test;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-19 12:00
 **/
public class CreateVServerTest {

    private ULBClient client;

    private CreateVServerParam param;

    @Before
    public void initData() {
        client = new DefaultULBClient(new ULBConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"),
                        System.getenv("UcloudPassword"))));
        param = new CreateVServerParam("cn-bj2","ulb-0kawkr");
        param.setVserverName("sdk-java-vserver");
        param.setProjectId("org-4nfe1i");
    }

    @Test
    public void createVServer() {
        try {
            CreateVServerResult vServer = client.createVServer(param);
            System.out.println(vServer);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}