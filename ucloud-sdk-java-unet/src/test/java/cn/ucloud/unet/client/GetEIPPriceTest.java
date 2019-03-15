package cn.ucloud.unet.client;

import cn.ucloud.unet.model.GetEIPPriceParam;
import cn.ucloud.unet.model.GetEIPPriceResult;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.unet.pojo.UnetConfig;
import org.junit.Before;
import org.junit.Test;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-27 13:39
 **/
public class GetEIPPriceTest {

    private UnetClient client;

    private GetEIPPriceParam param;

    @Before
    public void initData() {
        client = new DefaultUnetClient(new UnetConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        param = new GetEIPPriceParam("cn-sh2", "Bgp", 2);
    }

    @Test
    public void getEIPPrice() {
        try {
            GetEIPPriceResult eipPrice = client.getEIPPrice(param);
            System.out.println(eipPrice);
            JSONComparator.jsonComparator(eipPrice);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}