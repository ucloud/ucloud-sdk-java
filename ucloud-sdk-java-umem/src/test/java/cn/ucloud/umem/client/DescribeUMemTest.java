package cn.ucloud.umem.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.umem.model.DescribeUMemParam;
import cn.ucloud.umem.model.DescribeUMemResult;
import cn.ucloud.umem.pojo.UMEMConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;


/**
 * @Description : UMEM.DescribeUMem 测试
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-15 10:00
 **/
public class DescribeUMemTest {

    private UMEMClient client;

    private DescribeUMemParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultUMEMClient(new UMEMConfig(
                new Account(System.getenv("UCloudPrivateKey"),
                        System.getenv("UCloudPublicKey"))));
        String region = "cn-sh2";
        String protocol = "redis";
        param = new DescribeUMemParam(region,protocol);
        param.setProjectId("org-izug1m");
        param.setZone("cn-sh2-02");
        param.setResourceId("umem-lwzcxbcl");
    }


    @Test
    public void describeUMem() {
        try {
            DescribeUMemResult result = client.describeUMem(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

}