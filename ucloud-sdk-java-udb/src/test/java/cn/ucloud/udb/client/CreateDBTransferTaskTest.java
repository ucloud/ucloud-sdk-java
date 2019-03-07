package cn.ucloud.udb.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.util.JSONComparator;
import cn.ucloud.udb.model.CreateDBTransferTaskParam;
import cn.ucloud.udb.model.CreateDBTransferTaskResult;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-03-05 21:43
 **/
public class CreateDBTransferTaskTest {

    private UDBClient client;

    private CreateDBTransferTaskParam param;


    @Before
    public void setUp() throws Exception {
        client = GetUDBClient.getUDBClient();
        param = new CreateDBTransferTaskParam("cn-sh2", "cn-sh2-02", "sdk-java-test", "MySQL",
                "udb-udb", "root", "sdk-java-test", "10.23.148.134",
                3306, "MySQL", "udb-h3q25faw", "root",
                "sdk-java-test", "full_inc");
        param.setProjectId("org-izug1m");
    }

    @Test
    public void createDBTransferTask() {
        try {
            CreateDBTransferTaskResult result = client.createDBTransferTask(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

    @Test
    public void createMongoDBReplicaSet() {
        client.createDBTransferTask(param, new UcloudHandler<CreateDBTransferTaskResult>() {
            @Override
            public Object success(CreateDBTransferTaskResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(CreateDBTransferTaskResult result) {
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