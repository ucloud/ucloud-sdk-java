package cn.ucloud.udb.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.udb.model.BackupUDBInstanceBinlogParam;
import cn.ucloud.udb.model.ChangeUDBParamGroupParam;
import cn.ucloud.udb.model.ChangeUDBParamGroupResult;
import com.google.gson.Gson;
import org.json.JSONException;
import org.junit.Before;
import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;

import static org.junit.Assert.*;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-03-05 17:47
 **/
public class ChangeUDBParamGroupTest {

    private UDBClient client;

    private ChangeUDBParamGroupParam param;

    @Before
    public void setUp() throws Exception {
        client = GetUDBClient.getUDBClient();
        param = new ChangeUDBParamGroupParam("cn-sh2", "udb-h3q25faw", "sdk-java-test");
        param.setProjectId("org-izug1m");
    }

    @Test
    public void changeUDBParamGroup() {
        try {
            ChangeUDBParamGroupResult result = client.changeUDBParamGroup(param);
            JSONAssert.assertEquals(result.getResponseContent(), new Gson().toJson(result), true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void changeUDBParamGroupCallback() {
        client.changeUDBParamGroup(param, new UcloudHandler<ChangeUDBParamGroupResult>() {
            @Override
            public Object success(ChangeUDBParamGroupResult result) {
                try {
                    JSONAssert.assertEquals(result.getResponseContent(), new Gson().toJson(result), true);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                return null;
            }

            @Override
            public Object failed(ChangeUDBParamGroupResult result) {
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