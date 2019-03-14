package cn.ucloud.usql.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.usql.model.AddUSQLTokenParam;
import cn.ucloud.usql.model.AddUSQLTokenResult;
import cn.ucloud.usql.pojo.USQLConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;


/**
 * @Description : USQL.AddUSQLToken 测试
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 07:56
 **/
public class AddUSQLTokenTest {

    private USQLClient client;

    private AddUSQLTokenParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultUSQLClient(new USQLConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        String region = "cn-bj2";
        String dataSource = "ufile";
        String accessKeyId = System.getenv("UFileKey");
        String accessKeySecret = System.getenv("UFileSecret");
        param = new AddUSQLTokenParam(region, dataSource, accessKeyId, accessKeySecret);
        param.setProjectId("org-izug1m");
    }


    @Test
    public void addUSQLToken() {
        try {
            AddUSQLTokenResult result = client.addUSQLToken(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

}