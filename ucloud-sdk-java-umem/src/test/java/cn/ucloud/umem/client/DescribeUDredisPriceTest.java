package cn.ucloud.umem.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.umem.model.DescribeUDredisPriceParam;
import cn.ucloud.umem.model.DescribeUDredisPriceResult;
import cn.ucloud.umem.pojo.UMEMConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;


/**
 * @Description : UMEM.DescribeUDredisPrice 测试
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-15 10:00
 **/
public class DescribeUDredisPriceTest {

    private UMEMClient client;

    private DescribeUDredisPriceParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultUMEMClient(new UMEMConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        String region = "cn-sh2";
        String zone = "cn-sh2";
        Integer size = 1;
        Integer quantity = 1;
        param = new DescribeUDredisPriceParam(region, zone, size, quantity);
        param.setProjectId("org-izug1m");
    }


    @Test
    public void describeUDredisPrice() {
        try {
            DescribeUDredisPriceResult result = client.describeUDredisPrice(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

}