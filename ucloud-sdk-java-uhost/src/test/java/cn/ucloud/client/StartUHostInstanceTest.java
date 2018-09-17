package cn.ucloud.client;

import cn.ucloud.handler.UcloudHandler;
import cn.ucloud.model.StartUHostInstanceParam;
import cn.ucloud.model.StartUHostInstanceResult;
import cn.ucloud.pojo.Account;
import cn.ucloud.pojo.BaseResponseResult;
import cn.ucloud.pojo.UhostConfig;
import org.junit.Before;
import org.junit.Test;

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
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"),
                        System.getenv("UcloudPassword"))));
        param = new StartUHostInstanceParam("cn-bj2", "uhost-k2spt1");
        param.setZone("cn-bj2-02");
        param.setProjectId("org-4nfe1i");
    }


    @Test
    public void startUHostInstance() {
        try {
            StartUHostInstanceResult startUHostInstanceResult = client.startUHostInstance(param);
            System.out.println("同步：" + startUHostInstanceResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void startUHostInstanceCallback() throws InterruptedException {
        client.startUHostInstanceCallback(param, new UcloudHandler() {
            @Override
            public Object success(BaseResponseResult result) {
                System.out.println("success:" + result);
                return null;
            }

            @Override
            public Object failed(BaseResponseResult result) {
                System.out.println("failed:" + result);
                return null;
            }

            @Override
            public Object error(Exception e) {
                System.out.println(e.fillInStackTrace());
                return null;
            }
        });
        Thread.sleep(10 * 1000);
    }

}