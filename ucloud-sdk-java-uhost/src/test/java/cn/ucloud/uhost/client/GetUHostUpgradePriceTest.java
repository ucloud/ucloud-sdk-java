package cn.ucloud.uhost.client;

import cn.ucloud.uhost.client.DefaultUhostClient;
import cn.ucloud.uhost.client.UhostClient;
import cn.ucloud.uhost.model.GetUHostUpgradePriceParam;
import cn.ucloud.uhost.model.GetUHostUpgradePriceResult;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.uhost.pojo.UhostConfig;
import org.junit.Before;
import org.junit.Test;

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
        param = new GetUHostUpgradePriceParam("cn-bj2","uhost-zzsffd");
        param.setProjectId("org-4nfe1i");
        param.setCpu(16);
    }
    @Test
    public void getUHostUpgradePrice() {
        try {
            GetUHostUpgradePriceResult uHostUpgradePrice = client.getUHostUpgradePrice(param);
            System.out.println(uHostUpgradePrice);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}