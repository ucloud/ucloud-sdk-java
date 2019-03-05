package cn.ucloud.udb.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.udb.model.BackupUDBInstanceParam;
import cn.ucloud.udb.model.CheckRecoverUDBInstanceParam;
import cn.ucloud.udb.model.CheckRecoverUDBInstanceResult;
import com.google.gson.Gson;
import org.json.JSONException;
import org.junit.Before;
import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;

import static org.junit.Assert.*;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-03-05 18:16
 **/
public class CheckRecoverUDBInstanceTest {

    private UDBClient client;

    private CheckRecoverUDBInstanceParam param;


    @Before
    public void setUp() throws Exception {
        client = GetUDBClient.getUDBClient();
        param = new CheckRecoverUDBInstanceParam("cn-sh2", "udb-h3q25faw");
        param.setProjectId("org-izug1m");
    }

    @Test
    public void checkRecoverUDBInstance() {
        try {
            CheckRecoverUDBInstanceResult result = client.checkRecoverUDBInstance(param);
            JSONAssert.assertEquals(result.getResponseContent(), new Gson().toJson(result), true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void checkRecoverUDBInstanceCallback() {
        client.checkRecoverUDBInstance(param, new UcloudHandler<CheckRecoverUDBInstanceResult>() {
            @Override
            public Object success(CheckRecoverUDBInstanceResult result) {
                try {
                    JSONAssert.assertEquals(result.getResponseContent(), new Gson().toJson(result), true);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                return null;
            }

            @Override
            public Object failed(CheckRecoverUDBInstanceResult result) {
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