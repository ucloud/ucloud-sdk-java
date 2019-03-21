package cn.ucloud.ulb.client;

import cn.ucloud.ulb.client.DefaultULBClient;
import cn.ucloud.ulb.client.ULBClient;
import cn.ucloud.ulb.model.DeletePolicyParam;
import cn.ucloud.ulb.model.DeletePolicyResult;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.ulb.pojo.ULBConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;

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
                new Account(System.getenv("UCloudPrivateKey"),
                        System.getenv("UCloudPublicKey"))));
        param = new DeletePolicyParam("cn-sh2","2f738258-ccda-460a-83af-cb0d466f97bf");
        param.setProjectId("org-izug1m");
    }

    @Test
    public void deletePolicy() {
        try {
            DeletePolicyResult result = client.deletePolicy(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }
}