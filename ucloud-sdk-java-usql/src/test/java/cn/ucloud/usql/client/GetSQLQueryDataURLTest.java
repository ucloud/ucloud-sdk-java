package cn.ucloud.usql.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.usql.model.GetSQLQueryDataURLParam;
import cn.ucloud.usql.model.GetSQLQueryDataURLResult;
import cn.ucloud.usql.pojo.USQLConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;


/**
 * @Description : USQL.GetSQLQueryDataURL 测试
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 07:56
 **/
public class GetSQLQueryDataURLTest {

    private USQLClient client;

    private GetSQLQueryDataURLParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultUSQLClient(new USQLConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        String region = "cn-bj2";
        String queryId = "20190314_125527_00020_fmje5";
        param = new GetSQLQueryDataURLParam(region, queryId);
        param.setProjectId("org-pbmy1g");
    }


    @Test
    public void getSQLQueryDataURL() {
        try {
            GetSQLQueryDataURLResult result = client.getSQLQueryDataURL(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

}