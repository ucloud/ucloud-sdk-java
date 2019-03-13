package cn.ucloud.usql.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.usql.model.GetCatalogTableDDLParam;
import cn.ucloud.usql.model.GetCatalogTableDDLResult;
import cn.ucloud.usql.pojo.USQLConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;


/**
 * @Description : USQL.GetCatalogTableDDL 测试
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 07:56
 **/
public class GetCatalogTableDDLTest {

    private USQLClient client;

    private GetCatalogTableDDLParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultUSQLClient(new USQLConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        String region = "cn-sh2";
        String databaseName = "cn-sh2";
        String tableName = "cn-sh2";
        param = new GetCatalogTableDDLParam(region, databaseName, tableName);
        param.setProjectId("org-izug1m");
    }


    @Test
    public void getCatalogTableDDL() {
        try {
            GetCatalogTableDDLResult result = client.getCatalogTableDDL(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

    @Test
    public void getCatalogTableDDLCallback() {
        client.getCatalogTableDDL(param, new UcloudHandler
                <GetCatalogTableDDLResult>() {
            @Override
            public Object success(GetCatalogTableDDLResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(GetCatalogTableDDLResult result) {
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