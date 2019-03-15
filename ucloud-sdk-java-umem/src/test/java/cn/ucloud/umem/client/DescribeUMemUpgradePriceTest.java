package cn.ucloud.umem.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.umem.model.DescribeUMemUpgradePriceParam;
import cn.ucloud.umem.model.DescribeUMemUpgradePriceResult;
import cn.ucloud.umem.pojo.UMEMConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;


/**
 * @Description : UMEM.DescribeUMemUpgradePrice 测试
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-15 10:00
 **/
public class DescribeUMemUpgradePriceTest {

    private UMEMClient client;

    private DescribeUMemUpgradePriceParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultUMEMClient(new UMEMConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        String region = "cn-sh2";
        Integer size = 1;
        String type = "single";
        String spaceId = "cumemcache-x1xxnxra";
        param = new DescribeUMemUpgradePriceParam(region, size, type, spaceId);
        param.setProjectId("org-izug1m");
    }


    // todo 测试 服务不可用
    @Test
    public void describeUMemUpgradePrice() {
        try {
            DescribeUMemUpgradePriceResult result = client.describeUMemUpgradePrice(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

}