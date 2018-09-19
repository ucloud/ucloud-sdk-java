package cn.ucloud.client;

import cn.ucloud.model.DeleteVServerParam;
import cn.ucloud.model.DeleteVServerResult;
import cn.ucloud.pojo.Account;
import cn.ucloud.pojo.ULBConfig;
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
                        System.getenv("UcloudPublicKey"),
                        System.getenv("UcloudPassword"))));
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