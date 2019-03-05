package cn.ucloud.udb.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.udb.model.BackupUDBInstanceParam;
import cn.ucloud.udb.pojo.UDBConfig;
import org.junit.Before;
import org.junit.Test;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-03-05 13:31
 **/
public class BackUDBInstanceTest {

    private UDBClient client;

    private BackupUDBInstanceParam param;

    @Before
    public void setUp() throws Exception {
        client = new DefaultUDBClient(new UDBConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));

        param = new BackupUDBInstanceParam("cn-sh2", "cn-sh2-01", "sdk-java-test");
        param.setProjectId("org-izug1m");
    }

    @Test
    public void backupUDBInstance() {
        try {
            System.out.println("aaab");
            System.out.println(System.getenv("UcloudPrivateKey"));
            //BackupUDBInstanceResult result = client.backupUDBInstance(param);
            //JSONAssert.assertEquals(result.getResponseContent(),result.toString(),true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void backupUDBInstanceCallback() {
    }
}