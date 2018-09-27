package cn.ucloud.client;

import cn.ucloud.model.ReleaseShareBandwidthParam;
import cn.ucloud.model.ReleaseShareBandwidthResult;
import cn.ucloud.pojo.Account;
import cn.ucloud.pojo.UnetConfig;
import org.junit.Before;
import org.junit.Test;

/**
 * @description:
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2018/9/27 18:12
 */
public class ReleaseShareBandwidthTest {
    private UnetClient client;

    private ReleaseShareBandwidthParam param;

    @Before
    public void initData() {
        client = new DefaultUnetClient(new UnetConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));

        param = new ReleaseShareBandwidthParam("cn-sh2", "shareBandwidthId",2);
        param.setProjectId("org-4nfe1i");
    }

    @Test
    public void releaseShareBandwidth() {
        try {
            ReleaseShareBandwidthResult allocateEIPResult = client.releaseShareBandwidth(param);
            System.out.println(allocateEIPResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
