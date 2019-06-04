package cn.ucloud.uhost.client;

import cn.ucloud.uhost.client.DefaultUhostClient;
import cn.ucloud.uhost.client.UhostClient;
import cn.ucloud.uhost.model.TerminateUHostInstanceParam;
import cn.ucloud.uhost.model.TerminateUHostInstanceResult;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.uhost.pojo.UhostConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-17 19:08
 **/
public class TerminateUHostInstanceTest {

    private UhostClient client;

    private TerminateUHostInstanceParam param;

    @Before
    public void initData() {
        client = new DefaultUhostClient(new UhostConfig(
                new Account(System.getenv("UCloudPrivateKey"),
                        System.getenv("UCloudPublicKey"))));
        param = new TerminateUHostInstanceParam("cn-sh2","uhost-ohuswafh");
        param.setReleaseEIP(true);
        param.setReleaseUDisk(true);
    }



    @Test
    public void terminateUHostInstance() {
        try {
            TerminateUHostInstanceResult result = client.terminateUHostInstance(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }
}