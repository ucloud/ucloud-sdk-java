package cn.ucloud.pathx.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.pathx.model.CreateUPathParam;
import cn.ucloud.pathx.model.CreateUPathResult;
import com.google.gson.Gson;
import org.junit.Before;
import org.junit.Test;
import java.util.List;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.common.util.JSONComparator;
import cn.ucloud.pathx.pojo.PATHXConfig;

import static org.junit.Assert.assertNull;


/**
* @Description : PATHX.CreateUPath 测试
* @Author : ucloud-sdk-generator
* @Date : 2019-03-08 04:06
**/
public class CreateUPathTest {

private PATHXClient client;

private CreateUPathParam param;





@Before
public void setUp() throws Exception {
client =  new DefaultPATHXClient(new PATHXConfig(
new Account(System.getenv("UcloudPrivateKey"),
System.getenv("UcloudPublicKey"))));
                    String projectId = "cn-sh2";
                    String name = "cn-sh2";
                    String lineId = "cn-sh2";
                    Integer bandwidth = 1;
                    String chargeType = "cn-sh2";
                    String quantity = "cn-sh2";
param = new CreateUPathParam( projectId, name, lineId, bandwidth, chargeType, quantity);
param.setProjectId("org-izug1m");
}


@Test
public void createUPath() {
try {
CreateUPathResult result = client.createUPath(param);
JSONComparator.jsonComparator(result);
} catch (Exception e) {
assertNull(e);
}
}

@Test
public void createUPathCallback() {
client.createUPath(param, new UcloudHandler
<CreateUPathResult>() {
@Override
public Object success(CreateUPathResult result) {
JSONComparator.jsonComparator(result);
return null;
}

@Override
public Object failed(CreateUPathResult result) {
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