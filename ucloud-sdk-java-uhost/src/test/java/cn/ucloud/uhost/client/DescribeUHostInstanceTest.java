package cn.ucloud.uhost.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.uhost.model.DescribeUHostInstanceParam;
import cn.ucloud.uhost.model.DescribeUHostInstanceResult;
import cn.ucloud.uhost.pojo.UhostConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-18 10:33
 **/
public class DescribeUHostInstanceTest {

    private UhostClient client;

    private DescribeUHostInstanceParam param;

    @Before
    public void initData() {
        client = new DefaultUhostClient(new UhostConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        param = new DescribeUHostInstanceParam("cn-sh2");
        param.setProjectId("org-izug1m");
        param.setZone("cn-sh2-02");
    }

    @Test
    public void describeUHostInstance() {
        try {
            DescribeUHostInstanceResult result = client.describeUHostInstance(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }


}