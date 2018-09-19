package cn.ucloud.client;

import cn.ucloud.model.UpdateBackendAttributeParam;
import cn.ucloud.model.UpdateBackendAttributeResult;
import cn.ucloud.pojo.Account;
import cn.ucloud.pojo.ULBConfig;
import org.junit.Before;
import org.junit.Test;

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
                        System.getenv("UcloudPublicKey"),
                        System.getenv("UcloudPassword"))));
        param = new UpdateBackendAttributeParam("cn-bj2","ulb-0kawkr","backend-bnifby");
        param.setEnabled(1);
        param.setProjectId("org-4nfe1i");
    }

    @Test
    public void updateBackendAttribute() {
        try {
            UpdateBackendAttributeResult updateBackendAttributeResult = client.updateBackendAttribute(param);
            System.out.println(updateBackendAttributeResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}