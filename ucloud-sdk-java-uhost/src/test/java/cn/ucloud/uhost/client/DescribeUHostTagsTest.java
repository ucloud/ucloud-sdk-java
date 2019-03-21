package cn.ucloud.uhost.client;

import cn.ucloud.uhost.client.DefaultUhostClient;
import cn.ucloud.uhost.client.UhostClient;
import cn.ucloud.uhost.model.DescribeUHostTagsParam;
import cn.ucloud.uhost.model.DescribeUHostTagsResult;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.uhost.pojo.UhostConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-17 14:46
 **/
public class DescribeUHostTagsTest {

    private UhostClient client;

    private DescribeUHostTagsParam param;

    @Before
    public void initData() {
        client = new DefaultUhostClient(new UhostConfig(
                new Account(System.getenv("UCloudPrivateKey"),
                        System.getenv("UCloudPublicKey"))));
        param = new DescribeUHostTagsParam("cn-sh2");
        param.setProjectId("org-izug1m");
    }


    @Test
    public void describeUHostTags() {
        try {
            DescribeUHostTagsResult result = client.describeUHostTags(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }
}