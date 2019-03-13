package cn.ucloud.pathx.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.pathx.model.CheckPreCNameParam;
import cn.ucloud.pathx.model.CheckPreCNameResult;
import cn.ucloud.pathx.pojo.PATHXConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;


/**
 * @Description : PATHX.CheckPreCName 测试
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 10:02
 **/
public class CheckPreCNameTest {

    private PATHXClient client;

    private CheckPreCNameParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultPATHXClient(new PATHXConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        String preCName = "cn-sh2";
        String uGAType = "cn-sh2";
        param = new CheckPreCNameParam(preCName, uGAType);
        param.setProjectId("org-izug1m");
    }


    @Test
    public void checkPreCName() {
        try {
            CheckPreCNameResult result = client.checkPreCName(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

}