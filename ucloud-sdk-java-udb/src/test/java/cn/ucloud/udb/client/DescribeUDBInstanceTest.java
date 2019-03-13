package cn.ucloud.udb.client;

import cn.ucloud.common.handler.UcloudHandler;

import cn.ucloud.udb.model.DeleteUDBBackupParam;
import cn.ucloud.udb.model.DescribeUDBInstanceParam;
import cn.ucloud.udb.model.DescribeUDBInstanceResult;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-03-07 17:53
 **/
public class DescribeUDBInstanceTest {

    private UDBClient client;

    private DescribeUDBInstanceParam param;


    @Before
    public void setUp() throws Exception {
        client = GetUDBClient.getUDBClient();
        param = new DescribeUDBInstanceParam("cn-sh2", "NOSQL",10,0);
        param.setProjectId("org-izug1m");
    }
    @Test
    public void describeUDBCInstance() {
        try {
            DescribeUDBInstanceResult result = client.describeUDBInstance(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

    @Test
    public void describeUDBCInstanceCallback() {
        client.describeUDBInstance(param, new UcloudHandler<DescribeUDBInstanceResult>() {
            @Override
            public Object success(DescribeUDBInstanceResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(DescribeUDBInstanceResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object error(Exception e) {
                assertNull(e);
                return null;
            }
        });
    }
}