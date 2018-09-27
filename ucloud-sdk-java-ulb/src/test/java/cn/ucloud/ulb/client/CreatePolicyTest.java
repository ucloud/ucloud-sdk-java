package cn.ucloud.ulb.client;

import cn.ucloud.ulb.client.DefaultULBClient;
import cn.ucloud.ulb.client.ULBClient;
import cn.ucloud.ulb.model.CreatePolicyParam;
import cn.ucloud.ulb.model.CreatePolicyResult;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.ulb.pojo.ULBConfig;
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
                        System.getenv("UcloudPublicKey"))));
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