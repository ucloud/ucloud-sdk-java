package cn.ucloud.unet.client;

import cn.ucloud.unet.model.BindEIPParam;
import cn.ucloud.unet.model.BindEIPResult;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.unet.pojo.UnetConfig;
import org.junit.Before;
import org.junit.Test;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-27 11:32
 **/
public class BindEIPTest {

    private UnetClient client;

    private BindEIPParam param;

    @Before
    public void initData() {
        client = new DefaultUnetClient(new UnetConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        param = new BindEIPParam("cn-sh2", "eip-vcsnbgi4", "uhost", "uhost-dwomflqt");
    }

    @Test
    public void bindEIP() {
        try {
            BindEIPResult bindEIPResult = client.bindEIP(param);
            System.out.println(bindEIPResult);
            JSONComparator.jsonComparator(bindEIPResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}