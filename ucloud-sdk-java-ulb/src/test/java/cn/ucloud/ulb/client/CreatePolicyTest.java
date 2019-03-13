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

import static org.junit.Assert.assertNull;

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
        param = new CreatePolicyParam("cn-sh2","ulb-wki4vn5g","vserver-whdrqoq0","test");
        List<String> backendIds = new ArrayList<>();
        backendIds.add("backend-3ptzuqu3");
        param.setBackendIds(backendIds);
        param.setProjectId("org-izug1m");
    }
    @Test
    public void createPolicy() {
        try {
            CreatePolicyResult result = client.createPolicy(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }
}