package cn.ucloud.umem.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.umem.model.DescribeUMemcacheGroupParam;
import cn.ucloud.umem.model.DescribeUMemcacheGroupResult;
import cn.ucloud.umem.pojo.UMEMConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;


/**
 * @Description : UMEM.DescribeUMemcacheGroup 测试
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-15 10:00
 **/
public class DescribeUMemcacheGroupTest {

    private UMEMClient client;

    private DescribeUMemcacheGroupParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultUMEMClient(new UMEMConfig(
                new Account(System.getenv("UCloudPrivateKey"),
                        System.getenv("UCloudPublicKey"))));
        String region = "cn-sh2";
        String zone = "cn-sh2-02";
        param = new DescribeUMemcacheGroupParam(region);
        param.setProjectId("org-izug1m");
        param.setZone(zone);
    }


    @Test
    public void describeUMemcacheGroup() {
        try {
            DescribeUMemcacheGroupResult result = client.describeUMemcacheGroup(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

}