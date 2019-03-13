package cn.ucloud.pathx.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.pathx.model.InsertPathXWhitelistParam;
import cn.ucloud.pathx.model.InsertPathXWhitelistResult;
import cn.ucloud.pathx.pojo.PATHXConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;


/**
 * @Description : PATHX.InsertPathXWhitelist 测试
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 10:02
 **/
public class InsertPathXWhitelistTest {

    private PATHXClient client;

    private InsertPathXWhitelistParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultPATHXClient(new PATHXConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        String projectId = "cn-sh2";
        String instanceId = "cn-sh2";
        param = new InsertPathXWhitelistParam(projectId, instanceId);
        param.setProjectId("org-izug1m");
    }


    @Test
    public void insertPathXWhitelist() {
        try {
            InsertPathXWhitelistResult result = client.insertPathXWhitelist(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

}