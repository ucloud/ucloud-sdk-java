package cn.ucloud.usql.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.usql.model.RemoveTokenForUSQLParam;
import cn.ucloud.usql.model.RemoveTokenForUSQLResult;
import cn.ucloud.usql.pojo.USQLConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;


/**
 * @Description : USQL.RemoveTokenForUSQL 测试
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 07:56
 **/
public class RemoveTokenForUSQLTest {

    private USQLClient client;

    private RemoveTokenForUSQLParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultUSQLClient(new USQLConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        String dataSourceType = "cn-sh2";
        String dataSourceName = "cn-sh2";
        param = new RemoveTokenForUSQLParam(dataSourceType, dataSourceName);
        param.setProjectId("org-izug1m");
    }


    @Test
    public void removeTokenForUSQL() {
        try {
            RemoveTokenForUSQLResult result = client.removeTokenForUSQL(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

}