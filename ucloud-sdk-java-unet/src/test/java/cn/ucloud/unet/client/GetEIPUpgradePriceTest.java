package cn.ucloud.unet.client;

import cn.ucloud.unet.model.GetEIPUpgradePriceParam;
import cn.ucloud.unet.model.GetEIPUpgradePriceResult;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.unet.pojo.UnetConfig;
import org.junit.Before;
import org.junit.Test;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-27 13:57
 **/
public class GetEIPUpgradePriceTest {

    private UnetClient client;

    private GetEIPUpgradePriceParam param;

    @Before
    public void initData() {
        client = new DefaultUnetClient(new UnetConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        param = new GetEIPUpgradePriceParam("cn-sh2", "eip-vcsnbgi4", 10);
    }


    @Test
    public void getEIPUpgradePrice() {
        try {
            GetEIPUpgradePriceResult eipUpgradePrice = client.getEIPUpgradePrice(param);
            System.out.println(eipUpgradePrice);
            JSONComparator.jsonComparator(eipUpgradePrice);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}