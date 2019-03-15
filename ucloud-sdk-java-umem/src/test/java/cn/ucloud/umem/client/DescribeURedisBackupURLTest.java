package cn.ucloud.umem.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.umem.model.DescribeURedisBackupURLParam;
import cn.ucloud.umem.model.DescribeURedisBackupURLResult;
import cn.ucloud.umem.pojo.UMEMConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;


/**
 * @Description : UMEM.DescribeURedisBackupURL 测试
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-15 10:00
 **/
public class DescribeURedisBackupURLTest {

    private UMEMClient client;

    private DescribeURedisBackupURLParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultUMEMClient(new UMEMConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        String region = "cn-sh2";
        String backupId = "59575ff4-9c40-49aa-a4f3-81abc246a93b";
        String groupId = "uredis-pgouk5n1";
        param = new DescribeURedisBackupURLParam(region, backupId, groupId);
        param.setProjectId("org-izug1m");
    }


    @Test
    public void describeURedisBackupURL() {
        try {
            DescribeURedisBackupURLResult result = client.describeURedisBackupURL(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

}