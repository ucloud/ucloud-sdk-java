package cn.ucloud.client;

import cn.ucloud.model.ModifyEIPWeightParam;
import cn.ucloud.model.ModifyEIPWeightResult;
import cn.ucloud.pojo.Account;
import cn.ucloud.pojo.UnetConfig;
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
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        param = new ModifyEIPWeightParam("cn-bj2","eip-44ayct",100);
        param.setProjectId("org-4nfe1i");
    }

    @Test
    public void modifyEIPBandwidth() {
        try {
            ModifyEIPWeightResult modifyEIPWeightResult = client.modifyEIPWeight(param);
            System.out.println(modifyEIPWeightResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}