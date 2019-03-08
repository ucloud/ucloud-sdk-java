package cn.ucloud.pathx.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.pathx.model.UGAUnBindUPathParam;
import cn.ucloud.pathx.model.UGAUnBindUPathResult;
import com.google.gson.Gson;
import org.junit.Before;
import org.junit.Test;
import java.util.List;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.common.util.JSONComparator;
import cn.ucloud.pathx.pojo.PATHXConfig;

import static org.junit.Assert.assertNull;


/**
* @Description : PATHX.UGAUnBindUPath 测试
* @Author : ucloud-sdk-generator
* @Date : 2019-03-08 04:06
**/
public class UGAUnBindUPathTest {

private PATHXClient client;

private UGAUnBindUPathParam param;





@Before
public void setUp() throws Exception {
client =  new DefaultPATHXClient(new PATHXConfig(
new Account(System.getenv("UcloudPrivateKey"),
System.getenv("UcloudPublicKey"))));
                    String projectId = "cn-sh2";
                    String uGAId = "cn-sh2";
                    String uPathId = "cn-sh2";
param = new UGAUnBindUPathParam( projectId, uGAId, uPathId);
param.setProjectId("org-izug1m");
}


@Test
public void uGAUnBindUPath() {
try {
UGAUnBindUPathResult result = client.uGAUnBindUPath(param);
JSONComparator.jsonComparator(result);
} catch (Exception e) {
assertNull(e);
}
}

@Test
public void uGAUnBindUPathCallback() {
client.uGAUnBindUPath(param, new UcloudHandler
<UGAUnBindUPathResult>() {
@Override
public Object success(UGAUnBindUPathResult result) {
JSONComparator.jsonComparator(result);
return null;
}

@Override
public Object failed(UGAUnBindUPathResult result) {
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