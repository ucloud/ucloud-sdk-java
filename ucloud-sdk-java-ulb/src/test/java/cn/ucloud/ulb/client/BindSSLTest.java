package cn.ucloud.ulb.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.ulb.model.BindSSLParam;
import cn.ucloud.ulb.model.BindSSLResult;
import cn.ucloud.ulb.pojo.ULBConfig;
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
        param = new BindSSLParam("cn-bj2","ulb-1gtyz4","vserver-asrpxv","ssl-r2bxbf");
        param.setProjectId("org-4nfe1i");
    }

    @Test
    public void bindSSL() {
        try {
            BindSSLResult bindSSLResult = client.bindSSL(param);
            System.out.println(bindSSLResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}