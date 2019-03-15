package cn.ucloud.umem.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.umem.model.ResizeUDredisSpaceParam;
import cn.ucloud.umem.model.ResizeUDredisSpaceResult;
import com.google.gson.Gson;
import org.junit.Before;
import org.junit.Test;
import java.util.List;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.umem.pojo.UMEMConfig;

import static org.junit.Assert.assertNull;


/**
* @Description : UMEM.ResizeUDredisSpace 测试
* @Author : ucloud-sdk-generator
* @Date : 2019-03-15 10:00
**/
public class ResizeUDredisSpaceTest {

private UMEMClient client;

private ResizeUDredisSpaceParam param;





@Before
public void setUp() throws Exception {
client =  new DefaultUMEMClient(new UMEMConfig(
new Account(System.getenv("UcloudPrivateKey"),
System.getenv("UcloudPublicKey"))));
                    String region = "cn-sh2";
                    String spaceId = "cn-sh2";
                    Integer size = 1;
param = new ResizeUDredisSpaceParam( region, spaceId, size);
param.setProjectId("org-izug1m");
}


@Test
public void resizeUDredisSpace() {
try {
ResizeUDredisSpaceResult result = client.resizeUDredisSpace(param);
JSONComparator.jsonComparator(result);
} catch (Exception e) {
assertNull(e);
}
}

}