package cn.ucloud.usql.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.usql.model.RunSQLQueryParam;
import cn.ucloud.usql.model.RunSQLQueryResult;
import cn.ucloud.usql.pojo.USQLConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;


/**
 * @Description : USQL.RunSQLQuery 测试
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 07:56
 **/
public class RunSQLQueryTest {

    private USQLClient client;

    private RunSQLQueryParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultUSQLClient(new USQLConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        String region = "cn-sh2";
        String databaseName = "cn-sh2";
        String queryString = "cn-sh2";
        param = new RunSQLQueryParam(region, databaseName, queryString);
        param.setProjectId("org-izug1m");
    }


    @Test
    public void runSQLQuery() {
        try {
            RunSQLQueryResult result = client.runSQLQuery(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

    @Test
    public void runSQLQueryCallback() {
        client.runSQLQuery(param, new UcloudHandler
                <RunSQLQueryResult>() {
            @Override
            public Object success(RunSQLQueryResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(RunSQLQueryResult result) {
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