package cn.ucloud.umem.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.umem.model.DescribeUMemcacheVersionParam;
import cn.ucloud.umem.model.DescribeUMemcacheVersionResult;
import cn.ucloud.umem.pojo.UMEMConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;


/**
 * @Description : UMEM.DescribeUMemcacheVersion 测试
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-15 10:00
 **/
public class DescribeUMemcacheVersionTest {

    private UMEMClient client;

    private DescribeUMemcacheVersionParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultUMEMClient(new UMEMConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        String region = "cn-sh2";
        param = new DescribeUMemcacheVersionParam(region);
        param.setProjectId("org-izug1m");
    }


    @Test
    public void describeUMemcacheVersion() {
        try {
            DescribeUMemcacheVersionResult result = client.describeUMemcacheVersion(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

}