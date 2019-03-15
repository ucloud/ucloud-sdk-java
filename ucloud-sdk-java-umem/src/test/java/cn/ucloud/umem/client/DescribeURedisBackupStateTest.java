package cn.ucloud.umem.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.umem.model.DescribeURedisBackupStateParam;
import cn.ucloud.umem.model.DescribeURedisBackupStateResult;
import cn.ucloud.umem.pojo.UMEMConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;


/**
 * @Description : UMEM.DescribeURedisBackupState 测试
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-15 10:00
 **/
public class DescribeURedisBackupStateTest {

    private UMEMClient client;

    private DescribeURedisBackupStateParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultUMEMClient(new UMEMConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        String region = "cn-sh2";
        String groupId = "uredis-pgouk5n1";
        String backupId = "59575ff4-9c40-49aa-a4f3-81abc246a93b";
        param = new DescribeURedisBackupStateParam(region, groupId, backupId);
        param.setProjectId("org-izug1m");
    }


    @Test
    public void describeURedisBackupState() {
        try {
            DescribeURedisBackupStateResult result = client.describeURedisBackupState(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

}