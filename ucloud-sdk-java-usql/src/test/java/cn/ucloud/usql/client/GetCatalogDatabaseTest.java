package cn.ucloud.usql.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.usql.model.GetCatalogDatabaseParam;
import cn.ucloud.usql.model.GetCatalogDatabaseResult;
import cn.ucloud.usql.pojo.USQLConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;


/**
 * @Description : USQL.GetCatalogDatabase 测试
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 07:56
 **/
public class GetCatalogDatabaseTest {

    private USQLClient client;

    private GetCatalogDatabaseParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultUSQLClient(new USQLConfig(
                new Account(System.getenv("UCloudPrivateKey"),
                        System.getenv("UCloudPublicKey"))));
        String region = "cn-bj2";
        String databaseName = "sdk_java";
        param = new GetCatalogDatabaseParam(region, databaseName);
        param.setProjectId("org-izug1m");
    }


    @Test
    public void getCatalogDatabase() {
        try {
            GetCatalogDatabaseResult result = client.getCatalogDatabase(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }
}