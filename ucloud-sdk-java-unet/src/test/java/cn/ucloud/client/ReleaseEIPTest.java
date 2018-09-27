package cn.ucloud.client;

import cn.ucloud.model.ReleaseEIPParam;
import cn.ucloud.model.ReleaseEIPResult;
import cn.ucloud.pojo.Account;
import cn.ucloud.pojo.UnetConfig;
import org.junit.Before;
import org.junit.Test;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-27 11:19
 **/
public class ReleaseEIPTest {


    private UnetClient client;

    private ReleaseEIPParam param;

    @Before
    public void initData() {
        client = new DefaultUnetClient(new UnetConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        param = new ReleaseEIPParam("cn-bj2","eip-asixq3");
        param.setProjectId("org-4nfe1i");
    }

    @Test
    public void releaseEIP() {
        try {
            ReleaseEIPResult releaseEIPResult = client.releaseEIP(param);
            System.out.println(releaseEIPResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}