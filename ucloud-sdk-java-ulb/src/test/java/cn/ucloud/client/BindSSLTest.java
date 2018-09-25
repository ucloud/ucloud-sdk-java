package cn.ucloud.client;

import cn.ucloud.model.BindSSLParam;
import cn.ucloud.model.BindSSLResult;
import cn.ucloud.pojo.Account;
import cn.ucloud.pojo.ULBConfig;
import org.junit.Before;
import org.junit.Test;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-21 10:42
 **/
public class BindSSLTest {


    private ULBClient client;

    private BindSSLParam param;

    @Before
    public void initData() {
        client = new DefaultULBClient(new ULBConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        param = new BindSSLParam("cn-bj2","b5e76c15-ab56-4cf4-8c7c-45defa2302bf","vserverid","sslid");
        param.setProjectId("org-4nfe1i");
    }

    @Test
    public void bindSSL() {
        //todo 测试
        try {
            BindSSLResult bindSSLResult = client.bindSSL(param);
            System.out.println(bindSSLResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}