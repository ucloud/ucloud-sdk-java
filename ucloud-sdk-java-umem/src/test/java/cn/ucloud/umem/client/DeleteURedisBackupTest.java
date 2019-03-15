package cn.ucloud.umem.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.umem.model.DeleteURedisBackupParam;
import cn.ucloud.umem.model.DeleteURedisBackupResult;
import cn.ucloud.umem.pojo.UMEMConfig;
import org.junit.Before;
import org.junit.Test;

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
        client = new DefaultUMEMClient(new UMEMConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        String region = "cn-sh2";
        String zone = "cn-sh2-02";
        String backupId = "2c02ec12-5e65-4e0b-88ea-6dd6f48070df";
        param = new DeleteURedisBackupParam(region, backupId,zone);
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