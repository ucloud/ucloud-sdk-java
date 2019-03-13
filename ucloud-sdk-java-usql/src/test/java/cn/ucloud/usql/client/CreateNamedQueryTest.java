package cn.ucloud.usql.client;

import cn.ucloud.common.handler.UcloudHandler;
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


    @Before
    public void setUp() throws Exception {
        client = new DefaultUSQLClient(new USQLConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        String region = "cn-sh2";
        String queryName = "cn-sh2";
        String queryString = "cn-sh2";
        param = new CreateNamedQueryParam(region, queryName, queryString);
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

    @Test
    public void createNamedQueryCallback() {
        client.createNamedQuery(param, new UcloudHandler
                <CreateNamedQueryResult>() {
            @Override
            public Object success(CreateNamedQueryResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(CreateNamedQueryResult result) {
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