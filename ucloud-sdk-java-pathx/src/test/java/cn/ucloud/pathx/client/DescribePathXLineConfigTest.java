package cn.ucloud.pathx.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.pathx.model.DescribePathXLineConfigParam;
import cn.ucloud.pathx.model.DescribePathXLineConfigResult;
import cn.ucloud.pathx.pojo.PATHXConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;


/**
 * @Description : PATHX.DescribePathXLineConfig 测试
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 10:02
 **/
public class DescribePathXLineConfigTest {

    private PATHXClient client;

    private DescribePathXLineConfigParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultPATHXClient(new PATHXConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        param = new DescribePathXLineConfigParam();
        param.setProjectId("org-izug1m");
    }


    @Test
    public void describePathXLineConfig() {
        try {
            DescribePathXLineConfigResult result = client.describePathXLineConfig(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

}