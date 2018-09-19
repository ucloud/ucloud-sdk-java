package cn.ucloud.client;

import cn.ucloud.model.CreatePolicyParam;
import cn.ucloud.model.CreatePolicyResult;
import cn.ucloud.pojo.Account;
import cn.ucloud.pojo.ULBConfig;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-19 18:05
 **/
public class CreatePolicyTest {

    private ULBClient client;

    private CreatePolicyParam param;

    @Before
    public void initData() {
        client = new DefaultULBClient(new ULBConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"),
                        System.getenv("UcloudPassword"))));
        param = new CreatePolicyParam("cn-bj2","ulb-0kawkr","vserver-se0ay2","test");
        List<String> backendIds = new ArrayList<>();
        backendIds.add("backend-man2yu");
        param.setBackendIds(backendIds);
        param.setProjectId("org-4nfe1i");
    }
    @Test
    public void createPolicy() {
        try {
            CreatePolicyResult policy = client.createPolicy(param);
            System.out.println(policy);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}