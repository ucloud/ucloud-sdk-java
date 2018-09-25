package cn.ucloud.client;

import cn.ucloud.model.GetUHostInstancePriceParam;
import cn.ucloud.model.GetUHostInstancePriceResult;
import cn.ucloud.pojo.Account;
import cn.ucloud.pojo.UhostConfig;
import org.junit.Before;
import org.junit.Test;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-18 11:43
 **/
public class GetUHostInstancePriceTest {

    private UhostClient client;

    private GetUHostInstancePriceParam param;

    @Before
    public void initData() {
        client = new DefaultUhostClient(new UhostConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        // uimage-cjswb5 ubuntu 16.04
        param = new GetUHostInstancePriceParam("cn-bj2","uimage-cjswb5",2,2048,2);
    }

    @Test
    public void getUHostInstancePrice() {
        try {
            GetUHostInstancePriceResult uHostInstancePrice = client.getUHostInstancePrice(param);
            System.out.println(uHostInstancePrice);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}