package cn.ucloud.umem.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.umem.model.CreateURedisGroupParam;
import cn.ucloud.umem.model.CreateURedisGroupResult;
import com.google.gson.Gson;
import org.junit.Before;
import org.junit.Test;
import java.util.List;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.umem.pojo.UMEMConfig;

import static org.junit.Assert.assertNull;


/**
* @Description : UMEM.CreateURedisGroup 测试
* @Author : ucloud-sdk-generator
* @Date : 2019-03-15 10:00
**/
public class CreateURedisGroupTest {

private UMEMClient client;

private CreateURedisGroupParam param;





@Before
public void setUp() throws Exception {
client =  new DefaultUMEMClient(new UMEMConfig(
new Account(System.getenv("UcloudPrivateKey"),
System.getenv("UcloudPublicKey"))));
                    String region = "cn-sh2";
                    String zone = "cn-sh2";
                    String name = "cn-sh2";
                    String highAvailability = "cn-sh2";
param = new CreateURedisGroupParam( region, zone, name, highAvailability);
param.setProjectId("org-izug1m");
}


@Test
public void createURedisGroup() {
try {
CreateURedisGroupResult result = client.createURedisGroup(param);
JSONComparator.jsonComparator(result);
} catch (Exception e) {
assertNull(e);
}
}

}