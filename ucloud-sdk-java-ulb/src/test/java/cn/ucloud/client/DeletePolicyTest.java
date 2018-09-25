package cn.ucloud.client;

import cn.ucloud.model.DeletePolicyParam;
import cn.ucloud.model.DeletePolicyResult;
import cn.ucloud.pojo.Account;
import cn.ucloud.pojo.ULBConfig;
import org.junit.Before;
import org.junit.Test;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-19 18:50
 **/
public class DeletePolicyTest {


    private ULBClient client;

    private DeletePolicyParam param;

    @Before
    public void initData() {
        client = new DefaultULBClient(new ULBConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        param = new DeletePolicyParam("cn-bj2","b5e76c15-ab56-4cf4-8c7c-45defa2302bf");
        param.setProjectId("org-4nfe1i");
    }

    @Test
    public void deletePolicy() {
        try {
            DeletePolicyResult deletePolicyResult = client.deletePolicy(param);
            System.out.println(deletePolicyResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}