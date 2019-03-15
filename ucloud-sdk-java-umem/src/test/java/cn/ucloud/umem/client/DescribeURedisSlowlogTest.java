package cn.ucloud.umem.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.umem.model.DescribeURedisSlowlogParam;
import cn.ucloud.umem.model.DescribeURedisSlowlogResult;
import cn.ucloud.umem.pojo.UMEMConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;


/**
 * @Description : UMEM.DescribeURedisSlowlog 测试
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-15 10:00
 **/
public class DescribeURedisSlowlogTest {

    private UMEMClient client;

    private DescribeURedisSlowlogParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultUMEMClient(new UMEMConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        String region = "cn-sh2";
        String zone = "cn-sh2-02";
        String groupId = "uredis-pgouk5n1";
        param = new DescribeURedisSlowlogParam(region, zone, groupId);
        param.setProjectId("org-izug1m");
    }


    @Test
    public void describeURedisSlowlog() {
        try {
            DescribeURedisSlowlogResult result = client.describeURedisSlowlog(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

}