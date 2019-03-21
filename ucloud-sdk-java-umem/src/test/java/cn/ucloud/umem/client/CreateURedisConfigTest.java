package cn.ucloud.umem.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.umem.model.CreateURedisConfigParam;
import cn.ucloud.umem.model.CreateURedisConfigResult;
import cn.ucloud.umem.pojo.UMEMConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;


/**
 * @Description : UMEM.CreateURedisConfig 测试
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-15 10:00
 **/
public class CreateURedisConfigTest {

    private UMEMClient client;

    private CreateURedisConfigParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultUMEMClient(new UMEMConfig(
                new Account(System.getenv("UCloudPrivateKey"),
                        System.getenv("UCloudPublicKey"))));
        String region = "cn-sh2";
        String zone = "cn-sh2-02";
        String sourceConfigId = "3e45ac48-f8a2-a9q2-261d-l342dab130gf";
        String name = "sdk-java-config";
        String description = "sdk-java-test";
        param = new CreateURedisConfigParam(region,zone, sourceConfigId, name, description);
        param.setProjectId("org-izug1m");
    }


    @Test
    public void createURedisConfig() {
        try {
            CreateURedisConfigResult result = client.createURedisConfig(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

}