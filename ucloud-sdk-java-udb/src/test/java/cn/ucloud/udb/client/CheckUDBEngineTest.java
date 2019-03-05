package cn.ucloud.udb.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.udb.model.BackupUDBInstanceResult;
import cn.ucloud.udb.model.ChangeUDBParamGroupParam;
import cn.ucloud.udb.model.CheckUDBEngineParam;
import cn.ucloud.udb.model.CheckUDBEngineResult;
import com.google.gson.Gson;
import org.json.JSONException;
import org.junit.Before;
import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;

import static org.junit.Assert.*;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-03-05 18:26
 **/
public class CheckUDBEngineTest {

    private UDBClient client;

    private CheckUDBEngineParam param;

    @Before
    public void setUp() throws Exception {
        client = GetUDBClient.getUDBClient();
        param = new CheckUDBEngineParam("cn-sh2", "udb-h3q25faw", "MyISAM");
        param.setProjectId("org-izug1m");
    }

    @Test
    public void checkUDBEngine() {
        try {
            CheckUDBEngineResult result = client.checkUDBEngine(param);
            JSONAssert.assertEquals(result.getResponseContent(), new Gson().toJson(result), true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void checkUDBEngineCallback() {
        client.checkUDBEngine(param, new UcloudHandler<CheckUDBEngineResult>() {
            @Override
            public Object success(CheckUDBEngineResult result) {
                try {
                    JSONAssert.assertEquals(result.getResponseContent(), new Gson().toJson(result), true);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                return null;
            }

            @Override
            public Object failed(CheckUDBEngineResult result) {
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