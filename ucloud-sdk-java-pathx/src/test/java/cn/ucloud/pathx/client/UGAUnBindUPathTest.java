package cn.ucloud.pathx.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.pathx.model.UGAUnBindUPathParam;
import cn.ucloud.pathx.model.UGAUnBindUPathResult;
import cn.ucloud.pathx.pojo.PATHXConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;


/**
 * @Description : PATHX.UGAUnBindUPath 测试
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 10:02
 **/
public class UGAUnBindUPathTest {

    private PATHXClient client;

    private UGAUnBindUPathParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultPATHXClient(new PATHXConfig(
                new Account(System.getenv("UCloudPrivateKey"),
                        System.getenv("UCloudPublicKey"))));
        String projectId = "org-izug1m";
        String uGAId = "uga-f3q0ywyi";
        String uPathId = "upath-bwccmk2b";
        param = new UGAUnBindUPathParam(projectId, uGAId, uPathId);
    }


    @Test
    public void uGAUnBindUPath() {
        try {
            UGAUnBindUPathResult result = client.uGAUnBindUPath(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

}