package cn.ucloud.usql.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.usql.model.CreateCatalogTableParam;
import cn.ucloud.usql.model.CreateCatalogTableResult;
import cn.ucloud.usql.pojo.USQLConfig;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertNull;


/**
 * @Description : USQL.CreateCatalogTable 测试
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 07:56
 **/
public class CreateCatalogTableTest {

    private USQLClient client;

    private CreateCatalogTableParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultUSQLClient(new USQLConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        String region = "cn-sh2";
        String databaseName = "cn-sh2";
        String tableName = "cn-sh2";
        String location = "cn-sh2";
        String formation = "cn-sh2";
        List<CreateCatalogTableParam.Column> columns = new ArrayList<>();
        param = new CreateCatalogTableParam(region, databaseName, tableName, location, formation,columns);
        param.setProjectId("org-izug1m");
    }


    @Test
    public void createCatalogTable() {
        try {
            CreateCatalogTableResult result = client.createCatalogTable(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

}