package cn.ucloud.ulb.client;

import cn.ucloud.ulb.client.DefaultULBClient;
import cn.ucloud.ulb.client.ULBClient;
import cn.ucloud.ulb.model.UpdateBackendAttributeParam;
import cn.ucloud.ulb.model.UpdateBackendAttributeResult;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.ulb.pojo.ULBConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-19 17:43
 **/
public class UpdateBackendAttributeTest {

    private ULBClient client;

    private UpdateBackendAttributeParam param;

    @Before
    public void initData() {
        client = new DefaultULBClient(new ULBConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        param = new UpdateBackendAttributeParam("cn-sh2","ulb-wki4vn5g","backend-3ptzuqu3");
        param.setEnabled(1);
        param.setProjectId("org-izug1m");
    }

    @Test
    public void updateBackendAttribute() {
        try {
            UpdateBackendAttributeResult result = client.updateBackendAttribute(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }
}