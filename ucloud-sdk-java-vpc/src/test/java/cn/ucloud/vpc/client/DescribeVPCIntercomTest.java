package cn.ucloud.vpc.client;

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
                new Account(System.getenv("UCloudPrivateKey"),
                        System.getenv("UCloudPublicKey"))));
        param = new DescribeVPCIntercomParam("cn-bj2", "uvnet-ckhwco");
    }

    @Test
    public void describeVPCIntercom() {
        try {
            DescribeVPCIntercomResult describeVPCIntercomResult = client.describeVPCIntercom(param);
            JSONComparator.jsonComparator(describeVPCIntercomResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}