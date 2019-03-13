package cn.ucloud.udb.client;

import cn.ucloud.common.handler.UcloudHandler;

import cn.ucloud.udb.model.CancelDBTransferTaskParam;
import cn.ucloud.udb.model.CancelDBTransferTaskResult;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;

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
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

    @Test
    public void cancelDBTransferTaskCallback() {
        client.cancelDBTransferTask(param, new UcloudHandler<CancelDBTransferTaskResult>() {
            @Override
            public Object success(CancelDBTransferTaskResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(CancelDBTransferTaskResult result) {
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