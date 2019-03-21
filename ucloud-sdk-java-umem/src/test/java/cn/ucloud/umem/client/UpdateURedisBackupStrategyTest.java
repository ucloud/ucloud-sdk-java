package cn.ucloud.umem.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.umem.model.UpdateURedisBackupStrategyParam;
import cn.ucloud.umem.model.UpdateURedisBackupStrategyResult;
import cn.ucloud.umem.pojo.UMEMConfig;
import org.junit.Before;
import org.junit.Test;

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
        client = new DefaultUMEMClient(new UMEMConfig(
                new Account(System.getenv("UCloudPrivateKey"),
                        System.getenv("UCloudPublicKey"))));
        String region = "cn-sh2";
        String groupId = "uredis-pgouk5n1";
        Integer backupTime = 24;
        param = new UpdateURedisBackupStrategyParam(region, groupId, backupTime);
        param.setProjectId("org-izug1m");
        param.setAutoBackup("enable");
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