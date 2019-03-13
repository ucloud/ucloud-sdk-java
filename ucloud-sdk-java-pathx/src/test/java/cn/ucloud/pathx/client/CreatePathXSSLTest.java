package cn.ucloud.pathx.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.pathx.model.CreatePathXSSLParam;
import cn.ucloud.pathx.model.CreatePathXSSLResult;
import cn.ucloud.pathx.pojo.PATHXConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;


/**
 * @Description : PATHX.CreatePathXSSL 测试
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 10:02
 **/
public class CreatePathXSSLTest {

    private PATHXClient client;

    private CreatePathXSSLParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultPATHXClient(new PATHXConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        String projectId = "cn-sh2";
        String sSLName = "cn-sh2";
        param = new CreatePathXSSLParam(projectId, sSLName);
        param.setProjectId("org-izug1m");
    }


    @Test
    public void createPathXSSL() {
        try {
            CreatePathXSSLResult result = client.createPathXSSL(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

}