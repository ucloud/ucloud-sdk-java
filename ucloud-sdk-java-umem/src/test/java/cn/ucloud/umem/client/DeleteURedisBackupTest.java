package cn.ucloud.umem.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.umem.model.DeleteURedisBackupParam;
import cn.ucloud.umem.model.DeleteURedisBackupResult;
import com.google.gson.Gson;
import org.junit.Before;
import org.junit.Test;
import java.util.List;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.umem.pojo.UMEMConfig;

import static org.junit.Assert.assertNull;


/**
* @Description : UMEM.DeleteURedisBackup 测试
* @Author : ucloud-sdk-generator
* @Date : 2019-03-15 10:00
**/
public class DeleteURedisBackupTest {

private UMEMClient client;

private DeleteURedisBackupParam param;





@Before
public void setUp() throws Exception {
client =  new DefaultUMEMClient(new UMEMConfig(
new Account(System.getenv("UcloudPrivateKey"),
System.getenv("UcloudPublicKey"))));
                    String region = "cn-sh2";
                    String backupId = "cn-sh2";
param = new DeleteURedisBackupParam( region, backupId);
param.setProjectId("org-izug1m");
}


@Test
public void deleteURedisBackup() {
try {
DeleteURedisBackupResult result = client.deleteURedisBackup(param);
JSONComparator.jsonComparator(result);
} catch (Exception e) {
assertNull(e);
}
}

}