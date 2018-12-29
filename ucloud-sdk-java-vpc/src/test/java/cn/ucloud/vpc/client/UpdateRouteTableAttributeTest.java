package cn.ucloud.vpc.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.vpc.model.UpdateRouteTableAttributeParam;
import cn.ucloud.vpc.model.UpdateRouteTableAttributeResult;
import cn.ucloud.vpc.pojo.VPCConfig;
import org.junit.Before;
import org.junit.Test;

/**
 * @description:
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2018/9/27 11:10
 */
public class UpdateRouteTableAttributeTest {
    private VPCClient client;

    private UpdateRouteTableAttributeParam param;


    @Before
    public void initData() {
        client = new DefaultVPCClient(new VPCConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        param = new UpdateRouteTableAttributeParam("cn-bj2","routetable-ciodbt");
        param.setProjectId("org-4nfe1i");
        param.setName("java-sdk-test-routeTable");
    }
    @Test
    public void updateRouteTableAttribute() {
        try {
            UpdateRouteTableAttributeResult updateRouteTableAttributeResult = client.updateRouteTableAttribute(param);
            System.out.println(updateRouteTableAttributeResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
