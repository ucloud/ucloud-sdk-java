package cn.ucloud.pathx.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.pathx.model.BindPathXSSLParam;
import cn.ucloud.pathx.model.BindPathXSSLResult;
import cn.ucloud.pathx.pojo.PATHXConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;


/**
 * @Description : PATHX.BindPathXSSL 测试
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 10:02
 **/
public class BindPathXSSLTest {

    private PATHXClient client;

    private BindPathXSSLParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultPATHXClient(new PATHXConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        String sSLId = "cn-sh2";
        String uGAId = "cn-sh2";
        param = new BindPathXSSLParam(sSLId, uGAId);
        param.setProjectId("org-izug1m");
    }


    @Test
    public void bindPathXSSL() {
        try {
            BindPathXSSLResult result = client.bindPathXSSL(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

}