package cn.ucloud.udb.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.pojo.BaseRequestParam;
import cn.ucloud.udb.model.BackupUDBInstanceBinlogParam;
import cn.ucloud.udb.model.BackupUDBInstanceErrorLogResult;
import cn.ucloud.udb.model.BackupUDBInstanceSlowLogParam;
import cn.ucloud.udb.model.BackupUDBInstanceSlowLogResult;
import com.google.gson.Gson;
import org.junit.Before;
import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;

import static org.junit.Assert.*;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-03-05 17:11
 **/
public class BackupUDBInstanceSlowLogTest {

    private UDBClient client;

    private BackupUDBInstanceSlowLogParam param;

    @Before
    public void setUp() throws Exception {
        client = GetUDBClient.getUDBClient();
        param = new BackupUDBInstanceSlowLogParam("cn-sh2", "udb-h3q25faw", 1551770000, 1551777220
                , "sdk-java-test-slow");
        param.setProjectId("org-izug1m");
    }

    @Test
    public void backupUDBInstanceSlowLog() {
        try {
            BackupUDBInstanceSlowLogResult result = client.backupUDBInstanceSlowLog(param);
            JSONAssert.assertEquals(result.getResponseContent(), new Gson().toJson(result), true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void backupUDBInstanceSlowLogCallback() {
        client.backupUDBInstanceSlowLog(param, new UcloudHandler<BackupUDBInstanceSlowLogResult>() {
            @Override
            public Object success(BackupUDBInstanceSlowLogResult result) {
                try {
                    JSONAssert.assertEquals(result.getResponseContent(), new Gson().toJson(result), true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return null;
            }

            @Override
            public Object failed(BackupUDBInstanceSlowLogResult result) {
                try {
                    JSONAssert.assertEquals(result.getResponseContent(), new Gson().toJson(result), true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return null;
            }

            @Override
            public Object error(Exception e) {
                e.printStackTrace();
                return null;
            }
        },false);
    }
}