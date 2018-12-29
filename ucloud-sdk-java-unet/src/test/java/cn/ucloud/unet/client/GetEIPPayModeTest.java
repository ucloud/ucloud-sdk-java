package cn.ucloud.unet.client;

import cn.ucloud.unet.client.DefaultUnetClient;
import cn.ucloud.unet.client.UnetClient;
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
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        param = new GetEIPPayModeParam("cn-bj2");
        List<String> ids = new ArrayList<>();
        ids.add("eip-44ayct");
        ids.add("eip-3gt54w");
        ids.add("eip-apyxhe");
        ids.add("eip-e3uptk");
        param.setEipIds(ids);
        param.setProjectId("org-4nfe1i");
    }


    @Test
    public void getEIPPayMode() {
        try {
            GetEIPPayModeResult eipPayMode = client.getEIPPayMode(param);
            System.out.println(eipPayMode);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}