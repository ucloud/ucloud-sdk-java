package cn.ucloud.usql.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.usql.model.ListUSQLTokensParam;
import cn.ucloud.usql.model.ListUSQLTokensResult;
import cn.ucloud.usql.pojo.USQLConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;


/**
 * @Description : USQL.ListUSQLTokens 测试
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 07:56
 **/
public class ListUSQLTokensTest {

    private USQLClient client;

    private ListUSQLTokensParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultUSQLClient(new USQLConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        String region = "cn-sh2";
        param = new ListUSQLTokensParam(region);
        param.setProjectId("org-izug1m");
    }


    @Test
    public void listUSQLTokens() {
        try {
            ListUSQLTokensResult result = client.listUSQLTokens(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

}