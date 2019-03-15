package cn.ucloud.umem.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.umem.model.DeleteUMemSpaceParam;
import cn.ucloud.umem.model.DeleteUMemSpaceResult;
import com.google.gson.Gson;
import org.junit.Before;
import org.junit.Test;
import java.util.List;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.umem.pojo.UMEMConfig;

import static org.junit.Assert.assertNull;


/**
* @Description : UMEM.DeleteUMemSpace 测试
* @Author : ucloud-sdk-generator
* @Date : 2019-03-15 10:00
**/
public class DeleteUMemSpaceTest {

private UMEMClient client;

private DeleteUMemSpaceParam param;





@Before
public void setUp() throws Exception {
client =  new DefaultUMEMClient(new UMEMConfig(
new Account(System.getenv("UcloudPrivateKey"),
System.getenv("UcloudPublicKey"))));
                    String region = "cn-sh2";
                    String spaceId = "cn-sh2";
param = new DeleteUMemSpaceParam( region, spaceId);
param.setProjectId("org-izug1m");
}


@Test
public void deleteUMemSpace() {
try {
DeleteUMemSpaceResult result = client.deleteUMemSpace(param);
JSONComparator.jsonComparator(result);
} catch (Exception e) {
assertNull(e);
}
}

}