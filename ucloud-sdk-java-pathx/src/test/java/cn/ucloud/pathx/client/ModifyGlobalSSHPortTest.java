package cn.ucloud.pathx.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.pathx.model.ModifyGlobalSSHPortParam;
import cn.ucloud.pathx.model.ModifyGlobalSSHPortResult;
import com.google.gson.Gson;
import org.junit.Before;
import org.junit.Test;
import java.util.List;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.common.util.JSONComparator;
import cn.ucloud.pathx.pojo.PATHXConfig;

import static org.junit.Assert.assertNull;


/**
* @Description : PATHX.ModifyGlobalSSHPort 测试
* @Author : ucloud-sdk-generator
* @Date : 2019-03-08 04:06
**/
public class ModifyGlobalSSHPortTest {

private PATHXClient client;

private ModifyGlobalSSHPortParam param;





@Before
public void setUp() throws Exception {
client =  new DefaultPATHXClient(new PATHXConfig(
new Account(System.getenv("UcloudPrivateKey"),
System.getenv("UcloudPublicKey"))));
                    String projectId = "cn-sh2";
                    String instanceId = "cn-sh2";
                    Integer port = 1;
param = new ModifyGlobalSSHPortParam( projectId, instanceId, port);
param.setProjectId("org-izug1m");
}


@Test
public void modifyGlobalSSHPort() {
try {
ModifyGlobalSSHPortResult result = client.modifyGlobalSSHPort(param);
JSONComparator.jsonComparator(result);
} catch (Exception e) {
assertNull(e);
}
}

@Test
public void modifyGlobalSSHPortCallback() {
client.modifyGlobalSSHPort(param, new UcloudHandler
<ModifyGlobalSSHPortResult>() {
@Override
public Object success(ModifyGlobalSSHPortResult result) {
JSONComparator.jsonComparator(result);
return null;
}

@Override
public Object failed(ModifyGlobalSSHPortResult result) {
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