package cn.ucloud.unet.client;

import cn.ucloud.unet.model.ReleaseVIPParam;
import cn.ucloud.unet.model.ReleaseVIPResult;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.unet.pojo.UnetConfig;
import org.junit.Before;
import org.junit.Test;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-27 15:14
 **/
public class ReleaseVIPTest {

    private UnetClient client;

    private ReleaseVIPParam param;

    @Before
    public void initData() {
        client = new DefaultUnetClient(new UnetConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        param = new ReleaseVIPParam("cn-sh2", "vip-utxslh2t");
    }

    @Test
    public void releaseVIP() {
        try {
            ReleaseVIPResult releaseVIPResult = client.releaseVIP(param);
            System.out.println(releaseVIPResult);
            JSONComparator.jsonComparator(releaseVIPResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}