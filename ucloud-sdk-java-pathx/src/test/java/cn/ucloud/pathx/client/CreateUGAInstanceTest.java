package cn.ucloud.pathx.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.pathx.model.CreateUGAInstanceParam;
import cn.ucloud.pathx.model.CreateUGAInstanceResult;
import cn.ucloud.pathx.pojo.PATHXConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;


/**
 * @Description : PATHX.CreateUGAInstance 测试
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 10:02
 **/
public class CreateUGAInstanceTest {

    private PATHXClient client;

    private CreateUGAInstanceParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultPATHXClient(new PATHXConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        String projectId = "cn-sh2";
        String name = "cn-sh2";
        param = new CreateUGAInstanceParam(projectId, name);
        param.setProjectId("org-izug1m");
    }


    @Test
    public void createUGAInstance() {
        try {
            CreateUGAInstanceResult result = client.createUGAInstance(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

}