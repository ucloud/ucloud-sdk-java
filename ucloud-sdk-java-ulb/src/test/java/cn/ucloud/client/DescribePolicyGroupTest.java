package cn.ucloud.client;

import cn.ucloud.model.DescribePolicyGroupParam;
import cn.ucloud.model.DescribePolicyGroupResult;
import cn.ucloud.pojo.Account;
import cn.ucloud.pojo.ULBConfig;
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