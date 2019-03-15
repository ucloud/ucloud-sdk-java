package cn.ucloud.unet.client;

import cn.ucloud.unet.model.ReleaseShareBandwidthParam;
import cn.ucloud.unet.model.ReleaseShareBandwidthResult;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.unet.pojo.UnetConfig;
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

        param = new ReleaseShareBandwidthParam("cn-sh2", "bwshare-cybkx5q2", 4);
    }

    @Test
    public void releaseShareBandwidth() {
        try {
            ReleaseShareBandwidthResult allocateEIPResult = client.releaseShareBandwidth(param);
            System.out.println(allocateEIPResult);
            JSONComparator.jsonComparator(allocateEIPResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
