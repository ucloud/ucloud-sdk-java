package cn.ucloud.udb.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.udb.model.BackupUDBInstanceParam;
import cn.ucloud.udb.model.BackupUDBInstanceResult;
import com.google.gson.Gson;
import org.json.JSONException;
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
        client = GetUDBClient.getUDBClient();
        param = new BackupUDBInstanceParam("cn-sh2", "udb-h3q25faw", "sdk-java-test");
        param.setProjectId("org-izug1m");
    }

    @Test
    public void backupUDBInstance() {
        try {
            BackupUDBInstanceResult result = client.backupUDBInstance(param);
            JSONAssert.assertEquals(result.getResponseContent(), new Gson().toJson(result), true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void backupUDBInstanceCallback() {
        client.backupUDBInstance(param, new UcloudHandler<BackupUDBInstanceResult>() {
            @Override
            public Object success(BackupUDBInstanceResult result) {
                try {
                    JSONAssert.assertEquals(result.getResponseContent(), new Gson().toJson(result), true);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                return null;
            }

            @Override
            public Object failed(BackupUDBInstanceResult result) {
                try {
                    JSONAssert.assertEquals(result.getResponseContent(), new Gson().toJson(result), true);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                return null;
            }

            @Override
            public Object error(Exception e) {
                e.printStackTrace();
                return null;
            }
        }, false);
    }
}