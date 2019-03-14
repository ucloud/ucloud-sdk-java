package cn.ucloud.usql.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.usql.model.EnableUSQLTokenParam;
import cn.ucloud.usql.model.EnableUSQLTokenResult;
import cn.ucloud.usql.pojo.USQLConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;


/**
 * @Description : USQL.EnableUSQLToken 测试
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 07:56
 **/
public class EnableUSQLTokenTest {

    private USQLClient client;

    private EnableUSQLTokenParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultUSQLClient(new USQLConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        String region = "cn-sh2";
        String dataSource = "cn-sh2";
        Integer state = 1;
        param = new EnableUSQLTokenParam(region, dataSource, state);
        param.setProjectId("org-izug1m");
    }


    @Test
    public void enableUSQLToken() {
        try {
            EnableUSQLTokenResult result = client.enableUSQLToken(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }
}