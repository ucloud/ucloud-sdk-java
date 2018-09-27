package cn.ucloud.ulb.client;

import cn.ucloud.ulb.client.DefaultULBClient;
import cn.ucloud.ulb.client.ULBClient;
import cn.ucloud.ulb.model.CreateVServerParam;
import cn.ucloud.ulb.model.CreateVServerResult;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.ulb.pojo.ULBConfig;
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
                        System.getenv("UcloudPublicKey"))));
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