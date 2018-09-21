package cn.ucloud.client;

import cn.ucloud.model.DeletePolicyGroupParam;
import cn.ucloud.model.DeletePolicyGroupResult;
import cn.ucloud.pojo.Account;
import cn.ucloud.pojo.ULBConfig;
import org.junit.Before;
import org.junit.Test;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-21 10:21
 **/
public class DeletePolicyGroupTest {

    private ULBClient client;

    private DeletePolicyGroupParam param;

    @Before
    public void initData() {
        client = new DefaultULBClient(new ULBConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"),
                        System.getenv("UcloudPassword"))));
        param = new DeletePolicyGroupParam("cn-bj2","b5e76c15-ab56-4cf4-8c7c-45defa2302bf");
        param.setProjectId("org-4nfe1i");
    }

    @Test
    public void deletePolicyGroup() {
        // todo 测试
        try {
            DeletePolicyGroupResult deletePolicyGroupResult = client.deletePolicyGroup(param);
            System.out.println(deletePolicyGroupResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}