package cn.ucloud.udb.client;

import cn.ucloud.common.handler.UcloudHandler;

import cn.ucloud.udb.model.DeleteUDBCInstanceParam;
import cn.ucloud.udb.model.DescribeUDBInstanceByBackupParam;
import cn.ucloud.udb.model.DescribeUDBInstanceByBackupResult;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-03-07 19:11
 **/
public class DescribeUDBInstanceByBackupTest {

    private UDBClient client;

    private DescribeUDBInstanceByBackupParam param;


    @Before
    public void setUp() throws Exception {
        client = GetUDBClient.getUDBClient();
        param = new DescribeUDBInstanceByBackupParam("cn-sh2", "cn-sh2-02", 269081);
        param.setProjectId("org-izug1m");
    }

    @Test
    public void describeUDBInstanceByBackup() {
        try {
            DescribeUDBInstanceByBackupResult result = client.describeUDBInstanceByBackup(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

    @Test
    public void describeUDBInstanceByBackupCallback() {
        client.describeUDBInstanceByBackup(param, new UcloudHandler<DescribeUDBInstanceByBackupResult>() {
            @Override
            public Object success(DescribeUDBInstanceByBackupResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(DescribeUDBInstanceByBackupResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object error(Exception e) {
                assertNull(e);
                return null;
            }
        }, false);
    }
}