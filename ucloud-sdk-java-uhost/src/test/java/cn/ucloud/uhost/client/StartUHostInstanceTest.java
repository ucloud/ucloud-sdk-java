package cn.ucloud.uhost.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.uhost.model.StartUHostInstanceParam;
import cn.ucloud.uhost.model.StartUHostInstanceResult;
import cn.ucloud.uhost.pojo.UhostConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-14 16:42
 **/
public class StartUHostInstanceTest {

    private UhostClient client;

    private StartUHostInstanceParam param;

    @Before
    public void initData() {
        client = new DefaultUhostClient(new UhostConfig(
                new Account(System.getenv("UCloudPrivateKey"),
                        System.getenv("UCloudPublicKey"))));
        param = new StartUHostInstanceParam("cn-sh2", "uhost-rjonwb2x");
        param.setZone("cn-sh2-02");
        param.setProjectId("org-izug1m");
    }


    @Test
    public void startUHostInstance() {
        try {
            StartUHostInstanceResult result = client.startUHostInstance(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

    @Test
    public void startUHostInstanceCallback() throws InterruptedException {
        client.startUHostInstance(param, new UcloudHandler<StartUHostInstanceResult>() {
            @Override
            public Object success(StartUHostInstanceResult result) {
                System.out.println("success:" + result);
                return null;
            }

            @Override
            public Object failed(StartUHostInstanceResult result) {
                System.out.println("failed:" + result);
                return null;
            }

            @Override
            public Object error(Exception e) {
                System.out.println(e.fillInStackTrace());
                return null;
            }
        });
    }

}