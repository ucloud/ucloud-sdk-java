package cn.ucloud.usql.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.usql.model.CancelSQLQueryParam;
import cn.ucloud.usql.model.CancelSQLQueryResult;
import cn.ucloud.usql.pojo.USQLConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;


/**
 * @Description : USQL.CancelSQLQuery 测试
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 07:56
 **/
public class CancelSQLQueryTest {

    private USQLClient client;

    private CancelSQLQueryParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultUSQLClient(new USQLConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        String region = "cn-sh2";
        String queryId = "cn-sh2";
        param = new CancelSQLQueryParam(region, queryId);
        param.setProjectId("org-izug1m");
    }


    @Test
    public void cancelSQLQuery() {
        try {
            CancelSQLQueryResult result = client.cancelSQLQuery(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

}