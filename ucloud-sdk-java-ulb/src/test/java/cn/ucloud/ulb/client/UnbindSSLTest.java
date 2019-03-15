package cn.ucloud.ulb.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.ulb.model.UnbindSSLParam;
import cn.ucloud.ulb.model.UnbindSSLResult;
import cn.ucloud.ulb.pojo.ULBConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;

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
        param = new UnbindSSLParam("cn-bj2","ulb-1gtyz4","vserver-asrpxv","ssl-r2bxbf");
        param.setProjectId("org-4nfe1i");
    }

    @Test
    public void unbindSSL() {
        try {
            UnbindSSLResult result = client.unbindSSL(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
           assertNull(e);
        }
    }
}