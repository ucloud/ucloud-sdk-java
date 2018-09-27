package cn.ucloud.ulb.client;

import cn.ucloud.ulb.client.DefaultULBClient;
import cn.ucloud.ulb.client.ULBClient;
import cn.ucloud.ulb.model.AllocateBackendBatchParam;
import cn.ucloud.ulb.model.AllocateBackendBatchResult;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.ulb.pojo.ULBConfig;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-19 16:04
 **/
public class AllocateBackendBatchTest {

    private ULBClient client;

    private AllocateBackendBatchParam param;

    @Before
    public void initData() {
        client = new DefaultULBClient(new ULBConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        param = new AllocateBackendBatchParam("cn-bj2","ulb-0kawkr","vserver-se0ay2");
        param.setProjectId("org-4nfe1i");
        List<AllocateBackendBatchParam.Backend> backends = new ArrayList<>();
        AllocateBackendBatchParam.Backend backend1 =new  AllocateBackendBatchParam.Backend("uhost-zzsffd", "UHost","10.9.146.72");
        AllocateBackendBatchParam.Backend backend2 =new  AllocateBackendBatchParam.Backend("uhost-ewq1eu", "UHost","10.9.128.212");
        backends.add(backend1);
        backends.add(backend2);
        param.setBackends(backends);
    }

    @Test
    public void allocateBackendBatch() {
        // todo 测试
        try {
            AllocateBackendBatchResult allocateBackendBatchResult = client.allocateBackendBatch(param);
            System.out.println(allocateBackendBatchResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}