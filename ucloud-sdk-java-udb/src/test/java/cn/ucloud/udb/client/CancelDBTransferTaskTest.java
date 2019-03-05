package cn.ucloud.udb.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.udb.model.CancelDBTransferTaskParam;
import cn.ucloud.udb.model.CancelDBTransferTaskResult;
import com.google.gson.Gson;
import org.json.JSONException;
import org.junit.Before;
import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-03-05 17:33
 **/
public class CancelDBTransferTaskTest {

    private UDBClient client;

    private CancelDBTransferTaskParam param;


    @Before
    public void setUp() throws Exception {
        client = GetUDBClient.getUDBClient();
        param = new CancelDBTransferTaskParam("cn-sh2", "cn-sh2-02", "sdk-java-test");
        param.setProjectId("org-izug1m");
    }

    // todo 测试
    @Test
    public void cancelDBTransferTask() {
        try {
            CancelDBTransferTaskResult result = client.cancelDBTransferTask(param);
            JSONAssert.assertEquals(result.getResponseContent(), new Gson().toJson(result), true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void cancelDBTransferTaskCallback() {
        client.cancelDBTransferTask(param, new UcloudHandler<CancelDBTransferTaskResult>() {
            @Override
            public Object success(CancelDBTransferTaskResult result) {
                try {
                    JSONAssert.assertEquals(result.getResponseContent(), new Gson().toJson(result), true);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                return null;
            }

            @Override
            public Object failed(CancelDBTransferTaskResult result) {
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