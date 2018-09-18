package cn.ucloud.client;

import cn.ucloud.handler.UcloudHandler;
import cn.ucloud.model.RebootUHostInstanceParam;
import cn.ucloud.model.RebootUHostInstanceResult;
import cn.ucloud.pojo.Account;
import cn.ucloud.pojo.BaseResponseResult;
import cn.ucloud.pojo.UhostConfig;
import org.junit.Before;
import org.junit.Test;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-14 18:17
 **/
public class RebootUhostInstanceTest {

    private UhostClient client ;

    private RebootUHostInstanceParam param;

    @Before
    public void  initData(){
        client = new DefaultUhostClient(new UhostConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"),
                        System.getenv("UcloudPassword"))));
        param = new RebootUHostInstanceParam("cn-bj2","uhost-k2spt1");
        param.setZone("cn-bj2-02");
        param.setProjectId("org-4nfe1i");
    }


    @Test
    public void rebootUHostInstance() {
        try {
            RebootUHostInstanceResult rebootUHostInstanceResult = client.rebootUHostInstance(param);
            System.out.println("同步："+rebootUHostInstanceResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void rebootUHostInstanceCallback() {
         client.rebootUHostInstanceCallback(param, new UcloudHandler() {
            @Override
            public Object success(BaseResponseResult result) {
                System.out.println("success:"+result);
                return null;
            }

            @Override
            public Object failed(BaseResponseResult result) {
                System.out.println("failed:"+result);
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