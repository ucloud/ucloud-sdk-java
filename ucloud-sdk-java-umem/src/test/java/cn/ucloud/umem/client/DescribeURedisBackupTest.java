package cn.ucloud.umem.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.umem.model.DescribeURedisBackupParam;
import cn.ucloud.umem.model.DescribeURedisBackupResult;
import cn.ucloud.umem.pojo.UMEMConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;


/**
 * @Description : UMEM.DescribeURedisBackup 测试
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-15 10:00
 **/
public class DescribeURedisBackupTest {

    private UMEMClient client;

    private DescribeURedisBackupParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultUMEMClient(new UMEMConfig(
                new Account(System.getenv("UCloudPrivateKey"),
                        System.getenv("UCloudPublicKey"))));
        String region = "cn-sh2";
        param = new DescribeURedisBackupParam(region);
        param.setProjectId("org-izug1m");

    }


    @Test
    public void describeURedisBackup() {
        try {
            DescribeURedisBackupResult result = client.describeURedisBackup(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

}