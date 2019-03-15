package cn.ucloud.ulb.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.ulb.model.DeleteSSLParam;
import cn.ucloud.ulb.model.DeleteSSLResult;
import cn.ucloud.ulb.pojo.ULBConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;

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
        param = new DeleteSSLParam("cn-bj2","ssl-2ynhbu");
        param.setProjectId("org-4nfe1i");
    }

    @Test
    public void deleteSSL() {
        try {
            DeleteSSLResult result = client.deleteSSL(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }
}