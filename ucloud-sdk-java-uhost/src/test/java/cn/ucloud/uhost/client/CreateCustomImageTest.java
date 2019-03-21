package cn.ucloud.uhost.client;


import cn.ucloud.uhost.model.CreateCustomImageParam;
import cn.ucloud.uhost.model.CreateCustomImageResult;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.uhost.pojo.UhostConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-18 18:32
 **/
public class CreateCustomImageTest {

    private UhostClient client;

    private CreateCustomImageParam param;

    @Before
    public void initData() {
        client = new DefaultUhostClient(new UhostConfig(
                new Account(System.getenv("UCloudPrivateKey"),
                        System.getenv("UCloudPublicKey"))));
        param = new CreateCustomImageParam("cn-bj2","uhost-zzsffd","java-sdk-test");
        param.setProjectId("org-4nfe1i");
    }

    @Test
    public void createCustomImage() {
        try {
            CreateCustomImageResult result = client.createCustomImage(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }
}