package cn.ucloud.ulb.client;

import cn.ucloud.ulb.client.DefaultULBClient;
import cn.ucloud.ulb.client.ULBClient;
import cn.ucloud.ulb.model.ReleaseBackendParam;
import cn.ucloud.ulb.model.ReleaseBackendResult;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.ulb.pojo.ULBConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-19 15:17
 **/
public class ReleaseBackendTest {



    private ULBClient client;

    private ReleaseBackendParam param;

    @Before
    public void initData() {
        client = new DefaultULBClient(new ULBConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        param = new ReleaseBackendParam("cn-sh2", "ulb-wki4vn5g", "backend-iv1u4lvb");
        param.setProjectId("org-izug1m");
    }
    @Test
    public void releaseBackend() {
        try {
            ReleaseBackendResult result = client.releaseBackend(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }
}