package cn.ucloud.pathx.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.pathx.model.DescribeUPathTemplateParam;
import cn.ucloud.pathx.model.DescribeUPathTemplateResult;
import cn.ucloud.pathx.pojo.PATHXConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;


/**
 * @Description : PATHX.DescribeUPathTemplate 测试
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 10:02
 **/
public class DescribeUPathTemplateTest {

    private PATHXClient client;

    private DescribeUPathTemplateParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultPATHXClient(new PATHXConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        String projectId = "org-izug1m";
        String uPathId = "upath-bwccmk2b";
        param = new DescribeUPathTemplateParam(projectId, uPathId);
    }

    @Test
    public void describeUPathTemplate() {
        try {
            DescribeUPathTemplateResult result = client.describeUPathTemplate(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

}