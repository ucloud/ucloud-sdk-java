package cn.ucloud.ulb.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.ulb.model.CreateSSLParam;
import cn.ucloud.ulb.model.CreateSSLResult;
import cn.ucloud.ulb.pojo.ULBConfig;
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
        param.setPrivateKey("保持.key文件格式 注意保持换行");
        param.setSslContent("保持.crt文件格式 注意保持换行");
        param.setProjectId("org-4nfe1i");
    }



    @Test
    public void createSSL() {
        try {
            CreateSSLResult ssl = client.createSSL(param);
            System.out.println(ssl);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}