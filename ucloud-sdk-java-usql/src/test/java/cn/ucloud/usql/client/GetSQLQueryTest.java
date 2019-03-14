package cn.ucloud.usql.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.usql.model.GetSQLQueryParam;
import cn.ucloud.usql.model.GetSQLQueryResult;
import cn.ucloud.usql.pojo.USQLConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;


/**
 * @Description : USQL.GetSQLQuery 测试
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 07:56
 **/
public class GetSQLQueryTest {

    private USQLClient client;

    private GetSQLQueryParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultUSQLClient(new USQLConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        String region = "cn-sh2";
        String queryId = "cn-sh2";
        param = new GetSQLQueryParam(region, queryId);
        param.setProjectId("org-izug1m");
    }


    @Test
    public void getSQLQuery() {
        try {
            GetSQLQueryResult result = client.getSQLQuery(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }
}