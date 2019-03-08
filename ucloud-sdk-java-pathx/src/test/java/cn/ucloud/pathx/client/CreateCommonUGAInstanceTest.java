package cn.ucloud.pathx.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.pathx.model.CreateCommonUGAInstanceParam;
import cn.ucloud.pathx.model.CreateCommonUGAInstanceResult;
import com.google.gson.Gson;
import org.junit.Before;
import org.junit.Test;
import java.util.List;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.common.util.JSONComparator;
import cn.ucloud.pathx.pojo.PATHXConfig;

import static org.junit.Assert.assertNull;


/**
* @Description : PATHX.CreateCommonUGAInstance 测试
* @Author : ucloud-sdk-generator
* @Date : 2019-03-08 04:06
**/
public class CreateCommonUGAInstanceTest {

private PATHXClient client;

private CreateCommonUGAInstanceParam param;





@Before
public void setUp() throws Exception {
client =  new DefaultPATHXClient(new PATHXConfig(
new Account(System.getenv("UcloudPrivateKey"),
System.getenv("UcloudPublicKey"))));
                    String projectId = "cn-sh2";
                    String quantity = "cn-sh2";
                    String location = "cn-sh2";
                    String chargeType = "cn-sh2";
                    String uGAType = "cn-sh2";
                    String name = "cn-sh2";
param = new CreateCommonUGAInstanceParam( projectId, quantity, location, chargeType, uGAType, name);
param.setProjectId("org-izug1m");
}


@Test
public void createCommonUGAInstance() {
try {
CreateCommonUGAInstanceResult result = client.createCommonUGAInstance(param);
JSONComparator.jsonComparator(result);
} catch (Exception e) {
assertNull(e);
}
}

@Test
public void createCommonUGAInstanceCallback() {
client.createCommonUGAInstance(param, new UcloudHandler
<CreateCommonUGAInstanceResult>() {
@Override
public Object success(CreateCommonUGAInstanceResult result) {
JSONComparator.jsonComparator(result);
return null;
}

@Override
public Object failed(CreateCommonUGAInstanceResult result) {
JSONComparator.jsonComparator(result);
return null;
}

@Override
public Object error(Exception e) {
assertNull(e);
return null;
}
}, false);
}
}