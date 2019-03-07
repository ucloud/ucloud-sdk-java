package cn.ucloud.pathx.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.common.util.JSONComparator;
import cn.ucloud.pathx.model.DeleteCommonUGAInstanceParam;
import cn.ucloud.pathx.model.DeleteCommonUGAInstanceResult;
import cn.ucloud.pathx.pojo.PATHXConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;


/**
 * @Description : PATHX.DeleteCommonUGAInstance 测试
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-07 04:19
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

    @Test
    public void deleteCommonUGAInstanceCallback() {
        client.deleteCommonUGAInstance(param, new UcloudHandler
                <DeleteCommonUGAInstanceResult>() {
            @Override
            public Object success(DeleteCommonUGAInstanceResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(DeleteCommonUGAInstanceResult result) {
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