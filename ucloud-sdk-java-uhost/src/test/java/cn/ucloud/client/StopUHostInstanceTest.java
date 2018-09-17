package cn.ucloud.client;

import cn.ucloud.model.StopUHostInstanceParam;
import cn.ucloud.model.StopUHostInstanceResult;
import cn.ucloud.pojo.Account;
import cn.ucloud.pojo.UhostConfig;
import org.junit.Before;
import org.junit.Test;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-17 14:25
 **/
public class StopUHostInstanceTest {

    private UhostClient client;

    private StopUHostInstanceParam param;

    @Before
    public void initData() {
        client = new DefaultUhostClient(new UhostConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"),
                        System.getenv("UcloudPassword"))));
        param = new StopUHostInstanceParam("cn-bj2", "uhost-k2spt1");
        param.setZone("cn-bj2-02");
        param.setProjectId("org-4nfe1i");
    }

    @Test
    public void stopUHostInstance() {
        try {
            StopUHostInstanceResult stopUHostInstanceResult = client.stopUHostInstance(param);
            System.out.println("同步：" + stopUHostInstanceResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}