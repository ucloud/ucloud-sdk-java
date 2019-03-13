package cn.ucloud.udb.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.udb.model.DeleteSqlserverAccountParam;
import cn.ucloud.udb.model.DeleteSqlserverAccountResult;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-03-06 13:27
 **/
public class DeleteSqlserverAccountTest {

    private UDBClient client;

    private DeleteSqlserverAccountParam param;


    @Before
    public void setUp() throws Exception {
        client = GetUDBClient.getUDBClient();
        param = new DeleteSqlserverAccountParam("cn-sh2", "cn-sh2-02", "sdk-java-test");
        param.setProjectId("org-izug1m");
    }

    // todo 测试
    @Test
    public void deleteSqlserverAccount() {
        try {
            DeleteSqlserverAccountResult result = client.deleteSqlserverAccount(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

    @Test
    public void deleteSqlserverAccountCallback() {
        client.deleteSqlserverAccount(param, new UcloudHandler<DeleteSqlserverAccountResult>() {
            @Override
            public Object success(DeleteSqlserverAccountResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(DeleteSqlserverAccountResult result) {
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