package cn.ucloud.usql.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.usql.model.ListCatalogTablePropertiesParam;
import cn.ucloud.usql.model.ListCatalogTablePropertiesResult;
import cn.ucloud.usql.pojo.USQLConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;


/**
 * @Description : USQL.ListCatalogTableProperties 测试
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 07:56
 **/
public class ListCatalogTablePropertiesTest {

    private USQLClient client;

    private ListCatalogTablePropertiesParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultUSQLClient(new USQLConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        String region = "cn-bj2";
        String databaseName = "sdk_java";
        String tableName = "cn-sh2";
        param = new ListCatalogTablePropertiesParam(region, databaseName, tableName);
        param.setProjectId("org-izug1m");
    }

    @Test
    public void listCatalogTableProperties() {
        try {
            ListCatalogTablePropertiesResult result = client.listCatalogTableProperties(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }
}