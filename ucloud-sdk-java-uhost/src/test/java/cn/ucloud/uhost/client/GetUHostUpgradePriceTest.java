package cn.ucloud.uhost.client;

import cn.ucloud.uhost.client.DefaultUhostClient;
import cn.ucloud.uhost.client.UhostClient;
import cn.ucloud.uhost.model.GetUHostUpgradePriceParam;
import cn.ucloud.uhost.model.GetUHostUpgradePriceResult;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.uhost.pojo.UhostConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-18 18:00
 **/
public class GetUHostUpgradePriceTest {

    private UhostClient client;

    private GetUHostUpgradePriceParam param;

    @Before
    public void initData() {
        client = new DefaultUhostClient(new UhostConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        param = new GetUHostUpgradePriceParam("cn-sh2","uhost-rjonwb2x");
        param.setZone("cn-sh2-02");
        param.setProjectId("org-izug1m");
        param.setCpu(16);
    }
    @Test
    public void getUHostUpgradePrice() {
        try {
            GetUHostUpgradePriceResult result = client.getUHostUpgradePrice(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }
}