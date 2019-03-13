package cn.ucloud.uhost.client;

import cn.ucloud.uhost.model.ReinstallUHostInstanceParam;
import cn.ucloud.uhost.model.ReinstallUHostInstanceResult;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.uhost.pojo.UhostConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-18 17:18
 **/
public class ReinstallUHostInstanceTest {
    private UhostClient client;

    private ReinstallUHostInstanceParam param;

    @Before
    public void initData() {
        client = new DefaultUhostClient(new UhostConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        param = new ReinstallUHostInstanceParam("cn-sh2","uhost-rjonwb2x");
        param.setPassword("123456ab");
        param.setProjectId("org-izug1m");
    }
    @Test
    public void reinstallUHostInstance() {
        try {
            ReinstallUHostInstanceResult result = client.reinstallUHostInstance(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }
}