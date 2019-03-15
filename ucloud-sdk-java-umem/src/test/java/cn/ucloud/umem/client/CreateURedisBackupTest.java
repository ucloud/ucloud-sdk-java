package cn.ucloud.umem.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.umem.model.CreateURedisBackupParam;
import cn.ucloud.umem.model.CreateURedisBackupResult;
import com.google.gson.Gson;
import org.junit.Before;
import org.junit.Test;
import java.util.List;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.umem.pojo.UMEMConfig;

import static org.junit.Assert.assertNull;


/**
* @Description : UMEM.CreateURedisBackup 测试
* @Author : ucloud-sdk-generator
* @Date : 2019-03-15 10:00
**/
public class CreateURedisBackupTest {

private UMEMClient client;

private CreateURedisBackupParam param;





@Before
public void setUp() throws Exception {
client =  new DefaultUMEMClient(new UMEMConfig(
new Account(System.getenv("UcloudPrivateKey"),
System.getenv("UcloudPublicKey"))));
                    String region = "cn-sh2";
                    String groupId = "cn-sh2";
                    String backupName = "cn-sh2";
param = new CreateURedisBackupParam( region, groupId, backupName);
param.setProjectId("org-izug1m");
}


@Test
public void createURedisBackup() {
try {
CreateURedisBackupResult result = client.createURedisBackup(param);
JSONComparator.jsonComparator(result);
} catch (Exception e) {
assertNull(e);
}
}

}