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

    private String qs = "select * from part";

    @Before
    public void setUp() throws Exception {
        client = new DefaultUSQLClient(new USQLConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        String region = "cn-bj2";
        String databaseName = "example";
        String queryString = qs;
        param = new RunSQLQueryParam(region, databaseName, queryString);
        param.setProjectId("org-pbmy1g");
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

}