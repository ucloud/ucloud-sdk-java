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
                new Account(System.getenv("UCloudPrivateKey"),
                        System.getenv("UCloudPublicKey"))));
        String projectId = "org-izug1m";
        String uGAId = "uga-f3q0ywyi";
        String uPathId = "upath-bwccmk2b";
        param = new UGABindUPathParam(projectId, uGAId, uPathId);
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