package cn.ucloud.udb.client;

import cn.ucloud.common.handler.UcloudHandler;

import cn.ucloud.udb.model.CreateSqlserverAccountParam;
import cn.ucloud.udb.model.CreateSqlserverAccountResult;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-03-06 10:08
 **/
public class CreateSqlserverAccountTest {

    private UDBClient client;

    private CreateSqlserverAccountParam param;


    @Before
    public void setUp() throws Exception {
        client = GetUDBClient.getUDBClient();
        param = new CreateSqlserverAccountParam("cn-sh2", "SDKJAVA", "sdk-java-test", "");
        param.setProjectId("org-izug1m");
    }


    // todo 测试  线上资源售罄
    @Test
    public void createSqlserverAccount() {
        try {
            CreateSqlserverAccountResult result = client.createSqlserverAccount(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

    @Test
    public void createSqlserverAccountCallback() {
        client.createSqlserverAccount(param, new UcloudHandler<CreateSqlserverAccountResult>() {
            @Override
            public Object success(CreateSqlserverAccountResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(CreateSqlserverAccountResult result) {
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