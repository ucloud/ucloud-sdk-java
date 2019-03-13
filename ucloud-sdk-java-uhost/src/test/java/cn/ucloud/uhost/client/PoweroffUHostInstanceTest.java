package cn.ucloud.uhost.client;

import cn.ucloud.uhost.client.DefaultUhostClient;
import cn.ucloud.uhost.client.UhostClient;
import cn.ucloud.uhost.model.PoweroffUHostInstanceParam;
import cn.ucloud.uhost.model.PoweroffUHostInstanceResult;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.uhost.pojo.UhostConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-18 15:17
 **/
public class PoweroffUHostInstanceTest {


    private UhostClient client;

    private PoweroffUHostInstanceParam param;

    @Before
    public void initData() {
        client = new DefaultUhostClient(new UhostConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        param = new PoweroffUHostInstanceParam("cn-sh2","uhost-rjonwb2x");
        param.setProjectId("org-izug1m");
    }

    @Test
    public void poweroffUHostInstance() {
        try {
            PoweroffUHostInstanceResult result = client.poweroffUHostInstance(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }
}