package cn.ucloud.pathx.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.pathx.model.DescribePathXSSLParam;
import cn.ucloud.pathx.model.DescribePathXSSLResult;
import cn.ucloud.pathx.pojo.PATHXConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;


/**
 * @Description : PATHX.DescribePathXSSL 测试
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 10:02
 **/
public class DescribePathXSSLTest {

    private PATHXClient client;

    private DescribePathXSSLParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultPATHXClient(new PATHXConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        String projectId = "cn-sh2";
        param = new DescribePathXSSLParam(projectId);
        param.setProjectId("org-izug1m");
    }


    @Test
    public void describePathXSSL() {
        try {
            DescribePathXSSLResult result = client.describePathXSSL(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

}