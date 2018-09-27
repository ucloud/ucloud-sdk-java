package cn.ucloud.uhost.client;

import cn.ucloud.uhost.client.DefaultUhostClient;
import cn.ucloud.uhost.client.UhostClient;
import cn.ucloud.uhost.model.DescribeUHostTagsParam;
import cn.ucloud.uhost.model.DescribeUHostTagsResult;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.uhost.pojo.UhostConfig;
import org.junit.Before;
import org.junit.Test;

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
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        param = new DescribeUHostTagsParam("cn-bj2");
        param.setProjectId("org-4nfe1i");
    }


    @Test
    public void describeUHostTags() {
        try {
            DescribeUHostTagsResult describeUHostTagsResult = client.describeUHostTags(param);
            System.out.println(describeUHostTagsResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}