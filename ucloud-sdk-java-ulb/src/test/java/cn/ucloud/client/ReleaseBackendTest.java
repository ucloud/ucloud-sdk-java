package cn.ucloud.client;

import cn.ucloud.model.ReleaseBackendParam;
import cn.ucloud.model.ReleaseBackendResult;
import cn.ucloud.pojo.Account;
import cn.ucloud.pojo.ULBConfig;
import org.junit.Before;
import org.junit.Test;

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
        param = new ReleaseBackendParam("cn-bj2", "ulb-0kawkr", "backend-eo5qpv");
        param.setProjectId("org-4nfe1i");
    }
    @Test
    public void releaseBackend() {
        try {
            ReleaseBackendResult releaseBackendResult = client.releaseBackend(param);
            System.out.println(releaseBackendResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}