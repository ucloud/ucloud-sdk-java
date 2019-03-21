package cn.ucloud.ulb.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.ulb.model.BindSSLParam;
import cn.ucloud.ulb.model.BindSSLResult;
import cn.ucloud.ulb.pojo.ULBConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;

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
                new Account(System.getenv("UCloudPrivateKey"),
                        System.getenv("UCloudPublicKey"))));
        param = new BindSSLParam("cn-sh2","ulb-wki4vn5g","vserver-sfhly4db","ssl-r2bxbf");
        param.setProjectId("org-izug1m");
    }

    @Test
    public void bindSSL() {
        try {
            BindSSLResult result = client.bindSSL(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }
}