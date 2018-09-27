package cn.ucloud.uhost.client;

import cn.ucloud.uhost.client.DefaultUhostClient;
import cn.ucloud.uhost.client.UhostClient;
import cn.ucloud.uhost.model.ResetUHostInstancePasswordParam;
import cn.ucloud.uhost.model.ResetUHostInstancePasswordResult;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.uhost.pojo.UhostConfig;
import org.junit.Before;
import org.junit.Test;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-18 14:46
 **/
public class ResetUHostInstancePasswordTest {

    private UhostClient client;

    private ResetUHostInstancePasswordParam param;

    @Before
    public void initData() {
        client = new DefaultUhostClient(new UhostConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        param = new ResetUHostInstancePasswordParam("cn-bj2","uhost-uvzzyt");
        param.setProjectId("org-4nfe1i");
        param.setPassword("123456ab");
    }
    @Test
    public void resetUHostInstancePassword() {
        try {
            ResetUHostInstancePasswordResult resetUHostInstancePasswordResult = client.resetUHostInstancePassword(param);
            System.out.println(resetUHostInstancePasswordResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}