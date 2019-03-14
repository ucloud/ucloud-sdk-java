package cn.ucloud.usql.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.usql.model.AddTokenForUSQLParam;
import cn.ucloud.usql.model.AddTokenForUSQLResult;
import cn.ucloud.usql.pojo.USQLConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;


/**
 * @Description : USQL.AddTokenForUSQL 测试
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 07:56
 **/
public class AddTokenForUSQLTest {

    private USQLClient client;

    private AddTokenForUSQLParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultUSQLClient(new USQLConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        String dataSourceType = "cn-sh2";
        String dataSourceName = "cn-sh2";
        String publicKey = "cn-sh2";
        String privateKey = "cn-sh2";
        param = new AddTokenForUSQLParam(dataSourceType, dataSourceName, publicKey, privateKey);
        param.setProjectId("org-izug1m");
    }


    @Test
    public void addTokenForUSQL() {
        try {
            AddTokenForUSQLResult result = client.addTokenForUSQL(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }
}