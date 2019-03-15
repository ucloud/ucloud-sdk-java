package cn.ucloud.ulb.client;

import cn.ucloud.ulb.client.DefaultULBClient;
import cn.ucloud.ulb.client.ULBClient;
import cn.ucloud.ulb.model.DeleteVServerParam;
import cn.ucloud.ulb.model.DeleteVServerResult;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.ulb.pojo.ULBConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-19 14:26
 **/
public class DeleteVServerTest {

    private ULBClient client;

    private DeleteVServerParam param;

    @Before
    public void initData() {
        client = new DefaultULBClient(new ULBConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        param = new DeleteVServerParam("cn-sh2","ulb-wki4vn5g","vserver-whdrqoq0");
        param.setProjectId("org-izug1m");
    }

    @Test
    public void deleteVServer() {
        try {
            DeleteVServerResult result = client.deleteVServer(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }
}