package cn.ucloud.ulb.client;

import cn.ucloud.ulb.client.DefaultULBClient;
import cn.ucloud.ulb.client.ULBClient;
import cn.ucloud.ulb.model.UpdatePolicyParam;
import cn.ucloud.ulb.model.UpdatePolicyResult;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.ulb.pojo.ULBConfig;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-19 18:40
 **/
public class UpdatePolicyTest {

    private ULBClient client;


    private UpdatePolicyParam param;

    @Before
    public void initData() {
        client = new DefaultULBClient(new ULBConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        param = new UpdatePolicyParam("cn-bj2","ulb-0kawkr","vserver-se0ay2",
                "b5e76c15-ab56-4cf4-8c7c-45defa2302bf","test2");
        List<String> backendIds = new ArrayList<>();
        backendIds.add("backend-man2yu");
        param.setBackendIds(backendIds);
        param.setProjectId("org-4nfe1i");
    }

    @Test
    public void updatePolicy() {
        try {
            UpdatePolicyResult updatePolicyResult = client.updatePolicy(param);
            System.out.println(updatePolicyResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}