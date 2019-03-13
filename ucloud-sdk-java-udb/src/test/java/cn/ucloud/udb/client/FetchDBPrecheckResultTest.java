package cn.ucloud.udb.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.udb.model.FetchDBPrecheckResultParam;
import cn.ucloud.udb.model.FetchDBPrecheckResultResult;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-03-07 22:27
 **/
public class FetchDBPrecheckResultTest {

    private UDBClient client;

    private FetchDBPrecheckResultParam param;

    // taskId
    // 16ed874b-59a4-443c-b5e3-2784cab13cdb
    // 39c27da5-8bc9-45b4-a5bc-172189a0f0c4

    @Before
    public void setUp() throws Exception {
        client = GetUDBClient.getUDBClient();
        param = new FetchDBPrecheckResultParam("cn-sh2", "cn-sh2-02", "16ed874b-59a4-443c-b5e3-2784cab13cdb");
        param.setProjectId("org-izug1m");
    }

    //todo 测试
    @Test
    public void fetchDBPrecheckResult() {
        try {
            FetchDBPrecheckResultResult result = client.fetchDBPrecheckResult(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

    @Test
    public void fetchDBPrecheckResultCallback() {
        client.fetchDBPrecheckResult(param, new UcloudHandler<FetchDBPrecheckResultResult>() {
            @Override
            public Object success(FetchDBPrecheckResultResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(FetchDBPrecheckResultResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object error(Exception e) {
                assertNull(e);
                return null;
            }
        }, false);
    }
}