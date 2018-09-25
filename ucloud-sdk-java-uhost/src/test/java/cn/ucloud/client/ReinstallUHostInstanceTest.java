package cn.ucloud.client;

import cn.ucloud.model.ReinstallUHostInstanceParam;
import cn.ucloud.model.ReinstallUHostInstanceResult;
import cn.ucloud.pojo.Account;
import cn.ucloud.pojo.UhostConfig;
import org.junit.Before;
import org.junit.Test;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-18 17:18
 **/
public class ReinstallUHostInstanceTest {
    private UhostClient client;

    private ReinstallUHostInstanceParam param;

    @Before
    public void initData() {
        client = new DefaultUhostClient(new UhostConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        param = new ReinstallUHostInstanceParam("cn-bj2","uhost-zzsffd");
        param.setPassword("123456ab");
        param.setProjectId("org-4nfe1i");
    }
    @Test
    public void reinstallUHostInstance() {
        try {
            ReinstallUHostInstanceResult reinstallUHostInstanceResult = client.reinstallUHostInstance(param);
            System.out.println(reinstallUHostInstanceResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}