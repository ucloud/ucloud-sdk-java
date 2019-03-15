package cn.ucloud.umem.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.umem.model.DescribeUMemcachePriceParam;
import cn.ucloud.umem.model.DescribeUMemcachePriceResult;
import cn.ucloud.umem.pojo.UMEMConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;


/**
 * @Description : UMEM.DescribeUMemcachePrice 测试
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-15 10:00
 **/
public class DescribeUMemcachePriceTest {

    private UMEMClient client;

    private DescribeUMemcachePriceParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultUMEMClient(new UMEMConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        String region = "cn-sh2";
        String zone = "cn-sh2";
        Integer size = 1;
        param = new DescribeUMemcachePriceParam(region, zone, size);
        param.setProjectId("org-izug1m");
    }


    @Test
    public void describeUMemcachePrice() {
        try {
            DescribeUMemcachePriceResult result = client.describeUMemcachePrice(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

}