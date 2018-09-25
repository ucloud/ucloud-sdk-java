package cn.ucloud.client;

import cn.ucloud.model.DescribeRouteTableParam;
import cn.ucloud.model.DescribeRouteTableResult;
import cn.ucloud.pojo.Account;
import cn.ucloud.pojo.VPCConfig;
import org.junit.Before;
import org.junit.Test;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-21 19:27
 **/
public class DescribeRouteTableTest {

    private VPCClient client;

    private DescribeRouteTableParam param;

    @Before
    public void initData() {
        client = new DefaultVPCClient(new VPCConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        param = new DescribeRouteTableParam("cn-bj2");
        param.setProjectId("org-4nfe1i");
    }

    @Test
    public void describeRouteTable() {
        try {
            DescribeRouteTableResult describeRouteTableResult = client.describeRouteTable(param);
            System.out.println(describeRouteTableResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}