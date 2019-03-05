package cn.ucloud.udb.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.udb.model.BackupUDBInstanceParam;
import cn.ucloud.udb.model.BackupUDBInstanceResult;
import cn.ucloud.udb.pojo.UDBConfig;
import com.google.gson.Gson;
import com.google.gson.JsonParser;
import org.json.JSONObject;
import org.junit.Before;
import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;

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

        param = new BackupUDBInstanceParam("cn-sh2", "cn-sh2-02", "sdk-java-test");
        param.setProjectId("org-izug1m");
    }

    @Test
    public void backupUDBInstance() {
        try {
            BackupUDBInstanceResult result = client.backupUDBInstance(param);
            JSONAssert.assertEquals(result.getResponseContent(), new Gson().toJson(result),true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void backupUDBInstanceCallback() {
    }
}