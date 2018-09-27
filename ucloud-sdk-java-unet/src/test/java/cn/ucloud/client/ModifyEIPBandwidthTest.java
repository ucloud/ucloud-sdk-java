package cn.ucloud.client;

import cn.ucloud.model.ModifyEIPBandwidthParam;
import cn.ucloud.model.ModifyEIPBandwidthResult;
import cn.ucloud.pojo.Account;
import cn.ucloud.pojo.UnetConfig;
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
        param = new ModifyEIPBandwidthParam("cn-bj2","eip-44ayct",1);
        param.setProjectId("org-4nfe1i");
    }

    @Test
    public void modifyEIPBandwidth() {
        try {
            ModifyEIPBandwidthResult modifyEIPBandwidthResult = client.modifyEIPBandwidth(param);
            System.out.println(modifyEIPBandwidthResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}