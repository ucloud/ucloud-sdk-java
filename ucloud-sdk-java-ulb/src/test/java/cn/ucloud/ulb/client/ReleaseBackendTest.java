package cn.ucloud.ulb.client;

import cn.ucloud.ulb.client.DefaultULBClient;
import cn.ucloud.ulb.client.ULBClient;
import cn.ucloud.ulb.model.ReleaseBackendParam;
import cn.ucloud.ulb.model.ReleaseBackendResult;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.ulb.pojo.ULBConfig;
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