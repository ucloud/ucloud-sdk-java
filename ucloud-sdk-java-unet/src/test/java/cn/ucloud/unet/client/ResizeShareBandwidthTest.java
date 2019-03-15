package cn.ucloud.unet.client;

import cn.ucloud.unet.model.ResizeShareBandwidthParam;
import cn.ucloud.unet.model.ResizeShareBandwidthResult;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.unet.pojo.UnetConfig;
import org.junit.Before;
import org.junit.Test;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-27 17:39
 **/
public class ResizeShareBandwidthTest {


    private UnetClient client;

    private ResizeShareBandwidthParam param;

    @Before
    public void initData() {
        client = new DefaultUnetClient(new UnetConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        param = new ResizeShareBandwidthParam("cn-sh2", 20, "bwshare-cybkx5q2");
    }

    @Test
    public void resizeShareBandwidth() {
        try {
            ResizeShareBandwidthResult resizeShareBandwidthResult = client.resizeShareBandwidth(param);
            JSONComparator.jsonComparator(resizeShareBandwidthResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}