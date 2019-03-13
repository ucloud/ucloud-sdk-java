package cn.ucloud.usql.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.usql.model.DeleteNamedQueryParam;
import cn.ucloud.usql.model.DeleteNamedQueryResult;
import cn.ucloud.usql.pojo.USQLConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;


/**
 * @Description : USQL.DeleteNamedQuery 测试
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 07:56
 **/
public class DeleteNamedQueryTest {

    private USQLClient client;

    private DeleteNamedQueryParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultUSQLClient(new USQLConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        String region = "cn-sh2";
        String namedQueryId = "cn-sh2";
        param = new DeleteNamedQueryParam(region, namedQueryId);
        param.setProjectId("org-izug1m");
    }


    @Test
    public void deleteNamedQuery() {
        try {
            DeleteNamedQueryResult result = client.deleteNamedQuery(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

    @Test
    public void deleteNamedQueryCallback() {
        client.deleteNamedQuery(param, new UcloudHandler
                <DeleteNamedQueryResult>() {
            @Override
            public Object success(DeleteNamedQueryResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(DeleteNamedQueryResult result) {
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