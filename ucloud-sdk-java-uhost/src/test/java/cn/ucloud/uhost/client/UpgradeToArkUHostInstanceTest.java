package cn.ucloud.uhost.client;

import cn.ucloud.uhost.client.DefaultUhostClient;
import cn.ucloud.uhost.client.UhostClient;
import cn.ucloud.uhost.model.UpgradeToArkUHostInstanceParam;
import cn.ucloud.uhost.model.UpgradeToArkUHostInstanceResult;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.uhost.pojo.UhostConfig;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-18 18:48
 **/
public class UpgradeToArkUHostInstanceTest {


    private UhostClient client;

    private UpgradeToArkUHostInstanceParam param;

    @Before
    public void initData() {
        client = new DefaultUhostClient(new UhostConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        param = new UpgradeToArkUHostInstanceParam("cn-bj2","cn-bj2-02");
        param.setProjectId("org-4nfe1i");
        ArrayList<String> ids = new ArrayList<>();
        ids.add("uhost-zzsffd");
        param.setUhostIds(ids);
    }
    @Test
    public void upgradeToArkUHostInstance() {
        try {
            UpgradeToArkUHostInstanceResult upgradeToArkUHostInstanceResult = client.upgradeToArkUHostInstance(param);
            System.out.println(upgradeToArkUHostInstanceResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}