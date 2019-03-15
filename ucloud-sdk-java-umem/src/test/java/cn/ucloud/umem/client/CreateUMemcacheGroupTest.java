package cn.ucloud.umem.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.umem.model.CreateUMemcacheGroupParam;
import cn.ucloud.umem.model.CreateUMemcacheGroupResult;
import cn.ucloud.umem.pojo.UMEMConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;


/**
 * @Description : UMEM.CreateUMemcacheGroup 测试
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-15 10:00
 **/
public class CreateUMemcacheGroupTest {

    private UMEMClient client;

    private CreateUMemcacheGroupParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultUMEMClient(new UMEMConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        String region = "cn-sh2";
        String name = "cn-sh2";
        param = new CreateUMemcacheGroupParam(region, name);
        param.setProjectId("org-izug1m");
    }


    @Test
    public void createUMemcacheGroup() {
        try {
            CreateUMemcacheGroupResult result = client.createUMemcacheGroup(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

}