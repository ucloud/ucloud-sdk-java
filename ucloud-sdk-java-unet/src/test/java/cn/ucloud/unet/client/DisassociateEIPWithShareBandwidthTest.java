package cn.ucloud.unet.client;

import cn.ucloud.unet.client.DefaultUnetClient;
import cn.ucloud.unet.client.UnetClient;
import cn.ucloud.unet.model.DisassociateEIPWithShareBandwidthParam;
import cn.ucloud.unet.model.DisassociateEIPWithShareBandwidthResult;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.unet.pojo.UnetConfig;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2018/9/27 17:39
 */
public class DisassociateEIPWithShareBandwidthTest {
    private UnetClient client;

    private DisassociateEIPWithShareBandwidthParam param;

    @Before
    public void initData() {
        client = new DefaultUnetClient(new UnetConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));

        List<String> eipIds = new ArrayList<>();
        eipIds.add("eip-192.168.1.1");
        eipIds.add("eip-192.168.1.2");
        param = new DisassociateEIPWithShareBandwidthParam("cn-sh2", "123", 2);
        param.setEipIds(eipIds);
        param.setProjectId("org-4nfe1i");
    }

    @Test
    public void disassociateEIPWithShareBandwidth() {
        try {
            DisassociateEIPWithShareBandwidthResult allocateEIPResult = client.disassociateEIPWithShareBandwidth(param);
            System.out.println(allocateEIPResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
