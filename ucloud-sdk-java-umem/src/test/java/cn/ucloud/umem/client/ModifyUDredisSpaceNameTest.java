package cn.ucloud.umem.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.umem.model.ModifyUDredisSpaceNameParam;
import cn.ucloud.umem.model.ModifyUDredisSpaceNameResult;
import com.google.gson.Gson;
import org.junit.Before;
import org.junit.Test;
import java.util.List;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.umem.pojo.UMEMConfig;

import static org.junit.Assert.assertNull;


/**
* @Description : UMEM.ModifyUDredisSpaceName 测试
* @Author : ucloud-sdk-generator
* @Date : 2019-03-15 10:00
**/
public class ModifyUDredisSpaceNameTest {

private UMEMClient client;

private ModifyUDredisSpaceNameParam param;





@Before
public void setUp() throws Exception {
client =  new DefaultUMEMClient(new UMEMConfig(
new Account(System.getenv("UcloudPrivateKey"),
System.getenv("UcloudPublicKey"))));
                    String region = "cn-sh2";
                    String spaceId = "cn-sh2";
                    String name = "cn-sh2";
param = new ModifyUDredisSpaceNameParam( region, spaceId, name);
param.setProjectId("org-izug1m");
}


@Test
public void modifyUDredisSpaceName() {
try {
ModifyUDredisSpaceNameResult result = client.modifyUDredisSpaceName(param);
JSONComparator.jsonComparator(result);
} catch (Exception e) {
assertNull(e);
}
}

}