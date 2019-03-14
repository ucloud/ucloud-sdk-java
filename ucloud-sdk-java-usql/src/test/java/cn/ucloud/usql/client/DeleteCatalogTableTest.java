package cn.ucloud.usql.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.usql.model.DeleteCatalogTableParam;
import cn.ucloud.usql.model.DeleteCatalogTableResult;
import cn.ucloud.usql.pojo.USQLConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;


/**
 * @Description : USQL.DeleteCatalogTable 测试
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 07:56
 **/
public class DeleteCatalogTableTest {

    private USQLClient client;

    private DeleteCatalogTableParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultUSQLClient(new USQLConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        String region = "cn-bj2";
        String databaseName = "sdk_java";
        String tableName = "json_test";
        param = new DeleteCatalogTableParam(region, databaseName, tableName);
        param.setProjectId("org-izug1m");
    }


    @Test
    public void deleteCatalogTable() {
        try {
            DeleteCatalogTableResult result = client.deleteCatalogTable(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }
}