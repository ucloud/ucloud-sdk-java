package cn.ucloud.udb.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.udb.model.DescribeUDBBinlogBackupURLParam;
import cn.ucloud.udb.model.DescribeUDBBinlogBackupURLResult;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-03-07 17:41
 **/
public class DescribeUDBBinlogBackupURLTest {

    private UDBClient client;

    private DescribeUDBBinlogBackupURLParam param;


    @Before
    public void setUp() throws Exception {
        client = GetUDBClient.getUDBClient();
        param = new DescribeUDBBinlogBackupURLParam("cn-sh2", "udb-h3q25faw", 62493);
        param.setProjectId("org-izug1m");
    }

    @Test
    public void describeUDBBinlogBackupURL() {
        try {
            DescribeUDBBinlogBackupURLResult result = client.describeUDBBinlogBackupURL(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

    @Test
    public void describeUDBBinlogBackupURLCallback() {
        client.describeUDBBinlogBackupURL(param, new UcloudHandler<DescribeUDBBinlogBackupURLResult>() {
            @Override
            public Object success(DescribeUDBBinlogBackupURLResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(DescribeUDBBinlogBackupURLResult result) {
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