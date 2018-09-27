package cn.ucloud.ulb.client;

import cn.ucloud.ulb.client.DefaultULBClient;
import cn.ucloud.ulb.client.ULBClient;
import cn.ucloud.ulb.model.CreatePolicyGroupParam;
import cn.ucloud.ulb.model.CreatePolicyGroupResult;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.ulb.pojo.ULBConfig;
import org.junit.Before;
import org.junit.Test;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-21 09:58
 **/
public class CreatePolicyGroupTest {
    private ULBClient client;

    private CreatePolicyGroupParam param;

    @Before
    public void initData() {
        client = new DefaultULBClient(new ULBConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        param = new CreatePolicyGroupParam("cn-bj2");
        param.setGroupName("group-test-java-sdk");
        param.setProjectId("org-4nfe1i");
    }
    @Test
    public void createPolicyGroup() {
        // todo 测试 message='Service error and break'
        try {
            CreatePolicyGroupResult policyGroup = client.createPolicyGroup(param);
            System.out.println(policyGroup);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}