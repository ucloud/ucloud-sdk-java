package cn.ucloud.client;

import cn.ucloud.model.GetUHostUpgradePriceParam;
import cn.ucloud.model.GetUHostUpgradePriceResult;
import cn.ucloud.pojo.Account;
import cn.ucloud.pojo.UhostConfig;
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
                        System.getenv("UcloudPublicKey"),
                        System.getenv("UcloudPassword"))));
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