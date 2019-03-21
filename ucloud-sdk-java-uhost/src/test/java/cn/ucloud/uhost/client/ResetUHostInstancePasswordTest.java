package cn.ucloud.uhost.client;

import cn.ucloud.uhost.client.DefaultUhostClient;
import cn.ucloud.uhost.client.UhostClient;
import cn.ucloud.uhost.model.ResetUHostInstancePasswordParam;
import cn.ucloud.uhost.model.ResetUHostInstancePasswordResult;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.uhost.pojo.UhostConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-18 14:46
 **/
public class ResetUHostInstancePasswordTest {

    private UhostClient client;

    private ResetUHostInstancePasswordParam param;

    @Before
    public void initData() {
        client = new DefaultUhostClient(new UhostConfig(
                new Account(System.getenv("UCloudPrivateKey"),
                        System.getenv("UCloudPublicKey"))));
        param = new ResetUHostInstancePasswordParam("cn-sh2","uhost-rjonwb2x");
        param.setProjectId("org-izug1m");
        param.setPassword("123456ab");
    }
    @Test
    public void resetUHostInstancePassword() {
        try {
            ResetUHostInstancePasswordResult result = client.resetUHostInstancePassword(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }
}