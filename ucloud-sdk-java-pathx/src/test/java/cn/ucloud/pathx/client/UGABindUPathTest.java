package cn.ucloud.pathx.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.pathx.model.UGABindUPathParam;
import cn.ucloud.pathx.model.UGABindUPathResult;
import cn.ucloud.pathx.pojo.PATHXConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;


/**
 * @Description : PATHX.UGABindUPath 测试
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 10:02
 **/
public class UGABindUPathTest {

    private PATHXClient client;

    private UGABindUPathParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultPATHXClient(new PATHXConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        String projectId = "cn-sh2";
        String uGAId = "cn-sh2";
        String uPathId = "cn-sh2";
        param = new UGABindUPathParam(projectId, uGAId, uPathId);
        param.setProjectId("org-izug1m");
    }


    @Test
    public void uGABindUPath() {
        try {
            UGABindUPathResult result = client.uGABindUPath(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

}