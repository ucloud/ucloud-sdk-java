package cn.ucloud.client;

import cn.ucloud.model.DeleteSSLParam;
import cn.ucloud.model.DeleteSSLResult;
import cn.ucloud.pojo.Account;
import cn.ucloud.pojo.ULBConfig;
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
                        System.getenv("UcloudPublicKey"),
                        System.getenv("UcloudPassword"))));
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