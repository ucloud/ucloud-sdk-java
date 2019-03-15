package cn.ucloud.umem.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.umem.model.DescribeURedisVersionParam;
import cn.ucloud.umem.model.DescribeURedisVersionResult;
import cn.ucloud.umem.pojo.UMEMConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;


/**
 * @Description : UMEM.DescribeURedisVersion 测试
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-15 10:00
 **/
public class DescribeURedisVersionTest {

    private UMEMClient client;

    private DescribeURedisVersionParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultUMEMClient(new UMEMConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        String region = "cn-sh2";
        String zone = "cn-sh2-02";
        param = new DescribeURedisVersionParam(region, zone);
        param.setProjectId("org-izug1m");
    }


    @Test
    public void describeURedisVersion() {
        try {
            DescribeURedisVersionResult result = client.describeURedisVersion(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

}