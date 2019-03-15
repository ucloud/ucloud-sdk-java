package cn.ucloud.umem.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.umem.model.ModifyURedisGroupPasswordParam;
import cn.ucloud.umem.model.ModifyURedisGroupPasswordResult;
import cn.ucloud.umem.pojo.UMEMConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;


/**
 * @Description : UMEM.ModifyURedisGroupPassword 测试
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-15 10:00
 **/
public class ModifyURedisGroupPasswordTest {

    private UMEMClient client;

    private ModifyURedisGroupPasswordParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultUMEMClient(new UMEMConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        String region = "cn-sh2";
        String groupId = "cn-sh2";
        String password = "cn-sh2";
        param = new ModifyURedisGroupPasswordParam(region, groupId, password);
        param.setProjectId("org-izug1m");
    }


    @Test
    public void modifyURedisGroupPassword() {
        try {
            ModifyURedisGroupPasswordResult result = client.modifyURedisGroupPassword(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

}