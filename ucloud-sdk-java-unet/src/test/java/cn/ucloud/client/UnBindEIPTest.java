package cn.ucloud.client;

import cn.ucloud.model.UnBindEIPParam;
import cn.ucloud.model.UnBindEIPResult;
import cn.ucloud.pojo.Account;
import cn.ucloud.pojo.UnetConfig;
import org.junit.Before;
import org.junit.Test;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-27 11:56
 **/
public class UnBindEIPTest {

    private UnetClient client;

    private UnBindEIPParam param;

    @Before
    public void initData() {
        client = new DefaultUnetClient(new UnetConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        param = new UnBindEIPParam("cn-bj2","eip-44ayct","uhost","uhost-zzsffd");
        param.setProjectId("org-4nfe1i");
    }
    @Test
    public void unBindEIP() {
        try {
            UnBindEIPResult unBindEIPResult = client.unBindEIP(param);
            System.out.println(unBindEIPResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}