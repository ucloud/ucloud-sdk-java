package cn.ucloud.udb.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.udb.model.BackupUDBInstanceErrorLogParam;
import cn.ucloud.udb.model.BackupUDBInstanceErrorLogResult;
import com.google.gson.Gson;
import org.json.JSONException;
import org.junit.Before;
import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-03-05 16:58
 **/
public class BackupUDBInstanceErrorLogTest {
    private UDBClient client;

    private BackupUDBInstanceErrorLogParam param;


    @Before
    public void setUp() throws Exception {
        client = GetUDBClient.getUDBClient();
        param = new BackupUDBInstanceErrorLogParam("cn-sh2", "udb-h3q25faw", "sdk-java-test-error-log");
        param.setProjectId("org-izug1m");
    }

    @Test
    public void backupUDBInstanceErrorLog() {
        BackupUDBInstanceErrorLogResult result = null;
        try {
            result = client.backupUDBInstanceErrorLog(param);
            JSONAssert.assertEquals(result.getResponseContent(), new Gson().toJson(result), true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void backupUDBInstanceErrorLogCallback() {
        client.backupUDBInstanceErrorLog(param, new UcloudHandler<BackupUDBInstanceErrorLogResult>() {
            @Override
            public Object success(BackupUDBInstanceErrorLogResult result) {
                try {
                    JSONAssert.assertEquals(result.getResponseContent(), new Gson().toJson(result), true);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                return null;
            }

            @Override
            public Object failed(BackupUDBInstanceErrorLogResult result) {
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
        });
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}