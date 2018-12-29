package cn.ucloud.vpc.client;

import cn.ucloud.vpc.client.DefaultVPCClient;
import cn.ucloud.vpc.client.VPCClient;
import cn.ucloud.vpc.model.DescribeVPCIntercomParam;
import cn.ucloud.vpc.model.DescribeVPCIntercomResult;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.vpc.pojo.VPCConfig;
import org.junit.Before;
import org.junit.Test;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-21 17:57
 **/
public class DescribeVPCIntercomTest {

    private VPCClient client;

    private DescribeVPCIntercomParam param;

    @Before
    public void initData() {
        client = new DefaultVPCClient(new VPCConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        param = new DescribeVPCIntercomParam("cn-bj2","uvnet-lsltj0");
        param.setProjectId("org-4nfe1i");
    }

    @Test
    public void describeVPCIntercom() {
        try {
            DescribeVPCIntercomResult describeVPCIntercomResult = client.describeVPCIntercom(param);
            System.out.println(describeVPCIntercomResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}