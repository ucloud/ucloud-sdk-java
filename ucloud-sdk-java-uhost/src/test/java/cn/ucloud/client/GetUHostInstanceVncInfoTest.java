package cn.ucloud.client;

import cn.ucloud.handler.UcloudHandler;
import cn.ucloud.model.GetUhostInstanceVncInfoParam;
import cn.ucloud.model.GetUhostInstanceVncInfoResult;
import cn.ucloud.pojo.Account;
import cn.ucloud.pojo.BaseResponseResult;
import cn.ucloud.pojo.UhostConfig;
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
//        client = new DefaultUhostClient(new UhostConfig(
//                new Account(System.getenv("UcloudPrivateKey"),
//                        System.getenv("UcloudPublicKey"),
//                        System.getenv("UcloudPassword"))));
        client = new DefaultUhostClient(new UhostConfig(
                new Account("35e886746bec90eeac91523e4d01da45c2479403",
                        "ucloudfee.fei@ucloud.cn14289063750002081996226",
                        "feefei852")));
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

    @org.junit.Test
    public void getUHostInstanceVncInfoAsync() throws InterruptedException {
        client.getUHostInstanceVncInfoCallback(param, new UcloudHandler() {
            @Override
            public Object success(BaseResponseResult result) {
                System.out.println("同步回调：" + result);
                return null;
            }

            @Override
            public Object failed(BaseResponseResult result) {
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


        client.getUHostInstanceVncInfoCallback(param, new UcloudHandler() {
            @Override
            public Object success(BaseResponseResult result) {
                System.out.println("异步回调：" + result);
                return null;
            }

            @Override
            public Object failed(BaseResponseResult result) {
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