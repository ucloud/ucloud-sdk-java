package cn.ucloud.udb.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.udb.model.DescribeUDBInstanceBackupStateParam;
import cn.ucloud.udb.model.DescribeUDBInstanceBackupStateResult;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-03-07 18:49
 **/
public class DescribeUDBInstanceBackupStateTest {
    private UDBClient client;

    private DescribeUDBInstanceBackupStateParam param;


    @Before
    public void setUp() throws Exception {
        client = GetUDBClient.getUDBClient();
        param = new DescribeUDBInstanceBackupStateParam("cn-sh2", "cn-sh2-02", 273798);
        param.setProjectId("org-izug1m");
    }

    @Test
    public void describeUDBInstanceBackupState() {
        try {
            DescribeUDBInstanceBackupStateResult result = client.describeUDBInstanceBackupState(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }
}