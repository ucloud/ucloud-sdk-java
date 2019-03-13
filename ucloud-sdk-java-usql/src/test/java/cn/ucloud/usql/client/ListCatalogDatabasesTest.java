package cn.ucloud.usql.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.usql.model.ListCatalogDatabasesParam;
import cn.ucloud.usql.model.ListCatalogDatabasesResult;
import cn.ucloud.usql.pojo.USQLConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;


/**
 * @Description : USQL.ListCatalogDatabases 测试
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 07:56
 **/
public class ListCatalogDatabasesTest {

    private USQLClient client;

    private ListCatalogDatabasesParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultUSQLClient(new USQLConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        String region = "cn-sh2";
        param = new ListCatalogDatabasesParam(region);
        param.setProjectId("org-izug1m");
    }


    @Test
    public void listCatalogDatabases() {
        try {
            ListCatalogDatabasesResult result = client.listCatalogDatabases(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

    @Test
    public void listCatalogDatabasesCallback() {
        client.listCatalogDatabases(param, new UcloudHandler
                <ListCatalogDatabasesResult>() {
            @Override
            public Object success(ListCatalogDatabasesResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(ListCatalogDatabasesResult result) {
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