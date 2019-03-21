package cn.ucloud.vpc.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.vpc.model.ModifyRouteRuleParam;
import cn.ucloud.vpc.model.ModifyRouteRuleResult;
import cn.ucloud.vpc.pojo.VPCConfig;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

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
                new Account(System.getenv("UCloudPrivateKey"),
                        System.getenv("UCloudPublicKey"))));
        param = new ModifyRouteRuleParam("cn-bj2", "routetable-ucyi5kkm");
        param.setProjectId("org-izug1m");
        ModifyRouteRuleParam.RouteRule routeRule = new ModifyRouteRuleParam.RouteRule("1", "10.24.0.0/16",
                "instance", "uhost-kv444y5x", 0, "test", "add");
        List<ModifyRouteRuleParam.RouteRule> list = new ArrayList<>();
        list.add(routeRule);
        param.setRouteRules(list);
    }
    @Test
    public void modifyRouteRule() {
        try {
            ModifyRouteRuleResult modifyRouteRuleResult = client.modifyRouteRule(param);
            JSONComparator.jsonComparator(modifyRouteRuleResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
