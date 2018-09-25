package cn.ucloud.client;

import cn.ucloud.model.PoweroffUHostInstanceParam;
import cn.ucloud.model.PoweroffUHostInstanceResult;
import cn.ucloud.pojo.Account;
import cn.ucloud.pojo.UhostConfig;
import org.junit.Before;
import org.junit.Test;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-18 15:17
 **/
public class PoweroffUHostInstanceTest {


    private UhostClient client;

    private PoweroffUHostInstanceParam param;

    @Before
    public void initData() {
        client = new DefaultUhostClient(new UhostConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        param = new PoweroffUHostInstanceParam("cn-bj2","uhost-zzsffd");
        param.setProjectId("org-4nfe1i");
    }

    @Test
    public void poweroffUHostInstance() {
        try {
            PoweroffUHostInstanceResult poweroffUHostInstanceResult = client.poweroffUHostInstance(param);
            System.out.println(poweroffUHostInstanceResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}