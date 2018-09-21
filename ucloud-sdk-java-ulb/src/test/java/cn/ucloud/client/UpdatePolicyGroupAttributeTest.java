package cn.ucloud.client;

import cn.ucloud.model.UpdatePolicyGroupAttributeParam;
import cn.ucloud.model.UpdatePolicyGroupAttributeResult;
import cn.ucloud.pojo.Account;
import cn.ucloud.pojo.ULBConfig;
import org.junit.Before;
import org.junit.Test;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-21 10:29
 **/
public class UpdatePolicyGroupAttributeTest {

    private ULBClient client;

    private UpdatePolicyGroupAttributeParam param;

    @Before
    public void initData() {
        client = new DefaultULBClient(new ULBConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"),
                        System.getenv("UcloudPassword"))));
        param = new UpdatePolicyGroupAttributeParam("cn-bj2","aaa");
        param.setProjectId("org-4nfe1i");
        param.setGroupName("bbb");
    }

    @Test
    public void updatePolicyGroupAttribute() {
        // todo 测试
        try {
            UpdatePolicyGroupAttributeResult updatePolicyGroupAttributeResult = client.updatePolicyGroupAttribute(param);
            System.out.println(updatePolicyGroupAttributeResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}