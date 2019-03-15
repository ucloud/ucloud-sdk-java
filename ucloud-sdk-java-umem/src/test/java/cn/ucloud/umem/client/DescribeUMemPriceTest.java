package cn.ucloud.umem.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.umem.model.DescribeUMemPriceParam;
import cn.ucloud.umem.model.DescribeUMemPriceResult;
import cn.ucloud.umem.pojo.UMEMConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;


/**
 * @Description : UMEM.DescribeUMemPrice 测试
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-15 10:00
 **/
public class DescribeUMemPriceTest {

    private UMEMClient client;

    private DescribeUMemPriceParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultUMEMClient(new UMEMConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        String region = "cn-sh2";
        String zone ="cn-sh2-02";
        String projectId = "org-izug1m";
        Integer size = 16;
        String type = "single";
        param = new DescribeUMemPriceParam(region, projectId, size,zone,type);
    }


    @Test
    public void describeUMemPrice() {
        try {
            DescribeUMemPriceResult result = client.describeUMemPrice(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

}