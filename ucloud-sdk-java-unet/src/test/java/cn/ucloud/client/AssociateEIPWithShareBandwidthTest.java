package cn.ucloud.client;

import cn.ucloud.model.AssociateEIPWithShareBandwidthParam;
import cn.ucloud.model.AssociateEIPWithShareBandwidthResult;
import cn.ucloud.pojo.Account;
import cn.ucloud.pojo.UnetConfig;
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
        eipIds.add("eip-192.168.1.1");
        eipIds.add("eip-192.168.1.2");
        param = new AssociateEIPWithShareBandwidthParam("cn-sh2", "123", eipIds);
        param.setProjectId("org-4nfe1i");
    }

    @Test
    public void associateEIPWithShareBandwidth() {
        try {
            AssociateEIPWithShareBandwidthResult allocateEIPResult = client.associateEIPWithShareBandwidth(param);
            System.out.println(allocateEIPResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
