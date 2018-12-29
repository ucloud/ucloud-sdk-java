package cn.ucloud.ulb.client;

import cn.ucloud.ulb.client.DefaultULBClient;
import cn.ucloud.ulb.client.ULBClient;
import cn.ucloud.ulb.model.DeleteVServerParam;
import cn.ucloud.ulb.model.DeleteVServerResult;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.ulb.pojo.ULBConfig;
import org.junit.Before;
import org.junit.Test;

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
        param = new DeleteVServerParam("cn-bj2","ulb-0kawkr","vserver-02n1ot");
        param.setProjectId("org-4nfe1i");
    }

    @Test
    public void deleteVServer() {
        try {
            DeleteVServerResult deleteVServerResult = client.deleteVServer(param);
            System.out.println(deleteVServerResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}