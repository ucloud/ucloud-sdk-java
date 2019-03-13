package cn.ucloud.udb.client;

import cn.ucloud.common.handler.UcloudHandler;

import cn.ucloud.udb.model.BackupUDBInstanceParam;
import cn.ucloud.udb.model.DescribeUDBInstanceStateParam;
import cn.ucloud.udb.model.DescribeUDBInstanceStateResult;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-03-07 21:16
 **/
public class DescribeUDBInstanceStateTest {

    private UDBClient client;

    private DescribeUDBInstanceStateParam param;


    @Before
    public void setUp() throws Exception {
        client = GetUDBClient.getUDBClient();
        param = new DescribeUDBInstanceStateParam("cn-sh2", "udb-h3q25faw");
        param.setProjectId("org-izug1m");
    }
    @Test
    public void describeUDBInstanceBackupState() {
        try {
            DescribeUDBInstanceStateResult result = client.describeUDBInstanceState(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

    @Test
    public void describeUDBInstanceBackupStateCallback() {
        client.describeUDBInstanceState(param, new UcloudHandler<DescribeUDBInstanceStateResult>() {
            @Override
            public Object success(DescribeUDBInstanceStateResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(DescribeUDBInstanceStateResult result) {
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