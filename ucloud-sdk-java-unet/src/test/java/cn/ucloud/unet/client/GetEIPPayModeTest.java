package cn.ucloud.unet.client;

import cn.ucloud.unet.model.GetEIPPayModeParam;
import cn.ucloud.unet.model.GetEIPPayModeResult;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.unet.pojo.UnetConfig;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-27 14:14
 **/
public class GetEIPPayModeTest {

    private UnetClient client;

    private GetEIPPayModeParam param;

    @Before
    public void initData() {
        client = new DefaultUnetClient(new UnetConfig(
                new Account(System.getenv("UCloudPrivateKey"),
                        System.getenv("UCloudPublicKey"))));
        param = new GetEIPPayModeParam("cn-sh2");
        List<String> ids = new ArrayList<>();
        ids.add("eip-vcsnbgi4");
        param.setEipIds(ids);
    }

    @Test
    public void getEIPPayMode() {
        try {
            GetEIPPayModeResult eipPayMode = client.getEIPPayMode(param);
            JSONComparator.jsonComparator(eipPayMode);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}