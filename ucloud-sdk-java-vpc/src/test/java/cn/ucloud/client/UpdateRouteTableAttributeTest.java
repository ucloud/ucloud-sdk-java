package cn.ucloud.client;

import cn.ucloud.model.UpdateRouteTableAttributeParam;
import cn.ucloud.pojo.Account;
import cn.ucloud.pojo.VPCConfig;
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
        param = new UpdateRouteTableAttributeParam();
        param.setProjectId("org-4nfe1i");
    }
    @Test
    public void updateRouteTableAttribute() {
        // TODO: 后端API未发布
    }
}
