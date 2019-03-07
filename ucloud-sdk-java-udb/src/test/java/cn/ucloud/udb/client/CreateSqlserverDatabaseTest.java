package cn.ucloud.udb.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.util.JSONComparator;
import cn.ucloud.udb.model.CreateSqlserverDatabaseParam;
import cn.ucloud.udb.model.CreateSqlserverDatabaseResult;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-03-06 10:11
 **/
public class CreateSqlserverDatabaseTest {

    private UDBClient client;

    private CreateSqlserverDatabaseParam param;


    @Before
    public void setUp() throws Exception {
        client = GetUDBClient.getUDBClient();
        param = new CreateSqlserverDatabaseParam("cn-sh2", "udb-h3q25faw", "sdk-java-test");
        param.setProjectId("org-izug1m");
    }

    @Test
    public void createSqlserverDatabase() {
        try {
            CreateSqlserverDatabaseResult result = client.createSqlserverDatabase(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }

    }

    @Test
    public void createSqlserverDatabaseCallBack() {
        client.createSqlserverDatabase(param, new UcloudHandler<CreateSqlserverDatabaseResult>() {
            @Override
            public Object success(CreateSqlserverDatabaseResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(CreateSqlserverDatabaseResult result) {
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