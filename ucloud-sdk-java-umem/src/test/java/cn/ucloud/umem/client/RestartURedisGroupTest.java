package cn.ucloud.umem.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.umem.model.RestartURedisGroupParam;
import cn.ucloud.umem.model.RestartURedisGroupResult;
import cn.ucloud.umem.pojo.UMEMConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;


/**
 * @Description : UMEM.RestartURedisGroup 测试
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-15 10:00
 **/
public class RestartURedisGroupTest {

    private UMEMClient client;

    private RestartURedisGroupParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultUMEMClient(new UMEMConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        String region = "cn-sh2";
        String groupId = "cn-sh2";
        param = new RestartURedisGroupParam(region, groupId);
        param.setProjectId("org-izug1m");
    }


    @Test
    public void restartURedisGroup() {
        try {
            RestartURedisGroupResult result = client.restartURedisGroup(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

}