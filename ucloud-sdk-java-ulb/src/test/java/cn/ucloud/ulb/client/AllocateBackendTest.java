package cn.ucloud.ulb.client;

import cn.ucloud.ulb.client.DefaultULBClient;
import cn.ucloud.ulb.client.ULBClient;
import cn.ucloud.ulb.model.AllocateBackendParam;
import cn.ucloud.ulb.model.AllocateBackendResult;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.ulb.pojo.ULBConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-19 15:03
 **/
public class AllocateBackendTest {


    private ULBClient client;

    private AllocateBackendParam param;

    @Before
    public void initData() {
        client = new DefaultULBClient(new ULBConfig(
                new Account(System.getenv("UCloudPrivateKey"),
                        System.getenv("UCloudPublicKey"))));
        param = new AllocateBackendParam("cn-sh2","ulb-wki4vn5g","vserver-sfhly4db",
                "UHost","uhost-dwomflqt");
        param.setProjectId("org-izug1m");
    }


    @Test
    public void allocateBackend() {
        try {
            AllocateBackendResult result = client.allocateBackend(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }
}