package cn.ucloud.unet.client;

import cn.ucloud.unet.client.DefaultUnetClient;
import cn.ucloud.unet.client.UnetClient;
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
        param = new ResizeShareBandwidthParam("cn-bj2",20,"bwshare-4nma45");
        param.setProjectId("org-4nfe1i");
    }

    @Test
    public void resizeShareBandwidth() {
        try {
            ResizeShareBandwidthResult resizeShareBandwidthResult = client.resizeShareBandwidth(param);
            System.out.println(resizeShareBandwidthResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}