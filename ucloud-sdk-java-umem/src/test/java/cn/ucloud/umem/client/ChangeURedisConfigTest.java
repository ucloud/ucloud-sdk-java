package cn.ucloud.umem.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.umem.model.ChangeURedisConfigParam;
import cn.ucloud.umem.model.ChangeURedisConfigResult;
import cn.ucloud.umem.pojo.UMEMConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;


/**
 * @Description : UMEM.ChangeURedisConfig 测试
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-15 10:00
 **/
public class ChangeURedisConfigTest {

    private UMEMClient client;

    private ChangeURedisConfigParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultUMEMClient(new UMEMConfig(
                new Account(System.getenv("UCloudPrivateKey"),
                        System.getenv("UCloudPublicKey"))));
        String region = "cn-sh2";
        String groupId = "uredis-vzovqixi";
        String configId = "3e45ac48-f8a2-a9q2-261d-l342dab130gf";
        param = new ChangeURedisConfigParam(region, groupId, configId);
        param.setProjectId("org-izug1m");
    }


    @Test
    public void changeURedisConfig() {
        try {
            ChangeURedisConfigResult result = client.changeURedisConfig(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

}