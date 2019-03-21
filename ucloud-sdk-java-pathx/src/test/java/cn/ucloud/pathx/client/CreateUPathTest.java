package cn.ucloud.pathx.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.pathx.model.CreateUPathParam;
import cn.ucloud.pathx.model.CreateUPathResult;
import cn.ucloud.pathx.pojo.PATHXConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;


/**
 * @Description : PATHX.CreateUPath 测试
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 10:02
 **/
public class CreateUPathTest {

    private PATHXClient client;

    private CreateUPathParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultPATHXClient(new PATHXConfig(
                new Account(System.getenv("UCloudPrivateKey"),
                        System.getenv("UCloudPublicKey"))));
        String projectId = "org-izug1m";
        String name = "sdk-java-test";
        String lineId = "line_hk_cn-gd";
        Integer bandwidth = 2;
        String chargeType = "Dynamic";
        Integer quantity = 1;
        param = new CreateUPathParam(projectId, name, lineId, bandwidth, chargeType, quantity);
        param.setProjectId("org-izug1m");
    }


    @Test
    public void createUPath() {
        try {
            CreateUPathResult result = client.createUPath(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

}