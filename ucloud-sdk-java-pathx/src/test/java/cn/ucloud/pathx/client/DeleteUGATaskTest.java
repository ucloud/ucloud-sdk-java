package cn.ucloud.pathx.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.pathx.model.DeleteUGATaskParam;
import cn.ucloud.pathx.model.DeleteUGATaskResult;
import cn.ucloud.pathx.pojo.PATHXConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;


/**
 * @Description : PATHX.DeleteUGATask 测试
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-12 04:27
 **/
public class DeleteUGATaskTest {

    private PATHXClient client;

    private DeleteUGATaskParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultPATHXClient(new PATHXConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        String projectId = "cn-sh2";
        String uGAId = "cn-sh2";
        param = new DeleteUGATaskParam(projectId, uGAId);
        param.setProjectId("org-izug1m");
    }


    @Test
    public void deleteUGATask() {
        try {
            DeleteUGATaskResult result = client.deleteUGATask(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

    @Test
    public void deleteUGATaskCallback() {
        client.deleteUGATask(param, new UcloudHandler
                <DeleteUGATaskResult>() {
            @Override
            public Object success(DeleteUGATaskResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(DeleteUGATaskResult result) {
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