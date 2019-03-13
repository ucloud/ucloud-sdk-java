package cn.ucloud.udb.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.udb.model.CompleteDBTransferTaskParam;
import cn.ucloud.udb.model.CompleteDBTransferTaskResult;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-03-05 21:41
 **/
public class CompleteDBTransferTaskTest {

    private UDBClient client;

    private CompleteDBTransferTaskParam param;


    @Before
    public void setUp() throws Exception {
        client = GetUDBClient.getUDBClient();
        param = new CompleteDBTransferTaskParam("cn-sh2", "cn-sh2-02", "udb-h3q25faw");
        param.setProjectId("org-izug1m");
    }

    // todo 测试
    @Test
    public void completeDBTransferTask() {
        try {
            CompleteDBTransferTaskResult result = client.completeDBTransferTask(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

    @Test
    public void completeDBTransferTaskCallback() {
        client.completeDBTransferTask(param, new UcloudHandler<CompleteDBTransferTaskResult>() {
            @Override
            public Object success(CompleteDBTransferTaskResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(CompleteDBTransferTaskResult result) {
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