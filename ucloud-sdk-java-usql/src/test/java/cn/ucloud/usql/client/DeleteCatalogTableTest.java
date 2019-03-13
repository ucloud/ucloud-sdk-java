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
        String region = "cn-sh2";
        String databaseName = "cn-sh2";
        String tableName = "cn-sh2";
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

    @Test
    public void deleteCatalogTableCallback() {
        client.deleteCatalogTable(param, new UcloudHandler
                <DeleteCatalogTableResult>() {
            @Override
            public Object success(DeleteCatalogTableResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(DeleteCatalogTableResult result) {
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