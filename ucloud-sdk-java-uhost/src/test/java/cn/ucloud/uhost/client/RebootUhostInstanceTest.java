package cn.ucloud.uhost.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.uhost.model.RebootUHostInstanceParam;
import cn.ucloud.uhost.model.RebootUHostInstanceResult;
import cn.ucloud.uhost.pojo.UhostConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;

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
        param = new RebootUHostInstanceParam("cn-sh2","uhost-rjonwb2x");
        param.setZone("cn-sh2-02");
        param.setProjectId("org-izug1m");
    }


    @Test
    public void rebootUHostInstance() {
        try {
            RebootUHostInstanceResult result = client.rebootUHostInstance(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }
}