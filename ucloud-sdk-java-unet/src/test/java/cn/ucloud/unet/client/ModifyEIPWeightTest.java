package cn.ucloud.unet.client;

import cn.ucloud.unet.model.ModifyEIPWeightParam;
import cn.ucloud.unet.model.ModifyEIPWeightResult;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.unet.pojo.UnetConfig;
import org.junit.Before;
import org.junit.Test;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-27 12:27
 **/
public class ModifyEIPWeightTest {

    private UnetClient client;

    private ModifyEIPWeightParam param;

    @Before
    public void initData() {
        client = new DefaultUnetClient(new UnetConfig(
                new Account(System.getenv("UCloudPrivateKey"),
                        System.getenv("UCloudPublicKey"))));
        param = new ModifyEIPWeightParam("cn-bj2", "eip-vcsnbgi4", 100);
    }

    @Test
    public void modifyEIPBandwidth() {
        try {
            ModifyEIPWeightResult modifyEIPWeightResult = client.modifyEIPWeight(param);
            JSONComparator.jsonComparator(modifyEIPWeightResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}