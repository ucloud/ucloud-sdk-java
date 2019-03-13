package cn.ucloud.ulb.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.ulb.model.AllocateBackendBatchParam;
import cn.ucloud.ulb.model.AllocateBackendBatchResult;
import cn.ucloud.ulb.pojo.ULBConfig;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertNull;

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
        param = new AllocateBackendBatchParam("cn-sh2","ulb-wki4vn5g","vserver-sfhly4db");
        param.setProjectId("org-izug1m");
        List<AllocateBackendBatchParam.Backend> backends = new ArrayList<>();
        AllocateBackendBatchParam.Backend backend1 =new  AllocateBackendBatchParam.Backend("uhost-dwomflqt", "UHost",80,1,"10.25.178.61");
        backends.add(backend1);
        param.setBackends(backends);
    }

    @Test
    public void allocateBackendBatch() {
        try {
            AllocateBackendBatchResult result = client.allocateBackendBatch(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }
}