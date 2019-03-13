package cn.ucloud.udb.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.udb.model.ModifyDBTransferTaskParam;
import cn.ucloud.udb.model.ModifyDBTransferTaskResult;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-03-08 13:08
 **/
public class ModifyDBTransferTaskTest {


    private UDBClient client;

    private ModifyDBTransferTaskParam param;

    // taskId
    // 16ed874b-59a4-443c-b5e3-2784cab13cdb
    // 39c27da5-8bc9-45b4-a5bc-172189a0f0c4


    @Before
    public void setUp() throws Exception {
        client = GetUDBClient.getUDBClient();
        param = new ModifyDBTransferTaskParam("cn-sh2", "cn-sh2-02", "16ed874b-59a4-443c-b5e3-2784cab13cdb");
        param.setProjectId("org-izug1m");
    }

    @Test
    public void modifyDBTransferTask() {
        try {
            ModifyDBTransferTaskResult result = client.modifyDBTransferTask(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

    @Test
    public void modifyDBTransferTaskCallback() {
        client.modifyDBTransferTask(param, new UcloudHandler<ModifyDBTransferTaskResult>() {
            @Override
            public Object success(ModifyDBTransferTaskResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(ModifyDBTransferTaskResult result) {
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