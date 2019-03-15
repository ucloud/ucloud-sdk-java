package cn.ucloud.umem.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.umem.model.ResizeUMemcacheGroupParam;
import cn.ucloud.umem.model.ResizeUMemcacheGroupResult;
import cn.ucloud.umem.pojo.UMEMConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;


/**
 * @Description : UMEM.ResizeUMemcacheGroup 测试
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-15 10:00
 **/
public class ResizeUMemcacheGroupTest {

    private UMEMClient client;

    private ResizeUMemcacheGroupParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultUMEMClient(new UMEMConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        String region = "cn-sh2";
        String groupId = "cn-sh2";
        Integer size = 1;
        param = new ResizeUMemcacheGroupParam(region, groupId, size);
        param.setProjectId("org-izug1m");
    }


    @Test
    public void resizeUMemcacheGroup() {
        try {
            ResizeUMemcacheGroupResult result = client.resizeUMemcacheGroup(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

}