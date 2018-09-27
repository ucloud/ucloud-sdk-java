package cn.ucloud.ulb.client;

import cn.ucloud.ulb.client.DefaultULBClient;
import cn.ucloud.ulb.client.ULBClient;
import cn.ucloud.ulb.model.DescribePolicyGroupParam;
import cn.ucloud.ulb.model.DescribePolicyGroupResult;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.ulb.pojo.ULBConfig;
import org.junit.Before;
import org.junit.Test;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-21 10:14
 **/
public class DescribePolicyGroupTest {

    private ULBClient client;

    private DescribePolicyGroupParam param;

    @Before
    public void initData() {
        client = new DefaultULBClient(new ULBConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        param = new DescribePolicyGroupParam("cn-bj2");
        param.setProjectId("org-4nfe1i");
    }

    @Test
    public void describePolicyGroup() {
        // todo 测试
        try {
            DescribePolicyGroupResult describePolicyGroupResult = client.describePolicyGroup(param);
            System.out.println(describePolicyGroupResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}