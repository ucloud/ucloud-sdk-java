package cn.ucloud.usql.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.usql.model.RemoveUSQLTokenParam;
import cn.ucloud.usql.model.RemoveUSQLTokenResult;
import cn.ucloud.usql.pojo.USQLConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;


/**
 * @Description : USQL.RemoveUSQLToken 测试
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 07:56
 **/
public class RemoveUSQLTokenTest {

    private USQLClient client;

    private RemoveUSQLTokenParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultUSQLClient(new USQLConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        String region = "cn-sh2";
        String dataSource = "cn-sh2";
        param = new RemoveUSQLTokenParam(region, dataSource);
        param.setProjectId("org-izug1m");
    }


    @Test
    public void removeUSQLToken() {
        try {
            RemoveUSQLTokenResult result = client.removeUSQLToken(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

    @Test
    public void removeUSQLTokenCallback() {
        client.removeUSQLToken(param, new UcloudHandler
                <RemoveUSQLTokenResult>() {
            @Override
            public Object success(RemoveUSQLTokenResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(RemoveUSQLTokenResult result) {
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