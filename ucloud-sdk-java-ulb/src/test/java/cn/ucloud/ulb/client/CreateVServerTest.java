package cn.ucloud.ulb.client;

import cn.ucloud.ulb.client.DefaultULBClient;
import cn.ucloud.ulb.client.ULBClient;
import cn.ucloud.ulb.model.CreateVServerParam;
import cn.ucloud.ulb.model.CreateVServerResult;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.ulb.pojo.ULBConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;

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
        param = new CreateVServerParam("cn-sh2","ulb-wki4vn5g");
        param.setVserverName("sdk-java-vserver1");
        param.setProjectId("org-izug1m");
    }

    @Test
    public void createVServer() {
        try {
            CreateVServerResult result = client.createVServer(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }
}