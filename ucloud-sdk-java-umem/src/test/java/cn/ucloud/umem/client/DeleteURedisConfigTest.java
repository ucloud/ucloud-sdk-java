package cn.ucloud.umem.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.umem.model.DeleteURedisConfigParam;
import cn.ucloud.umem.model.DeleteURedisConfigResult;
import com.google.gson.Gson;
import org.junit.Before;
import org.junit.Test;
import java.util.List;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.umem.pojo.UMEMConfig;

import static org.junit.Assert.assertNull;


/**
* @Description : UMEM.DeleteURedisConfig 测试
* @Author : ucloud-sdk-generator
* @Date : 2019-03-15 10:00
**/
public class DeleteURedisConfigTest {

private UMEMClient client;

private DeleteURedisConfigParam param;





@Before
public void setUp() throws Exception {
client =  new DefaultUMEMClient(new UMEMConfig(
new Account(System.getenv("UcloudPrivateKey"),
System.getenv("UcloudPublicKey"))));
                    String region = "cn-sh2";
                    String zone = "cn-sh2";
                    String configId = "cn-sh2";
param = new DeleteURedisConfigParam( region, zone, configId);
param.setProjectId("org-izug1m");
}


@Test
public void deleteURedisConfig() {
try {
DeleteURedisConfigResult result = client.deleteURedisConfig(param);
JSONComparator.jsonComparator(result);
} catch (Exception e) {
assertNull(e);
}
}

}