package cn.ucloud.umem.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.umem.model.ModifyURedisGroupNameParam;
import cn.ucloud.umem.model.ModifyURedisGroupNameResult;
import cn.ucloud.umem.pojo.UMEMConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;


/**
 * @Description : UMEM.ModifyURedisGroupName 测试
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-15 10:00
 **/
public class ModifyURedisGroupNameTest {

    private UMEMClient client;

    private ModifyURedisGroupNameParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultUMEMClient(new UMEMConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        String region = "cn-sh2";
        String groupId = "cn-sh2";
        String name = "cn-sh2";
        param = new ModifyURedisGroupNameParam(region, groupId, name);
        param.setProjectId("org-izug1m");
    }


    @Test
    public void modifyURedisGroupName() {
        try {
            ModifyURedisGroupNameResult result = client.modifyURedisGroupName(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

}