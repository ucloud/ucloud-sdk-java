package cn.ucloud.pathx.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.common.util.JSONComparator;
import cn.ucloud.pathx.model.DeleteUGAInstanceParam;
import cn.ucloud.pathx.model.DeleteUGAInstanceResult;
import cn.ucloud.pathx.pojo.PATHXConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;


/**
 * @Description : PATHX.DeleteUGAInstance 测试
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-12 04:27
 **/
public class DeleteUGAInstanceTest {

    private PATHXClient client;

    private DeleteUGAInstanceParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultPATHXClient(new PATHXConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        String projectId = "cn-sh2";
        String uGAId = "cn-sh2";
        param = new DeleteUGAInstanceParam(projectId, uGAId);
        param.setProjectId("org-izug1m");
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

    @Test
    public void deleteUGAInstanceCallback() {
        client.deleteUGAInstance(param, new UcloudHandler
                <DeleteUGAInstanceResult>() {
            @Override
            public Object success(DeleteUGAInstanceResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(DeleteUGAInstanceResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object error(Exception e) {
                assertNull(e);
                return null;
            }
        }, false);
    }
}