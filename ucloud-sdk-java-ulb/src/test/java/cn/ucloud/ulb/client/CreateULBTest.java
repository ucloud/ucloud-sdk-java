package cn.ucloud.ulb.client;

import cn.ucloud.ulb.model.CreateULBParam;
import cn.ucloud.ulb.model.CreateULBResult;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.ulb.pojo.ULBConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-19 09:57
 **/
public class CreateULBTest {

    private ULBClient client;

    private CreateULBParam param;

    @Before
    public void initData() {
        client = new DefaultULBClient(new ULBConfig(
                new Account(System.getenv("UCloudPrivateKey"),
                        System.getenv("UCloudPublicKey"))));
        param = new CreateULBParam("cn-sh2");
        param.setProjectId("org-izug1m");
        param.setTag("sdk-java-test");
    }


    @Test
    public void createULB() {
        try {
            CreateULBResult result = client.createULB(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }
}