package cn.ucloud.vpc.client;

import cn.ucloud.vpc.model.CreateSubnetParam;
import cn.ucloud.vpc.model.CreateSubnetResult;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.vpc.pojo.VPCConfig;
import org.junit.Before;
import org.junit.Test;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-21 15:49
 **/
public class CreateSubnetTest {

    private VPCClient client;

    private CreateSubnetParam param;

    @Before
    public void initData() {
        client = new DefaultVPCClient(new VPCConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        param = new CreateSubnetParam("cn-bj2", "uvnet-453iklki", "10.24.0.0");
        param.setSubnetNmae("sdk-java-subnet");
        param.setNetmask(16);
    }

    @Test
    public void createSubnet() {
        try {
            CreateSubnetResult subnet = client.createSubnet(param);
            System.out.println(subnet);
            JSONComparator.jsonComparator(subnet);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}