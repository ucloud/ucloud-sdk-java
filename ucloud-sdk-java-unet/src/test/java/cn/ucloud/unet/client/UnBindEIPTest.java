package cn.ucloud.unet.client;

import cn.ucloud.unet.model.UnBindEIPParam;
import cn.ucloud.unet.model.UnBindEIPResult;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.unet.pojo.UnetConfig;
import org.junit.Before;
import org.junit.Test;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-27 11:56
 **/
public class UnBindEIPTest {

    private UnetClient client;

    private UnBindEIPParam param;

    @Before
    public void initData() {
        client = new DefaultUnetClient(new UnetConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        param = new UnBindEIPParam("cn-sh2", "eip-vcsnbgi4", "uhost", "uhost-dwomflqt");
    }
    @Test
    public void unBindEIP() {
        try {
            UnBindEIPResult unBindEIPResult = client.unBindEIP(param);
            JSONComparator.jsonComparator(unBindEIPResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}