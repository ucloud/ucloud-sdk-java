package cn.ucloud.ulb.client;

import cn.ucloud.ulb.client.DefaultULBClient;
import cn.ucloud.ulb.client.ULBClient;
import cn.ucloud.ulb.model.UpdateVServerAttributeParam;
import cn.ucloud.ulb.model.UpdateVServerAttributeResult;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.ulb.pojo.ULBConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-19 14:46
 **/
public class UpdateVServerAttributeTest {


    private ULBClient client;

    private UpdateVServerAttributeParam param;

    @Before
    public void initData() {
        client = new DefaultULBClient(new ULBConfig(
                new Account(System.getenv("UCloudPrivateKey"),
                        System.getenv("UCloudPublicKey"))));
        param = new UpdateVServerAttributeParam("cn-sh2","ulb-wki4vn5g","vserver-whdrqoq0");
        param.setProjectId("org-izug1m");
        param.setVserverName("jjj");
    }


    @Test
    public void updateVServerAttribute() {
        try {
            UpdateVServerAttributeResult result = client.updateVServerAttribute(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }
}