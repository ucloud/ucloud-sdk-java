package cn.ucloud.ulb.client;

import cn.ucloud.ulb.client.DefaultULBClient;
import cn.ucloud.ulb.client.ULBClient;
import cn.ucloud.ulb.model.UnbindSSLParam;
import cn.ucloud.ulb.model.UnbindSSLResult;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.ulb.pojo.ULBConfig;
import org.junit.Before;
import org.junit.Test;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-21 10:44
 **/
public class UnbindSSLTest {

    private ULBClient client;

    private UnbindSSLParam param;

    @Before
    public void initData() {
        client = new DefaultULBClient(new ULBConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        param = new UnbindSSLParam("cn-bj2","b5e76c15-ab56-4cf4-8c7c-45defa2302bf","vserverid","sslid");
        param.setProjectId("org-4nfe1i");
    }

    @Test
    public void unbindSSL() {
        // todo 测试
        try {
            UnbindSSLResult unbindSSLResult = client.unbindSSL(param);
            System.out.println(unbindSSLResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}