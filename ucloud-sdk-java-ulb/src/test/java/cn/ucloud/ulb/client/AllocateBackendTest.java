package cn.ucloud.ulb.client;

import cn.ucloud.ulb.client.DefaultULBClient;
import cn.ucloud.ulb.client.ULBClient;
import cn.ucloud.ulb.model.AllocateBackendParam;
import cn.ucloud.ulb.model.AllocateBackendResult;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.ulb.pojo.ULBConfig;
import org.junit.Before;
import org.junit.Test;

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
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        param = new AllocateBackendParam("cn-bj2","ulb-0kawkr","vserver-se0ay2",
                "UHost","uhost-zzsffd");
        param.setProjectId("org-4nfe1i");
    }


    @Test
    public void allocateBackend() {
        try {
            AllocateBackendResult allocateBackendResult = client.allocateBackend(param);
            System.out.println(allocateBackendResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}