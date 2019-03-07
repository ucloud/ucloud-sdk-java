package cn.ucloud.udb.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.udb.model.CreateMongoDBReplicaSetParam;
import cn.ucloud.udb.model.CreateUDBSlaveParam;
import cn.ucloud.udb.model.CreateUDBSlaveResult;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-03-06 11:50
 **/
public class CreateUDBSlaveTest {

    private UDBClient client;

    private CreateUDBSlaveParam param;

    @Before
    public void setUp() throws Exception {
        client = GetUDBClient.getUDBClient();
        param = new CreateUDBSlaveParam("cn-sh2", "udb-5yb2i0vn", "slave-test");
        param.setProjectId("org-izug1m");
    }

    // todo 测试 response messsage 拼写错误
    @Test
    public void createUDBSlave() {
        try {
            CreateUDBSlaveResult result = client.createUDBSlave(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

    @Test
    public void createUDBSlaveCallback() {
        client.createUDBSlave(param, new UcloudHandler<CreateUDBSlaveResult>() {
            @Override
            public Object success(CreateUDBSlaveResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(CreateUDBSlaveResult result) {
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