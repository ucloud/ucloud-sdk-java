package cn.ucloud.ulb.client;

import cn.ucloud.ulb.client.DefaultULBClient;
import cn.ucloud.ulb.client.ULBClient;
import cn.ucloud.ulb.model.DeleteSSLParam;
import cn.ucloud.ulb.model.DeleteSSLResult;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.ulb.pojo.ULBConfig;
import org.junit.Before;
import org.junit.Test;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-21 10:41
 **/
public class DeleteSSLTest {

    private ULBClient client;

    private DeleteSSLParam param;

    @Before
    public void initData() {
        client = new DefaultULBClient(new ULBConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        param = new DeleteSSLParam("cn-bj2","b5e76c15-ab56-4cf4-8c7c-45defa2302bf");
        param.setProjectId("org-4nfe1i");
    }

    @Test
    public void deleteSSL() {
        // todo 测试
        try {
            DeleteSSLResult deleteSSLResult = client.deleteSSL(param);
            System.out.println(deleteSSLResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}