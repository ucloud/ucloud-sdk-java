package cn.ucloud.unet.client;

import cn.ucloud.unet.model.AllocateShareBandwidthParam;
import cn.ucloud.unet.model.AllocateShareBandwidthResult;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.unet.pojo.UnetConfig;
import org.junit.Before;
import org.junit.Test;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-27 16:47
 **/
public class AllocateShareBandwidthTest {

    private UnetClient client;

    private AllocateShareBandwidthParam param;

    @Before
    public void initData() {
        client = new DefaultUnetClient(new UnetConfig(
                new Account(System.getenv("UCloudPrivateKey"),
                        System.getenv("UCloudPublicKey"))));
        param = new AllocateShareBandwidthParam("cn-sh2", "ucloud-sdk-java-shareBandwidth", "Dynamic", 24);
    }

    @Test
    public void allocateShareBandwidth() {
        try {
            AllocateShareBandwidthResult allocateShareBandwidthResult = client.allocateShareBandwidth(param);
            JSONComparator.jsonComparator(allocateShareBandwidthResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}