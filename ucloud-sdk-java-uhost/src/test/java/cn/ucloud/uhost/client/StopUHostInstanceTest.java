package cn.ucloud.uhost.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.uhost.model.StopUHostInstanceParam;
import cn.ucloud.uhost.model.StopUHostInstanceResult;
import cn.ucloud.uhost.pojo.UhostConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-17 14:25
 **/
public class StopUHostInstanceTest {

    private UhostClient client;

    private StopUHostInstanceParam param;

    @Before
    public void initData() {
        client = new DefaultUhostClient(new UhostConfig(
                new Account(System.getenv("UCloudPrivateKey"),
                        System.getenv("UCloudPublicKey"))));
        param = new StopUHostInstanceParam("cn-sh2", "uhost-rjonwb2x");
        param.setZone("cn-sh2-02");
        param.setProjectId("org-izug1m");
    }

    @Test
    public void stopUHostInstance() {
        try {
            StopUHostInstanceResult result = client.stopUHostInstance(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }
}