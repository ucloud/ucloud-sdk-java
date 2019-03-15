package cn.ucloud.pathx.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.pathx.model.DescribeCommonUGAInstanceParam;
import cn.ucloud.pathx.model.DescribeCommonUGAInstanceResult;
import cn.ucloud.pathx.pojo.PATHXConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;


/**
 * @Description : PATHX.DescribeCommonUGAInstance 测试
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 10:02
 **/
public class DescribeCommonUGAInstanceTest {

    private PATHXClient client;

    private DescribeCommonUGAInstanceParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultPATHXClient(new PATHXConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        String projectId = "org-izug1m";
        String uGAType = "AppStore";
        param = new DescribeCommonUGAInstanceParam(projectId, uGAType);
        param.setProjectId("org-izug1m");
    }


    @Test
    public void describeCommonUGAInstance() {
        try {
            DescribeCommonUGAInstanceResult result = client.describeCommonUGAInstance(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

}