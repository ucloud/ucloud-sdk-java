package cn.ucloud.umem.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.umem.model.ResizeURedisGroupParam;
import cn.ucloud.umem.model.ResizeURedisGroupResult;
import com.google.gson.Gson;
import org.junit.Before;
import org.junit.Test;
import java.util.List;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.umem.pojo.UMEMConfig;

import static org.junit.Assert.assertNull;


/**
* @Description : UMEM.ResizeURedisGroup 测试
* @Author : ucloud-sdk-generator
* @Date : 2019-03-15 10:00
**/
public class ResizeURedisGroupTest {

private UMEMClient client;

private ResizeURedisGroupParam param;





@Before
public void setUp() throws Exception {
client =  new DefaultUMEMClient(new UMEMConfig(
new Account(System.getenv("UcloudPrivateKey"),
System.getenv("UcloudPublicKey"))));
                    String region = "cn-sh2";
                    String groupId = "cn-sh2";
                    Integer size = 1;
param = new ResizeURedisGroupParam( region, groupId, size);
param.setProjectId("org-izug1m");
}


@Test
public void resizeURedisGroup() {
try {
ResizeURedisGroupResult result = client.resizeURedisGroup(param);
JSONComparator.jsonComparator(result);
} catch (Exception e) {
assertNull(e);
}
}

}