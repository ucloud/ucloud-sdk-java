package cn.ucloud.client;

import cn.ucloud.model.DescribeUHostTagsParam;
import cn.ucloud.model.DescribeUHostTagsResult;
import cn.ucloud.pojo.Account;
import cn.ucloud.pojo.UhostConfig;
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
                        System.getenv("UcloudPublicKey"),
                        System.getenv("UcloudPassword"))));
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