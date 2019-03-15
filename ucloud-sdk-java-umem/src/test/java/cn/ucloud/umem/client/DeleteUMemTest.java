package cn.ucloud.umem.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.umem.model.DeleteUMemParam;
import cn.ucloud.umem.model.DeleteUMemResult;
import com.google.gson.Gson;
import org.junit.Before;
import org.junit.Test;
import java.util.List;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.umem.pojo.UMEMConfig;

import static org.junit.Assert.assertNull;


/**
* @Description : UMEM.DeleteUMem 测试
* @Author : ucloud-sdk-generator
* @Date : 2019-03-15 10:00
**/
public class DeleteUMemTest {

private UMEMClient client;

private DeleteUMemParam param;





@Before
public void setUp() throws Exception {
client =  new DefaultUMEMClient(new UMEMConfig(
new Account(System.getenv("UcloudPrivateKey"),
System.getenv("UcloudPublicKey"))));
                    String region = "cn-sh2";
                    String resourceId = "cn-sh2";
                    String resourceType = "cn-sh2";
param = new DeleteUMemParam( region, resourceId, resourceType);
param.setProjectId("org-izug1m");
}


@Test
public void deleteUMem() {
try {
DeleteUMemResult result = client.deleteUMem(param);
JSONComparator.jsonComparator(result);
} catch (Exception e) {
assertNull(e);
}
}

}