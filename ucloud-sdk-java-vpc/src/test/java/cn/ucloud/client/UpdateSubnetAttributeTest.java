package cn.ucloud.client;

import cn.ucloud.model.UpdateSubnetAttributeParam;
import cn.ucloud.model.UpdateSubnetAttributeResult;
import cn.ucloud.pojo.Account;
import cn.ucloud.pojo.VPCConfig;
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
        param = new UpdateSubnetAttributeParam("cn-bj2","subnet-5c232h");
        param.setName("java-sdk-test-name");
        param.setProjectId("org-4nfe1i");
    }

    @Test
    public void updateSubnetAttribute() {
        try {
            UpdateSubnetAttributeResult updateSubnetAttributeResult = client.updateSubnetAttribute(param);
            System.out.println(updateSubnetAttributeResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}