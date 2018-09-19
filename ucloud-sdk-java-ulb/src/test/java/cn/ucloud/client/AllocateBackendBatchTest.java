package cn.ucloud.client;

import cn.ucloud.model.AllocateBackendBatchParam;
import cn.ucloud.model.AllocateBackendBatchResult;
import cn.ucloud.pojo.Account;
import cn.ucloud.pojo.ULBConfig;
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
                        System.getenv("UcloudPublicKey"),
                        System.getenv("UcloudPassword"))));
        param = new AllocateBackendBatchParam("cn-bj2","ulb-0kawkr","vserver-se0ay2");
        param.setProjectId("org-4nfe1i");
        List<AllocateBackendBatchParam.Backend> backends = new ArrayList<>();
        AllocateBackendBatchParam.Backend backend1 = param.newBackend("uhost-zzsffd", "UHost","10.9.146.72");
        AllocateBackendBatchParam.Backend backend2 = param.newBackend("uhost-ewq1eu", "UHost","10.9.128.212");
        backends.add(backend1);
        backends.add(backend2);
        param.setBackends(backends);
    }

    @Test
    public void allocateBackendBatch() {
        // todo 测试未通过
        try {
            AllocateBackendBatchResult allocateBackendBatchResult = client.allocateBackendBatch(param);
            System.out.println(allocateBackendBatchResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}