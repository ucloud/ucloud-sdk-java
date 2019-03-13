package cn.ucloud.udb.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.udb.model.PrecheckDBTransferTaskParam;
import cn.ucloud.udb.model.PrecheckDBTransferTaskResult;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-03-08 13:39
 **/
public class PrecheckDBTransferTaskTest {

    private UDBClient client;

    private PrecheckDBTransferTaskParam param;


    // taskId
    // 16ed874b-59a4-443c-b5e3-2784cab13cdb
    // 39c27da5-8bc9-45b4-a5bc-172189a0f0c4

    @Before
    public void setUp() throws Exception {
        client = GetUDBClient.getUDBClient();
        param = new PrecheckDBTransferTaskParam("cn-sh2", "cn-sh2-02",
                "16ed874b-59a4-443c-b5e3-2784cab13cdb");
        param.setProjectId("org-izug1m");
    }

    @Test
    public void precheckDBTransferTask() {
        try {
            PrecheckDBTransferTaskResult result = client.precheckDBTransferTask(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

    @Test
    public void precheckDBTransferTaskCallback() {
        client.precheckDBTransferTask(param, new UcloudHandler<PrecheckDBTransferTaskResult>() {
            @Override
            public Object success(PrecheckDBTransferTaskResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(PrecheckDBTransferTaskResult result) {
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