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

import static org.junit.Assert.assertNull;

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
                new Account(System.getenv("UCloudPrivateKey"),
                        System.getenv("UCloudPublicKey"))));
        param = new UpdatePolicyParam("cn-sh2","ulb-wki4vn5g","vserver-whdrqoq0",
                "4018f1b2-fea8-46d7-af23-4e999aa91139","test2");
        List<String> backendIds = new ArrayList<>();
        backendIds.add("backend-3ptzuqu3");
        param.setBackendIds(backendIds);
        param.setProjectId("org-izug1m");
    }

    @Test
    public void updatePolicy() {
        try {
            UpdatePolicyResult result = client.updatePolicy(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }
}