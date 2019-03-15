package cn.ucloud.vpc.client;

import cn.ucloud.vpc.model.UpdateSubnetAttributeParam;
import cn.ucloud.vpc.model.UpdateSubnetAttributeResult;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.vpc.pojo.VPCConfig;
import org.junit.Before;
import org.junit.Test;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-21 17:10
 **/
public class UpdateSubnetAttributeTest {

    private VPCClient client;

    private UpdateSubnetAttributeParam param;


    @Before
    public void initData() {
        client = new DefaultVPCClient(new VPCConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        param = new UpdateSubnetAttributeParam("cn-bj2", "subnet-52f1rwlv");
        param.setName("ucloud-sdk-java-subnet");
    }

    @Test
    public void updateSubnetAttribute() {
        try {
            UpdateSubnetAttributeResult updateSubnetAttributeResult = client.updateSubnetAttribute(param);
            JSONComparator.jsonComparator(updateSubnetAttributeResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}