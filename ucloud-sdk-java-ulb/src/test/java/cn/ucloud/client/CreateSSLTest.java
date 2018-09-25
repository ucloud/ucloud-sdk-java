package cn.ucloud.client;

import cn.ucloud.model.CreateSSLParam;
import cn.ucloud.model.CreateSSLResult;
import cn.ucloud.pojo.Account;
import cn.ucloud.pojo.ULBConfig;
import org.junit.Before;
import org.junit.Test;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-20 09:47
 **/
public class CreateSSLTest {


    private ULBClient client;

    private CreateSSLParam param;

    @Before
    public void initData() {
        client = new DefaultULBClient(new ULBConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        param = new CreateSSLParam("cn-bj2","ssl-sdk-java-test");
        param.setPrivateKey("");
        param.setSslContent("");
        param.setProjectId("org-4nfe1i");
    }



    @Test
    public void createSSL() {
        // todo 测试
        try {
            CreateSSLResult ssl = client.createSSL(param);
            System.out.println(ssl);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}