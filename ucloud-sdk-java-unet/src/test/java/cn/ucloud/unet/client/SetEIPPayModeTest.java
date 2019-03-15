package cn.ucloud.unet.client;

import cn.ucloud.unet.model.SetEIPPayModeParam;
import cn.ucloud.unet.model.SetEIPPayModeResult;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.unet.pojo.UnetConfig;
import org.junit.Before;
import org.junit.Test;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-27 14:31
 **/
public class SetEIPPayModeTest {

    private UnetClient client;

    private SetEIPPayModeParam param;

    @Before
    public void initData() {
        client = new DefaultUnetClient(new UnetConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        param = new SetEIPPayModeParam("cn-sh2", "eip-vcsnbgi4", "Traffic", 4);
    }

    @Test
    public void setEIPPayMode() {
        try {
            SetEIPPayModeResult setEIPPayModeResult = client.setEIPPayMode(param);
            JSONComparator.jsonComparator(setEIPPayModeResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}