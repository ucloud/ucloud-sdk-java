package cn.ucloud.udb.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.udb.model.CreateMongoDBReplicaSetParam;
import cn.ucloud.udb.model.DeleteDBTransferTaskParam;
import cn.ucloud.udb.model.DeleteDBTransferTaskResult;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-03-06 12:13
 **/
public class DeleteDBTransferTaskTest {

    private UDBClient client;

    private DeleteDBTransferTaskParam param;

    @Before
    public void setUp() throws Exception {
        client = GetUDBClient.getUDBClient();
        param = new DeleteDBTransferTaskParam("cn-sh2", "cn-sh2-02", "sdk-java-mongo-test");
        param.setProjectId("org-izug1m");
    }

    @Test
    public void deleteDBTransferTask() {
        try {
            DeleteDBTransferTaskResult result = client.deleteDBTransferTask(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

    @Test
    public void deleteDBTransferTaskCallback() {
        client.deleteDBTransferTask(param, new UcloudHandler<DeleteDBTransferTaskResult>() {
            @Override
            public Object success(DeleteDBTransferTaskResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(DeleteDBTransferTaskResult result) {
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