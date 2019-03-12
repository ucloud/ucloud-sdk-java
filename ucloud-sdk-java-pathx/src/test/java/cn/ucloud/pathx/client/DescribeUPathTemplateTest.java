package cn.ucloud.pathx.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.common.util.JSONComparator;
import cn.ucloud.pathx.model.DescribeUPathTemplateParam;
import cn.ucloud.pathx.model.DescribeUPathTemplateResult;
import cn.ucloud.pathx.pojo.PATHXConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;


/**
 * @Description : PATHX.DescribeUPathTemplate 测试
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-12 04:27
 **/
public class DescribeUPathTemplateTest {

    private PATHXClient client;

    private DescribeUPathTemplateParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultPATHXClient(new PATHXConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        String projectId = "cn-sh2";
        String uPathId = "cn-sh2";
        param = new DescribeUPathTemplateParam(projectId, uPathId);
        param.setProjectId("org-izug1m");
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

    @Test
    public void describeUPathTemplateCallback() {
        client.describeUPathTemplate(param, new UcloudHandler
                <DescribeUPathTemplateResult>() {
            @Override
            public Object success(DescribeUPathTemplateResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(DescribeUPathTemplateResult result) {
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