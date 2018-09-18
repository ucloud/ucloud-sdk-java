package cn.ucloud.client;

import cn.ucloud.model.DescribeImageParam;
import cn.ucloud.model.DescribeImageResult;
import cn.ucloud.pojo.Account;
import cn.ucloud.pojo.UhostConfig;
import org.junit.Before;
import org.junit.Test;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-18 16:44
 **/
public class DescribeImageTest {

    private UhostClient client;

    private DescribeImageParam param;

    @Before
    public void initData() {
        client = new DefaultUhostClient(new UhostConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"),
                        System.getenv("UcloudPassword"))));
        param = new DescribeImageParam("cn-bj2");
    }

    @Test
    public void describeImage() {
        try {
            DescribeImageResult describeImageResult = client.describeImage(param);
            System.out.println(describeImageResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}