package cn.ucloud.pathx.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.common.util.JSONComparator;
import cn.ucloud.pathx.model.DescribeGlobalSSHInstanceParam;
import cn.ucloud.pathx.model.DescribeGlobalSSHInstanceResult;
import cn.ucloud.pathx.pojo.PATHXConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;


/**
 * @Description : PATHX.DescribeGlobalSSHInstance 测试
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-07 04:19
 **/
public class DescribeGlobalSSHInstanceTest {

    private PATHXClient client;

    private DescribeGlobalSSHInstanceParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultPATHXClient(new PATHXConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        String projectId = "cn-sh2";
        param = new DescribeGlobalSSHInstanceParam(projectId);
        param.setProjectId("org-izug1m");
    }


    @Test
    public void describeGlobalSSHInstance() {
        try {
            DescribeGlobalSSHInstanceResult result = client.describeGlobalSSHInstance(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

    @Test
    public void describeGlobalSSHInstanceCallback() {
        client.describeGlobalSSHInstance(param, new UcloudHandler
                <DescribeGlobalSSHInstanceResult>() {
            @Override
            public Object success(DescribeGlobalSSHInstanceResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(DescribeGlobalSSHInstanceResult result) {
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