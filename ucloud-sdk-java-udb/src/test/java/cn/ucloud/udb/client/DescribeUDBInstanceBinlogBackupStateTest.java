package cn.ucloud.udb.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.util.JSONComparator;
import cn.ucloud.udb.model.DeleteUDBInstanceParam;
import cn.ucloud.udb.model.DescribeUDBInstanceBinlogBackupStateParam;
import cn.ucloud.udb.model.DescribeUDBInstanceBinlogBackupStateResult;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-03-07 19:04
 **/
public class DescribeUDBInstanceBinlogBackupStateTest {

    private UDBClient client;

    private DescribeUDBInstanceBinlogBackupStateParam param;


    @Before
    public void setUp() throws Exception {
        client = GetUDBClient.getUDBClient();
        param = new DescribeUDBInstanceBinlogBackupStateParam("cn-sh2","cn-sh2-02" ,63033);
        param.setProjectId("org-izug1m");
    }
    @Test
    public void describeUDBInstanceBinlogBackupState() {
        try {
            DescribeUDBInstanceBinlogBackupStateResult result = client.describeUDBInstanceBinlogBackupState(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

    @Test
    public void describeUDBInstanceBinlogBackupStateCallback() {
        client.describeUDBInstanceBinlogBackupState(param, new UcloudHandler<DescribeUDBInstanceBinlogBackupStateResult>() {
            @Override
            public Object success(DescribeUDBInstanceBinlogBackupStateResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(DescribeUDBInstanceBinlogBackupStateResult result) {
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