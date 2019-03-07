package cn.ucloud.udb.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.util.JSONComparator;
import cn.ucloud.udb.model.CreateMongoDBReplicaSetParam;
import cn.ucloud.udb.model.CreateMongoDBReplicaSetResult;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-03-05 22:04
 **/
public class CreateMongoDBReplicaSetTest {

    private UDBClient client;

    private CreateMongoDBReplicaSetParam param;

    @Before
    public void setUp() throws Exception {
        client = GetUDBClient.getUDBClient();
        param = new CreateMongoDBReplicaSetParam("cn-sh2", "cn-sh2-02", "sdk-java-mongo-test",
                "sdk-java-test", "mongodb-3.2", 20, 1, 1000, 27017);
        param.setProjectId("org-izug1m");
    }

    @Test
    public void createMongoDBReplicaSet() {
        try {
            CreateMongoDBReplicaSetResult result = client.createMongoDBReplicaSet(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

    @Test
    public void createMongoDBReplicaSetCallback() {
        client.createMongoDBReplicaSet(param, new UcloudHandler<CreateMongoDBReplicaSetResult>() {
            @Override
            public Object success(CreateMongoDBReplicaSetResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(CreateMongoDBReplicaSetResult result) {
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