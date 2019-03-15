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
        String region = "cn-bj2";
        String databaseName = "sdk_java";
        String tableName = "json_test";
        String location = "ufile://javasdk/sample.json.tar";
        String formation = "JSON";
        List<CreateCatalogTableParam.Column> columns = new ArrayList<>();
        columns.add(new CreateCatalogTableParam.Column("docId","string"));
        columns.add(new CreateCatalogTableParam.Column("user","struct<id:int,username:string,name:string," +
                "shippingaddress:struct<address1:string,address2:string,city:string,state:string>," +
                "orders:array<struct<itemid:int,orderdate:string>>>"));
        List<CreateCatalogTableParam.Property> properties = new ArrayList<>();
        properties.add(new CreateCatalogTableParam.Property("delimiter",","));
        param = new CreateCatalogTableParam(region, databaseName, tableName, location, formation,columns);
        param.setProperties(properties);
        param.setColumns(columns);
        param.setProjectId("org-izug1m");

    }


    @Test
    public void createCatalogTable() {
        try {
            CreateCatalogTableResult result = client.createCatalogTable(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            e.printStackTrace();
            assertNull(e);
        }
    }

}