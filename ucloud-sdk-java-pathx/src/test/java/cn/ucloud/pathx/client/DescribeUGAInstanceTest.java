package cn.ucloud.pathx.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.pathx.model.DescribeUGAInstanceParam;
import cn.ucloud.pathx.model.DescribeUGAInstanceResult;
import cn.ucloud.pathx.pojo.PATHXConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;


/**
 * @Description : PATHX.DescribeUGAInstance 测试
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 10:02
 **/
public class DescribeUGAInstanceTest {

    private PATHXClient client;

    private DescribeUGAInstanceParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultPATHXClient(new PATHXConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        String projectId = "cn-sh2";
        param = new DescribeUGAInstanceParam(projectId);
        param.setProjectId("org-izug1m");
    }


    @Test
    public void describeUGAInstance() {
        try {
            DescribeUGAInstanceResult result = client.describeUGAInstance(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

}