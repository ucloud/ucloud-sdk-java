package cn.ucloud.client;

import cn.ucloud.model.DescribeULBParam;
import cn.ucloud.model.DescribeULBResult;
import cn.ucloud.pojo.Account;
import cn.ucloud.pojo.ULBConfig;
import org.junit.Before;
import org.junit.Test;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-19 11:24
 **/
public class DescribeULBTest {

    private ULBClient client;

    private DescribeULBParam param;

    @Before
    public void initData() {
        client = new DefaultULBClient(new ULBConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        param = new DescribeULBParam("cn-bj2");
        param.setProjectId("org-4nfe1i");
    }

    @Test
    public void describeULB() {
        try {
            DescribeULBResult describeULBResult = client.describeULB(param);
            System.out.println(describeULBResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}