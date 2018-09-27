package cn.ucloud.uhost.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.uhost.client.DefaultUhostClient;
import cn.ucloud.uhost.client.UhostClient;
import cn.ucloud.uhost.model.RebootUHostInstanceParam;
import cn.ucloud.uhost.model.RebootUHostInstanceResult;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.uhost.pojo.UhostConfig;
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
                        System.getenv("UcloudPublicKey"))));
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
         client.rebootUHostInstanceCallback(param, new UcloudHandler<RebootUHostInstanceResult>() {
            @Override
            public Object success(RebootUHostInstanceResult result) {
                System.out.println("success:"+result);
                return null;
            }

            @Override
            public Object failed(RebootUHostInstanceResult result) {
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