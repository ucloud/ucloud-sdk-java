package cn.ucloud.umem.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.umem.model.ResizeURedisGroupParam;
import cn.ucloud.umem.model.ResizeURedisGroupResult;
import cn.ucloud.umem.pojo.UMEMConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;


/**
 * @Description : UMEM.ResizeURedisGroup 测试
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-15 10:00
 **/
public class ResizeURedisGroupTest {

    private UMEMClient client;

    private ResizeURedisGroupParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultUMEMClient(new UMEMConfig(
                new Account(System.getenv("UCloudPrivateKey"),
                        System.getenv("UCloudPublicKey"))));
        String region = "cn-sh2";
        String groupId = "uredis-pgouk5n1";
        Integer size = 2;
        param = new ResizeURedisGroupParam(region, groupId, size);
        param.setProjectId("org-izug1m");
    }


    @Test
    public void resizeURedisGroup() {
        try {
            ResizeURedisGroupResult result = client.resizeURedisGroup(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

}