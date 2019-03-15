package cn.ucloud.unet.client;

import cn.ucloud.unet.model.AssociateEIPWithShareBandwidthParam;
import cn.ucloud.unet.model.AssociateEIPWithShareBandwidthResult;
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
public class AssociateEIPWithShareBandwidthTest {
    private UnetClient client;

    private AssociateEIPWithShareBandwidthParam param;

    @Before
    public void initData() {
        client = new DefaultUnetClient(new UnetConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));

        List<String> eipIds = new ArrayList<>();
        eipIds.add("eip-vcsnbgi4");
        eipIds.add("eip-243oe1tx");
        param = new AssociateEIPWithShareBandwidthParam("cn-sh2", "bwshare-cybkx5q2", eipIds);
    }

    @Test
    public void associateEIPWithShareBandwidth() {
        try {
            AssociateEIPWithShareBandwidthResult allocateEIPResult = client.associateEIPWithShareBandwidth(param);
            System.out.println(allocateEIPResult);
            JSONComparator.jsonComparator(allocateEIPResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
