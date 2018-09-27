package cn.ucloud.client;

import cn.ucloud.model.ModifyRouteRuleParam;
import cn.ucloud.pojo.Account;
import cn.ucloud.pojo.VPCConfig;
import org.junit.Before;
import org.junit.Test;

/**
 * @description:
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2018/9/27 11:07
 */
public class ModifyRouteRuleTest {
    private VPCClient client;

    private ModifyRouteRuleParam param;


    @Before
    public void initData() {
        client = new DefaultVPCClient(new VPCConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        param = new ModifyRouteRuleParam();
        param.setProjectId("org-4nfe1i");
    }
    @Test
    public void modifyRouteRule() {
        // TODO: 后端API未发布
    }
}
