package cn.ucloud.pathx.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.pathx.model.DeleteUPathParam;
import cn.ucloud.pathx.model.DeleteUPathResult;
import cn.ucloud.pathx.pojo.PATHXConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;


/**
 * @Description : PATHX.DeleteUPath 测试
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 10:02
 **/
public class DeleteUPathTest {

    private PATHXClient client;

    private DeleteUPathParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultPATHXClient(new PATHXConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        String projectId = "cn-sh2";
        String uPathId = "cn-sh2";
        param = new DeleteUPathParam(projectId, uPathId);
        param.setProjectId("org-izug1m");
    }


    @Test
    public void deleteUPath() {
        try {
            DeleteUPathResult result = client.deleteUPath(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

}