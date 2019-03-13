package cn.ucloud.udb.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.udb.model.DeleteSqlserverDatabaseParam;
import cn.ucloud.udb.model.DeleteSqlserverDatabaseResult;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-03-06 13:59
 **/
public class DeleteSqlserverDatabaseTest {

    private UDBClient client;

    private DeleteSqlserverDatabaseParam param;


    @Before
    public void setUp() throws Exception {
        client = GetUDBClient.getUDBClient();
        param = new DeleteSqlserverDatabaseParam("cn-sh2", "udb-xxx", "sdk-java-test");
        param.setProjectId("org-izug1m");
    }

    // todo 测试
    @Test
    public void deleteSqlserverDatabase() {
        try {
            DeleteSqlserverDatabaseResult result = client.deleteSqlserverDatabase(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

    @Test
    public void deleteSqlserverDatabaseCallBack() {
        client.deleteSqlserverDatabase(param, new UcloudHandler<DeleteSqlserverDatabaseResult>() {
            @Override
            public Object success(DeleteSqlserverDatabaseResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(DeleteSqlserverDatabaseResult result) {
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