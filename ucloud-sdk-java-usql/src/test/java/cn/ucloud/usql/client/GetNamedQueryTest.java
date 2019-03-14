package cn.ucloud.usql.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.usql.model.GetNamedQueryParam;
import cn.ucloud.usql.model.GetNamedQueryResult;
import cn.ucloud.usql.pojo.USQLConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;


/**
 * @Description : USQL.GetNamedQuery 测试
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 07:56
 **/
public class GetNamedQueryTest {

    private USQLClient client;

    private GetNamedQueryParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultUSQLClient(new USQLConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        String region = "cn-sh2";
        Integer namedQueryId = 1;
        param = new GetNamedQueryParam(region, namedQueryId);
        param.setProjectId("org-izug1m");
    }


    @Test
    public void getNamedQuery() {
        try {
            GetNamedQueryResult result = client.getNamedQuery(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }


}