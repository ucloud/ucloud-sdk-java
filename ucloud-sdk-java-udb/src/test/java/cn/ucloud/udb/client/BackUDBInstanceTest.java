package cn.ucloud.udb.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.udb.model.BackupUDBInstanceParam;
import cn.ucloud.udb.model.BackupUDBInstanceResult;
import cn.ucloud.udb.pojo.UDBConfig;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParser;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Before;
import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-03-05 13:31
 **/
public class BackUDBInstanceTest {

    private UDBClient client;

    private BackupUDBInstanceParam param;

    private static Logger logger = LoggerFactory.getLogger(BackUDBInstanceTest.class.getName());

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
            logger.error(e.getMessage());
        }
    }

    @Test
    public void backupUDBInstanceCallback() {
        client.backupUDBInstance(param, new UcloudHandler<BackupUDBInstanceResult>() {
            @Override
            public Object success(BackupUDBInstanceResult result) {
                try {
                    System.out.println(result);
                    JSONAssert.assertEquals(result.getResponseContent(), new Gson().toJson(result), true);
                } catch (JSONException e) {
                    logger.error(e.getMessage());
                }
                return null;
            }

            @Override
            public Object failed(BackupUDBInstanceResult result) {
                try {
                    System.out.println(result);
                    JSONAssert.assertEquals(result.getResponseContent(), new Gson().toJson(result), true);
                } catch (JSONException e) {
                    logger.error(e.getMessage());
                }
                return null;
            }

            @Override
            public Object error(Exception e) {
                logger.error(e.getMessage());
                return null;
            }
        });
    }
}