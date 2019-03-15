package cn.ucloud.umem.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.umem.model.CreateURedisConfigParam;
import cn.ucloud.umem.model.CreateURedisConfigResult;
import com.google.gson.Gson;
import org.junit.Before;
import org.junit.Test;
import java.util.List;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.umem.pojo.UMEMConfig;

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
client =  new DefaultUMEMClient(new UMEMConfig(
new Account(System.getenv("UcloudPrivateKey"),
System.getenv("UcloudPublicKey"))));
                    String region = "cn-sh2";
                    String sourceConfigId = "cn-sh2";
                    String name = "cn-sh2";
                    String description = "cn-sh2";
param = new CreateURedisConfigParam( region, sourceConfigId, name, description);
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