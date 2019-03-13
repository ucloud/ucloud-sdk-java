package cn.ucloud.pathx.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.pathx.model.DeleteCommonUGAInstanceParam;
import cn.ucloud.pathx.model.DeleteCommonUGAInstanceResult;
import cn.ucloud.pathx.pojo.PATHXConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;


/**
 * @Description : PATHX.DeleteCommonUGAInstance 测试
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 10:02
 **/
public class DeleteCommonUGAInstanceTest {

    private PATHXClient client;

    private DeleteCommonUGAInstanceParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultPATHXClient(new PATHXConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        String projectId = "cn-sh2";
        String uGAId = "cn-sh2";
        String uGAType = "cn-sh2";
        param = new DeleteCommonUGAInstanceParam(projectId, uGAId, uGAType);
        param.setProjectId("org-izug1m");
    }


    @Test
    public void deleteCommonUGAInstance() {
        try {
            DeleteCommonUGAInstanceResult result = client.deleteCommonUGAInstance(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

}