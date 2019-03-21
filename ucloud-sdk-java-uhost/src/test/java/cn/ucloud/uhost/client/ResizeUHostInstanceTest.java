package cn.ucloud.uhost.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.uhost.model.ResizeUHostInstanceParam;
import cn.ucloud.uhost.model.ResizeUHostInstanceResult;
import cn.ucloud.uhost.pojo.UhostConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-18 12:06
 **/
public class ResizeUHostInstanceTest {

    private UhostClient client;

    private ResizeUHostInstanceParam param;

    @Before
    public void initData() {
        client = new DefaultUhostClient(new UhostConfig(
                new Account(System.getenv("UCloudPrivateKey"),
                        System.getenv("UCloudPublicKey"))));
        // uimage-cjswb5 ubuntu 16.04
        //param = new ResizeUHostInstanceParam("cn-bj2","uhost-zzsffd");
        param = new ResizeUHostInstanceParam("cn-sh2", "uhost-rjonwb2x");
        param.setProjectId("org-izug1m");
        param.setCpu(2);
    }

    @Test
    public void resizeUHostInstance() {
        try {
            ResizeUHostInstanceResult result = client.resizeUHostInstance(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }
}