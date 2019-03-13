package cn.ucloud.usql.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.usql.model.ListTokensForUSQLParam;
import cn.ucloud.usql.model.ListTokensForUSQLResult;
import cn.ucloud.usql.pojo.USQLConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;


/**
 * @Description : USQL.ListTokensForUSQL 测试
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 07:56
 **/
public class ListTokensForUSQLTest {

    private USQLClient client;

    private ListTokensForUSQLParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultUSQLClient(new USQLConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        param = new ListTokensForUSQLParam();
        param.setProjectId("org-izug1m");
    }


    @Test
    public void listTokensForUSQL() {
        try {
            ListTokensForUSQLResult result = client.listTokensForUSQL(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

    @Test
    public void listTokensForUSQLCallback() {
        client.listTokensForUSQL(param, new UcloudHandler
                <ListTokensForUSQLResult>() {
            @Override
            public Object success(ListTokensForUSQLResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(ListTokensForUSQLResult result) {
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