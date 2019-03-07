package cn.ucloud.udb.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.util.JSONComparator;
import cn.ucloud.udb.model.DeleteUDBInstanceParam;
import cn.ucloud.udb.model.DescribeUDBInstanceBinlogParam;
import cn.ucloud.udb.model.DescribeUDBInstanceBinlogResult;
import org.junit.Before;
import org.junit.Test;

import java.sql.Time;

import static org.junit.Assert.*;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-03-07 18:57
 **/
public class DescribeUDBInstanceBinlogTest {

    private UDBClient client;

    private DescribeUDBInstanceBinlogParam param;


    @Before
    public void setUp() throws Exception {
        client = GetUDBClient.getUDBClient();
        param = new DescribeUDBInstanceBinlogParam("cn-sh2", "udb-h3q25faw",
                1551783710,1551956510);
        param.setProjectId("org-izug1m");
    }
    @Test
    public void describeUDBInstanceBinlog() {
        try {
            DescribeUDBInstanceBinlogResult result = client.describeUDBInstanceBinlog(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

    @Test
    public void describeUDBInstanceBinlogCallback() {
        client.describeUDBInstanceBinlog(param, new UcloudHandler<DescribeUDBInstanceBinlogResult>() {
            @Override
            public Object success(DescribeUDBInstanceBinlogResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(DescribeUDBInstanceBinlogResult result) {
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