package cn.ucloud.client;

import cn.ucloud.model.DescribeUHostInstanceParam;
import cn.ucloud.model.DescribeUHostInstanceResult;
import cn.ucloud.pojo.Account;
import cn.ucloud.pojo.UhostConfig;
import org.junit.Before;
import org.junit.Test;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-18 10:33
 **/
public class DescribeUHostInstanceTest {

    private UhostClient client;

    private DescribeUHostInstanceParam param;

    @Before
    public void initData() {
        client = new DefaultUhostClient(new UhostConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"),
                        System.getenv("UcloudPassword"))));
        param = new DescribeUHostInstanceParam("cn-bj2");
        param.setProjectId("org-4nfe1i");
    }

    @Test
    public void describeUHostInstance() {

        try {
            DescribeUHostInstanceResult describeUHostInstanceResult = client.describeUHostInstance(param);
            System.out.println(describeUHostInstanceResult.getAction());
            System.out.println(describeUHostInstanceResult.getRetCode());
            System.out.println(describeUHostInstanceResult.getMessage());
            System.out.println(describeUHostInstanceResult);
            System.out.println(describeUHostInstanceResult.getUhosts());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}