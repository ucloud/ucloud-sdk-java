package cn.ucloud.usql.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.usql.model.OpenUSQLServiceParam;
import cn.ucloud.usql.model.OpenUSQLServiceResult;
import cn.ucloud.usql.pojo.USQLConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;


/**
 * @Description : USQL.OpenUSQLService 测试
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 07:56
 **/
public class OpenUSQLServiceTest {

    private USQLClient client;

    private OpenUSQLServiceParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultUSQLClient(new USQLConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        String region = "cn-sh2";
        String zone = "cn-sh2";
        String username = "cn-sh2";
        String mobile = "cn-sh2";
        String email = "cn-sh2";
        param = new OpenUSQLServiceParam(region, zone, username, mobile, email);
        param.setProjectId("org-izug1m");
    }


    @Test
    public void openUSQLService() {
        try {
            OpenUSQLServiceResult result = client.openUSQLService(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

}