package cn.ucloud.client;

import cn.ucloud.model.GetEIPPriceParam;
import cn.ucloud.model.GetEIPPriceResult;
import cn.ucloud.pojo.Account;
import cn.ucloud.pojo.UnetConfig;
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
        param = new GetEIPPriceParam("cn-bj2","Bgp",1);
        param.setProjectId("org-4nfe1i");
    }

    @Test
    public void getEIPPrice() {
        try {
            GetEIPPriceResult eipPrice = client.getEIPPrice(param);
            System.out.println(eipPrice);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}