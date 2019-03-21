package cn.ucloud.pathx.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.pathx.model.DeleteUGAInstanceParam;
import cn.ucloud.pathx.model.DeleteUGAInstanceResult;
import cn.ucloud.pathx.pojo.PATHXConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;


/**
 * @Description : PATHX.DeleteUGAInstance 测试
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 10:02
 **/
public class DeleteUGAInstanceTest {

    private PATHXClient client;

    private DeleteUGAInstanceParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultPATHXClient(new PATHXConfig(
                new Account(System.getenv("UCloudPrivateKey"),
                        System.getenv("UCloudPublicKey"))));
        String projectId = "org-izug1m";
        String uGAId = "uga-rupp1qsj";
        param = new DeleteUGAInstanceParam(projectId, uGAId);
    }


    @Test
    public void deleteUGAInstance() {
        try {
            DeleteUGAInstanceResult result = client.deleteUGAInstance(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

}