package cn.ucloud.usql.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.usql.model.GetSQLQueryDataParam;
import cn.ucloud.usql.model.GetSQLQueryDataResult;
import cn.ucloud.usql.pojo.USQLConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;


/**
 * @Description : USQL.GetSQLQueryData 测试
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 07:56
 **/
public class GetSQLQueryDataTest {

    private USQLClient client;

    private GetSQLQueryDataParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultUSQLClient(new USQLConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        String region = "cn-sh2";
        String queryId = "cn-sh2";
        Integer limit = 1;
        param = new GetSQLQueryDataParam(region, queryId, limit);
        param.setProjectId("org-izug1m");
    }


    @Test
    public void getSQLQueryData() {
        try {
            GetSQLQueryDataResult result = client.getSQLQueryData(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

    @Test
    public void getSQLQueryDataCallback() {
        client.getSQLQueryData(param, new UcloudHandler
                <GetSQLQueryDataResult>() {
            @Override
            public Object success(GetSQLQueryDataResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(GetSQLQueryDataResult result) {
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