package cn.ucloud.umem.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.umem.model.DeleteUMemcacheGroupParam;
import cn.ucloud.umem.model.DeleteUMemcacheGroupResult;
import cn.ucloud.umem.pojo.UMEMConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;


/**
 * @Description : UMEM.DeleteUMemcacheGroup 测试
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-15 10:00
 **/
public class DeleteUMemcacheGroupTest {

    private UMEMClient client;

    private DeleteUMemcacheGroupParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultUMEMClient(new UMEMConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        String region = "cn-sh2";
        String groupId = "umemcache-tkal2r4b";
        param = new DeleteUMemcacheGroupParam(region, groupId);
        param.setProjectId("org-izug1m");
    }


    @Test
    public void deleteUMemcacheGroup() {
        try {
            DeleteUMemcacheGroupResult result = client.deleteUMemcacheGroup(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

}