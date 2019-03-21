package cn.ucloud.ulb.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.ulb.model.CreateSSLParam;
import cn.ucloud.ulb.model.CreateSSLResult;
import cn.ucloud.ulb.pojo.ULBConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-20 09:47
 **/
public class CreateSSLTest {


    private ULBClient client;

    private CreateSSLParam param;

    private String content = "";

    private String privateKey = "";

    @Before
    public void initData() {
        client = new DefaultULBClient(new ULBConfig(
                new Account(System.getenv("UCloudPrivateKey"),
                        System.getenv("UCloudPublicKey"))));
        param = new CreateSSLParam("cn-sh2","ssl-sdk-java-test");
        param.setPrivateKey(privateKey);
        param.setSslContent(content);
        param.setProjectId("org-izug1m");
    }



    @Test
    public void createSSL() {
        try {
            CreateSSLResult result= client.createSSL(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }
}