package cn.ucloud.unet.client;

import cn.ucloud.unet.model.ModifyEIPBandwidthParam;
import cn.ucloud.unet.model.ModifyEIPBandwidthResult;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.unet.pojo.UnetConfig;
import org.junit.Before;
import org.junit.Test;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-27 12:07
 **/
public class ModifyEIPBandwidthTest {

    private UnetClient client;

    private ModifyEIPBandwidthParam param;

    @Before
    public void initData() {
        client = new DefaultUnetClient(new UnetConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        param = new ModifyEIPBandwidthParam("cn-sh2", "eip-vcsnbgi4", 4);
    }

    @Test
    public void modifyEIPBandwidth() {
        try {
            ModifyEIPBandwidthResult modifyEIPBandwidthResult = client.modifyEIPBandwidth(param);
            JSONComparator.jsonComparator(modifyEIPBandwidthResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}