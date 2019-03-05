package cn.ucloud.udb.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.udb.model.BackupUDBInstanceBinlogParam;
import cn.ucloud.udb.model.BackupUDBInstanceBinlogResult;
import com.google.gson.Gson;
import org.json.JSONException;
import org.junit.Before;
import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;

import static junit.framework.TestCase.assertNull;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-03-05 16:12
 **/
public class BackupUDBInstanceBinlogTest {

    private UDBClient client;

    private BackupUDBInstanceBinlogParam param;

    @Before
    public void setUp() throws Exception {
        client = GetUDBClient.getUDBClient();
        param = new BackupUDBInstanceBinlogParam("cn-sh2", "udb-h3q25faw", "sdk-java-test");
        param.setProjectId("org-izug1m");
    }

    @Test
    public void backupUDBInstanceBinlog() {
        try {
            BackupUDBInstanceBinlogResult result = client.backupUDBInstanceBinlog(param);
            JSONAssert.assertEquals(result.getResponseContent(), new Gson().toJson(result), true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void backupUDBInstanceBinlogCallBack() {
        client.backupUDBInstanceBinlog(param, new UcloudHandler<BackupUDBInstanceBinlogResult>() {
            @Override
            public Object success(BackupUDBInstanceBinlogResult result) {
                try {
                    JSONAssert.assertEquals(result.getResponseContent(), new Gson().toJson(result), true);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                return null;
            }

            @Override
            public Object failed(BackupUDBInstanceBinlogResult result) {
                try {
                    JSONAssert.assertEquals(result.getResponseContent(), new Gson().toJson(result), true);
                } catch (JSONException e) {
                    assertNull(e);
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