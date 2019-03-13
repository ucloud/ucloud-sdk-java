package cn.ucloud.udb.client;

import cn.ucloud.common.handler.UcloudHandler;

import cn.ucloud.udb.model.DescribeUDBCInstanceParam;
import cn.ucloud.udb.model.DescribeUDBInstanceBackupURLParam;
import cn.ucloud.udb.model.DescribeUDBInstanceBackupURLResult;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-03-07 18:53
 **/
public class DescribeUDBInstanceBackupURLTest {

    private UDBClient client;

    private DescribeUDBInstanceBackupURLParam param;


    @Before
    public void setUp() throws Exception {
        client = GetUDBClient.getUDBClient();
        param = new DescribeUDBInstanceBackupURLParam("cn-sh2",269427,"udb-h3q25faw");
        param.setProjectId("org-izug1m");
    }

    @Test
    public void describeUDBInstanceBackupURL() {
        try {
            DescribeUDBInstanceBackupURLResult result = client.describeUDBInstanceBackupURL(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

    @Test
    public void describeUDBInstanceBackupURLCallback() {
        client.describeUDBInstanceBackupURL(param, new UcloudHandler<DescribeUDBInstanceBackupURLResult>() {
            @Override
            public Object success(DescribeUDBInstanceBackupURLResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(DescribeUDBInstanceBackupURLResult result) {
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