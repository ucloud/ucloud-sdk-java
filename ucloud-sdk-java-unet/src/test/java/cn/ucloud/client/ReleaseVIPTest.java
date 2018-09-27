package cn.ucloud.client;

import cn.ucloud.model.ReleaseVIPParam;
import cn.ucloud.model.ReleaseVIPResult;
import cn.ucloud.pojo.Account;
import cn.ucloud.pojo.UnetConfig;
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
        param = new ReleaseVIPParam("cn-bj2","vip-fafuny");
        param.setProjectId("org-4nfe1i");
    }

    @Test
    public void releaseVIP() {
        try {
            ReleaseVIPResult releaseVIPResult = client.releaseVIP(param);
            System.out.println(releaseVIPResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}