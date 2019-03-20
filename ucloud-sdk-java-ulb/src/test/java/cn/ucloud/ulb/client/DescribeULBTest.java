package cn.ucloud.ulb.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.ulb.model.DescribeULBParam;
import cn.ucloud.ulb.model.DescribeULBResult;
import cn.ucloud.ulb.pojo.ULBConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-19 11:24
 **/
public class DescribeULBTest {

    private ULBClient client;

    private DescribeULBParam param;

    @Before
    public void initData() {
        client = new DefaultULBClient(new ULBConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        param = new DescribeULBParam("cn-sh2");
        param.setProjectId("org-o1ftjk");
    }

    @Test
    public void describeULB() {
        try {
            DescribeULBResult result = client.describeULB(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }
}