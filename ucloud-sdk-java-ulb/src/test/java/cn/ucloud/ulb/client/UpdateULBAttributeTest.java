package cn.ucloud.ulb.client;

import cn.ucloud.ulb.client.DefaultULBClient;
import cn.ucloud.ulb.client.ULBClient;
import cn.ucloud.ulb.model.UpdateULBAttributeParam;
import cn.ucloud.ulb.model.UpdateULBAttributeResult;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.ulb.pojo.ULBConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-19 11:45
 **/
public class UpdateULBAttributeTest {

    private ULBClient client;

    private UpdateULBAttributeParam param;

    @Before
    public void initData() {
        client = new DefaultULBClient(new ULBConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        param = new UpdateULBAttributeParam("cn-sh2","ulb-wki4vn5g");
        param.setName("codezhang-ulb");
        param.setProjectId("org-izug1m");
    }

    @Test
    public void updateULBAttribute() {
        try {
            UpdateULBAttributeResult result = client.updateULBAttribute(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }
}