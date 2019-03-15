package cn.ucloud.unet.client;

import cn.ucloud.unet.model.AllocateVIPParam;
import cn.ucloud.unet.model.AllocateVIPResult;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.unet.pojo.UnetConfig;
import org.junit.Before;
import org.junit.Test;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-27 15:04
 **/
public class AllocateVIPTest {

    private UnetClient client;

    private AllocateVIPParam param;

    @Before
    public void initData() {
        client = new DefaultUnetClient(new UnetConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        param = new AllocateVIPParam("cn-sh2", "uvnet-3fy3r4", "subnet-orq0th");
    }

    @Test
    public void allocateVIP() {
        try {
            AllocateVIPResult allocateVIPResult = client.allocateVIP(param);
            JSONComparator.jsonComparator(allocateVIPResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}