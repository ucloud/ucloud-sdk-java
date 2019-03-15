package cn.ucloud.pathx.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.pathx.model.DescribeGlobalSSHAreaParam;
import cn.ucloud.pathx.model.DescribeGlobalSSHAreaResult;
import cn.ucloud.pathx.pojo.PATHXConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;


/**
 * @Description : PATHX.DescribeGlobalSSHArea 测试
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 10:02
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
        //param.setProjectId("org-izug1m");
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

}