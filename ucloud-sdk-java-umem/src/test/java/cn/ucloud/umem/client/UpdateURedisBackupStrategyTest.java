package cn.ucloud.umem.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.umem.model.UpdateURedisBackupStrategyParam;
import cn.ucloud.umem.model.UpdateURedisBackupStrategyResult;
import com.google.gson.Gson;
import org.junit.Before;
import org.junit.Test;
import java.util.List;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.umem.pojo.UMEMConfig;

import static org.junit.Assert.assertNull;


/**
* @Description : UMEM.UpdateURedisBackupStrategy 测试
* @Author : ucloud-sdk-generator
* @Date : 2019-03-15 10:00
**/
public class UpdateURedisBackupStrategyTest {

private UMEMClient client;

private UpdateURedisBackupStrategyParam param;





@Before
public void setUp() throws Exception {
client =  new DefaultUMEMClient(new UMEMConfig(
new Account(System.getenv("UcloudPrivateKey"),
System.getenv("UcloudPublicKey"))));
                    String region = "cn-sh2";
                    String groupId = "cn-sh2";
                    String backupTime = "cn-sh2";
param = new UpdateURedisBackupStrategyParam( region, groupId, backupTime);
param.setProjectId("org-izug1m");
}


@Test
public void updateURedisBackupStrategy() {
try {
UpdateURedisBackupStrategyResult result = client.updateURedisBackupStrategy(param);
JSONComparator.jsonComparator(result);
} catch (Exception e) {
assertNull(e);
}
}

}