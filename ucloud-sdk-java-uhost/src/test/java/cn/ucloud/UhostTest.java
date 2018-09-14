package cn.ucloud;


import cn.ucloud.client.DefaultUhostClient;
import cn.ucloud.client.UhostClient;
import cn.ucloud.handler.UcloudHandler;
import cn.ucloud.model.GetUhostInstanceVncInfoParam;
import cn.ucloud.model.GetUhostInstanceVncInfoResult;
import cn.ucloud.pojo.Account;
import cn.ucloud.pojo.BaseResponseResult;
import cn.ucloud.pojo.UhostConfig;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-14 13:05
 **/
public class UhostTest {

    private UhostClient client;

    private GetUhostInstanceVncInfoParam param;

    @org.junit.Before
    public void  initData(){
        client = new DefaultUhostClient(new UhostConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"),
                        System.getenv("UcloudPassword"))));
        param = new GetUhostInstanceVncInfoParam();
        param.setProjectId("org-4nfe1i");
        param.setUhostId("uhost-euyi2b");
        param.setRegion("cn-bj2");
        param.setZone("cn-bj2-02");
    }

    @org.junit.Test
    public void getUHostInstanceVncInfo() {
        try {
            GetUhostInstanceVncInfoResult uHostInstanceVncInfo = client.getUHostInstanceVncInfo(param);
            System.out.println("同步："+uHostInstanceVncInfo);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @org.junit.Test
    public void getUHostInstanceVncInfoAsync() throws InterruptedException {
        client.getUHostInstanceVncInfoCallback(param, new UcloudHandler() {
            @Override
            public Object success(BaseResponseResult result) {
                System.out.println("同步回调："+result);
                return null;
            }

            @Override
            public Object failed(BaseResponseResult result) {
                System.out.println("同步回调："+result);
                return null;
            }

            @Override
            public Object error(Exception e) {
                System.out.println("同步回调：");
                e.printStackTrace();
                return null;
            }
        },false);


        client.getUHostInstanceVncInfoCallback(param, new UcloudHandler() {
            @Override
            public Object success(BaseResponseResult result) {
                System.out.println("异步回调："+result);
                return null;
            }

            @Override
            public Object failed(BaseResponseResult result) {
                System.out.println("异步回调："+result);
                return null;
            }

            @Override
            public Object error(Exception e) {
                System.out.println("异步回调：");
                e.printStackTrace();
                return null;
            }
        },true);

        Thread.sleep(10*1000);
    }
}