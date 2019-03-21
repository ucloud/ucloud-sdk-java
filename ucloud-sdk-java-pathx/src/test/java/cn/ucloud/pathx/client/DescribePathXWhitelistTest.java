package cn.ucloud.pathx.client;

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
 * @Date : 2019-03-13 10:02
 **/
public class DescribePathXWhitelistTest {

    private PATHXClient client;

    private DescribePathXWhitelistParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultPATHXClient(new PATHXConfig(
                new Account(System.getenv("UCloudPrivateKey"),
                        System.getenv("UCloudPublicKey"))));
        String projectId = "org-izug1m";
        param = new DescribePathXWhitelistParam(projectId);
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

}