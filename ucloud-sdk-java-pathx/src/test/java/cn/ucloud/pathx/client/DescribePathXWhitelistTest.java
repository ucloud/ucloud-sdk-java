package cn.ucloud.pathx.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.pathx.model.DescribePathXWhitelistParam;
import cn.ucloud.pathx.model.DescribePathXWhitelistResult;
import cn.ucloud.pathx.pojo.PATHXConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;


/**
 * @Description : PATHX.DescribePathXWhitelist 测试
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-12 04:27
 **/
public class DescribePathXWhitelistTest {

    private PATHXClient client;

    private DescribePathXWhitelistParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultPATHXClient(new PATHXConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        String projectId = "cn-sh2";
        param = new DescribePathXWhitelistParam(projectId);
        param.setProjectId("org-izug1m");
    }


    @Test
    public void describePathXWhitelist() {
        try {
            DescribePathXWhitelistResult result = client.describePathXWhitelist(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

    @Test
    public void describePathXWhitelistCallback() {
        client.describePathXWhitelist(param, new UcloudHandler
                <DescribePathXWhitelistResult>() {
            @Override
            public Object success(DescribePathXWhitelistResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(DescribePathXWhitelistResult result) {
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