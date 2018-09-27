package cn.ucloud.uhost.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.uhost.client.DefaultUhostClient;
import cn.ucloud.uhost.client.UhostClient;
import cn.ucloud.uhost.model.GetUhostInstanceVncInfoParam;
import cn.ucloud.uhost.model.GetUhostInstanceVncInfoResult;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.uhost.pojo.UhostConfig;
import org.junit.Before;
import org.junit.Test;


/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-14 16:44
 **/
public class GetUHostInstanceVncInfoTest {

    private UhostClient client;

    private GetUhostInstanceVncInfoParam param;

    @Before
    public void initData() {
        client = new DefaultUhostClient(new UhostConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        param = new GetUhostInstanceVncInfoParam("cn-bj2", "uhost-euyi2b");
        param.setProjectId("org-4nfe1i");
        param.setZone("cn-bj2-02");
    }

    @Test
    public void getUHostInstanceVncInfo() {
        try {
            GetUhostInstanceVncInfoResult uHostInstanceVncInfo = client.getUHostInstanceVncInfo(param);
            System.out.println("同步：" + uHostInstanceVncInfo);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void getUHostInstanceVncInfoAsync() throws InterruptedException {
        client.getUHostInstanceVncInfoCallback(param, new UcloudHandler<GetUhostInstanceVncInfoResult> () {
            @Override
            public Object success(GetUhostInstanceVncInfoResult result) {
                System.out.println("同步回调：" + result);
                return null;
            }

            @Override
            public Object failed(GetUhostInstanceVncInfoResult result) {
                System.out.println("同步回调：" + result);
                return null;
            }

            @Override
            public Object error(Exception e) {
                System.out.println("同步回调：");
                e.printStackTrace();
                return null;
            }
        }, false);


        client.getUHostInstanceVncInfoCallback(param, new UcloudHandler<GetUhostInstanceVncInfoResult>(){
            @Override
            public Object success(GetUhostInstanceVncInfoResult result) {
                System.out.println("异步回调：" + result);
                return null;
            }

            @Override
            public Object failed(GetUhostInstanceVncInfoResult result) {
                System.out.println("异步回调：" + result);
                return null;
            }

            @Override
            public Object error(Exception e) {
                System.out.println("异步回调：");
                e.printStackTrace();
                return null;
            }
        }, true);

        Thread.sleep(10 * 1000);
    }
}