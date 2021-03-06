package cn.ucloud.vpc.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.vpc.model.DescribeRouteTableParam;
import cn.ucloud.vpc.model.DescribeRouteTableResult;
import cn.ucloud.vpc.pojo.VPCConfig;
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
                new Account(System.getenv("UCloudPrivateKey"),
                        System.getenv("UCloudPublicKey"))));
        param = new DescribeRouteTableParam("cn-bj2");
    }

    @Test
    public void describeRouteTable() {
        try {
            DescribeRouteTableResult describeRouteTableResult = client.describeRouteTable(param);
            JSONComparator.jsonComparator(describeRouteTableResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}