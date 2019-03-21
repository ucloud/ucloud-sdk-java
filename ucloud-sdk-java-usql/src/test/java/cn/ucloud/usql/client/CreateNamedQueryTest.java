package cn.ucloud.usql.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.usql.model.CreateNamedQueryParam;
import cn.ucloud.usql.model.CreateNamedQueryResult;
import cn.ucloud.usql.pojo.USQLConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;


/**
 * @Description : USQL.CreateNamedQuery 测试
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 07:56
 **/
public class CreateNamedQueryTest {

    private USQLClient client;

    private CreateNamedQueryParam param;

    private String qs = "CREATE EXTERNAL TABLE `complex_json`( \n" +
            "              `docid` string COMMENT 'from deserializer',  \n" +
            "              `user` struct<id:int,username:string,name:string,shippingaddress:struct<address1:string,address2:string,city:string,state:string>,orders:array<struct<itemid:int,orderdate:string>>> COMMENT 'from deserializer') \n" +
            "            ROW FORMAT SERDE  \n" +
            "              'org.openx.data.jsonserde.JsonSerDe' \n" +
            "            STORED AS INPUTFORMAT  \n" +
            "              'org.apache.hadoop.mapred.TextInputFormat'  \n" +
            "            OUTPUTFORMAT  \n" +
            "              'org.apache.hadoop.hive.ql.io.IgnoreKeyTextOutputFormat' \n" +
            "            LOCATION \n" +
            "              'ufile://javasdk/sample.json.tar';";

    @Before
    public void setUp() throws Exception {
        client = new DefaultUSQLClient(new USQLConfig(
                new Account(System.getenv("UCloudPrivateKey"),
                        System.getenv("UCloudPublicKey"))));
        String region = "cn-bj2";
        String queryName = "sdk_java2";
        String queryString = qs;
        String queryDescription = "sdk_java";
        param = new CreateNamedQueryParam(region, queryName, queryString,queryDescription);
        param.setProjectId("org-izug1m");
    }


    @Test
    public void createNamedQuery() {
        try {
            CreateNamedQueryResult result = client.createNamedQuery(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

}