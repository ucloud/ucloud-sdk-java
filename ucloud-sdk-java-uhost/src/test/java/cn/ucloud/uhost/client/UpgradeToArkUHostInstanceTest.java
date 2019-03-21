package cn.ucloud.uhost.client;

import cn.ucloud.uhost.client.DefaultUhostClient;
import cn.ucloud.uhost.client.UhostClient;
import cn.ucloud.uhost.model.UpgradeToArkUHostInstanceParam;
import cn.ucloud.uhost.model.UpgradeToArkUHostInstanceResult;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.uhost.pojo.UhostConfig;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertNull;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-18 18:48
 **/
public class UpgradeToArkUHostInstanceTest {


    private UhostClient client;

    private UpgradeToArkUHostInstanceParam param;

    @Before
    public void initData() {
        client = new DefaultUhostClient(new UhostConfig(
                new Account(System.getenv("UCloudPrivateKey"),
                        System.getenv("UCloudPublicKey"))));
        param = new UpgradeToArkUHostInstanceParam("cn-sh2","cn-sh2-02");
        param.setProjectId("org-izug1m");
        ArrayList<String> ids = new ArrayList<>();
        ids.add("uhost-rjonwb2x");
        param.setUhostIds(ids);
    }
    @Test
    public void upgradeToArkUHostInstance() {
        try {
            UpgradeToArkUHostInstanceResult result = client.upgradeToArkUHostInstance(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }
}