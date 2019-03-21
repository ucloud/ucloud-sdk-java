package cn.ucloud.umem.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.umem.model.ModifyUMemcacheGroupNameParam;
import cn.ucloud.umem.model.ModifyUMemcacheGroupNameResult;
import cn.ucloud.umem.pojo.UMEMConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;


/**
 * @Description : UMEM.ModifyUMemcacheGroupName 测试
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-15 10:00
 **/
public class ModifyUMemcacheGroupNameTest {

    private UMEMClient client;

    private ModifyUMemcacheGroupNameParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultUMEMClient(new UMEMConfig(
                new Account(System.getenv("UCloudPrivateKey"),
                        System.getenv("UCloudPublicKey"))));
        String region = "cn-sh2";
        String groupId = "umemcache-x1xxnxra";
        String name = "rename-umem";
        param = new ModifyUMemcacheGroupNameParam(region, groupId, name);
        param.setProjectId("org-izug1m");
    }


    @Test
    public void modifyUMemcacheGroupName() {
        try {
            ModifyUMemcacheGroupNameResult result = client.modifyUMemcacheGroupName(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

}