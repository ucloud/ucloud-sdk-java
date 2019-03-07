package cn.ucloud.udb.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.util.JSONComparator;
import cn.ucloud.udb.model.DeleteUDBInstanceParam;
import cn.ucloud.udb.model.DescribeUDBInstanceBackupStateParam;
import cn.ucloud.udb.model.DescribeUDBInstanceBackupStateResult;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

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
        param = new DescribeUDBInstanceBackupStateParam("cn-sh2", "cn-sh2-02",62492);
        param.setProjectId("org-izug1m");
    }

    // todo 测试 get backup state error
    @Test
    public void describeUDBInstanceBackupState() {
        try {
            DescribeUDBInstanceBackupStateResult result = client.describeUDBInstanceBackupState(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

    @Test
    public void describeUDBInstanceBackupStateCallback() {
        client.describeUDBInstanceBackupState(param, new UcloudHandler<DescribeUDBInstanceBackupStateResult>() {
            @Override
            public Object success(DescribeUDBInstanceBackupStateResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(DescribeUDBInstanceBackupStateResult result) {
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