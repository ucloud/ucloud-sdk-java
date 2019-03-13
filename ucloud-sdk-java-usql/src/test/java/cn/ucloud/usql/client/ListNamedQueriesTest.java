package cn.ucloud.usql.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.usql.model.ListNamedQueriesParam;
import cn.ucloud.usql.model.ListNamedQueriesResult;
import cn.ucloud.usql.pojo.USQLConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;


/**
 * @Description : USQL.ListNamedQueries 测试
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 07:56
 **/
public class ListNamedQueriesTest {

    private USQLClient client;

    private ListNamedQueriesParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultUSQLClient(new USQLConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        String region = "cn-sh2";
        param = new ListNamedQueriesParam(region);
        param.setProjectId("org-izug1m");
    }


    @Test
    public void listNamedQueries() {
        try {
            ListNamedQueriesResult result = client.listNamedQueries(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

    @Test
    public void listNamedQueriesCallback() {
        client.listNamedQueries(param, new UcloudHandler
                <ListNamedQueriesResult>() {
            @Override
            public Object success(ListNamedQueriesResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(ListNamedQueriesResult result) {
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