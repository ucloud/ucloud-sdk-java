package cn.ucloud.usql.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.usql.model.DeleteCatalogDatabaseParam;
import cn.ucloud.usql.model.DeleteCatalogDatabaseResult;
import cn.ucloud.usql.pojo.USQLConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;


/**
 * @Description : USQL.DeleteCatalogDatabase 测试
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 07:56
 **/
public class DeleteCatalogDatabaseTest {

    private USQLClient client;

    private DeleteCatalogDatabaseParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultUSQLClient(new USQLConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        String region = "cn-sh2";
        String databaseName = "cn-sh2";
        param = new DeleteCatalogDatabaseParam(region, databaseName);
        param.setProjectId("org-izug1m");
    }


    @Test
    public void deleteCatalogDatabase() {
        try {
            DeleteCatalogDatabaseResult result = client.deleteCatalogDatabase(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

    @Test
    public void deleteCatalogDatabaseCallback() {
        client.deleteCatalogDatabase(param, new UcloudHandler
                <DeleteCatalogDatabaseResult>() {
            @Override
            public Object success(DeleteCatalogDatabaseResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(DeleteCatalogDatabaseResult result) {
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