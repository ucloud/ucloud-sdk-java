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
        String region = "cn-bj2";
        param = new ListSQLQueriesParam(region);
        param.setProjectId("org-pbmy1g");
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

}