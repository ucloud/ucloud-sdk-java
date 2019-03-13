package cn.ucloud.usql.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.usql.model.ListSQLQueriesParam;
import cn.ucloud.usql.model.ListSQLQueriesResult;
import cn.ucloud.usql.pojo.USQLConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;


/**
 * @Description : USQL.ListSQLQueries 测试
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 07:56
 **/
public class ListSQLQueriesTest {

    private USQLClient client;

    private ListSQLQueriesParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultUSQLClient(new USQLConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        String region = "cn-sh2";
        param = new ListSQLQueriesParam(region);
        param.setProjectId("org-izug1m");
    }


    @Test
    public void listSQLQueries() {
        try {
            ListSQLQueriesResult result = client.listSQLQueries(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

    @Test
    public void listSQLQueriesCallback() {
        client.listSQLQueries(param, new UcloudHandler
                <ListSQLQueriesResult>() {
            @Override
            public Object success(ListSQLQueriesResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(ListSQLQueriesResult result) {
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