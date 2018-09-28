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
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        param = new ModifyRouteRuleParam("cn-bj2","routetable-ciodbt");
        param.setProjectId("org-4nfe1i");
        ModifyRouteRuleParam.RouteRule routeRule = new ModifyRouteRuleParam.RouteRule("1","10.10.0.0/16 ",
                "instance","uhost-zzsffd",0,"test","add");
        List<ModifyRouteRuleParam.RouteRule> list = new ArrayList<>();
        list.add(routeRule);
        param.setRouteRules(list);
    }
    @Test
    public void modifyRouteRule() {
        // todo 测试
        try {
            ModifyRouteRuleResult modifyRouteRuleResult = client.modifyRouteRule(param);
            System.out.println(modifyRouteRuleResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
