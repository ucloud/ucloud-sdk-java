package cn.ucloud.pathx.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.common.util.JSONComparator;
import cn.ucloud.pathx.model.DescribeGlobalSSHAreaParam;
import cn.ucloud.pathx.model.DescribeGlobalSSHAreaResult;
import cn.ucloud.pathx.pojo.PATHXConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;


/**
 * @Description : PATHX.DescribeGlobalSSHArea 测试
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-12 04:27
 **/
public class DescribeGlobalSSHAreaTest {

    private PATHXClient client;

    private DescribeGlobalSSHAreaParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultPATHXClient(new PATHXConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        param = new DescribeGlobalSSHAreaParam();
        param.setProjectId("org-izug1m");
    }


    @Test
    public void describeGlobalSSHArea() {
        try {
            DescribeGlobalSSHAreaResult result = client.describeGlobalSSHArea(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

    @Test
    public void describeGlobalSSHAreaCallback() {
        client.describeGlobalSSHArea(param, new UcloudHandler
                <DescribeGlobalSSHAreaResult>() {
            @Override
            public Object success(DescribeGlobalSSHAreaResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(DescribeGlobalSSHAreaResult result) {
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