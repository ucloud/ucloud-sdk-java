package cn.ucloud.udb.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.udb.model.DescribeUDBLogBackupURLParam;
import cn.ucloud.udb.model.DescribeUDBLogBackupURLResult;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-03-07 21:34
 **/
public class DescribeUDBLogBackupURLTest {

    private UDBClient client;

    private DescribeUDBLogBackupURLParam param;


    @Before
    public void setUp() throws Exception {
        client = GetUDBClient.getUDBClient();
        param = new DescribeUDBLogBackupURLParam("cn-sh2", "udb-h3q25faw", 62493);
        param.setProjectId("org-izug1m");
    }

    @Test
    public void describeUDBBinlogBackupURL() {
        DescribeUDBLogBackupURLResult result = null;
        try {
            result = client.describeUDBLogBackupURL(param);
        } catch (Exception e) {
            assertNull(e);
        }
        JSONComparator.jsonComparator(result);
    }

    @Test
    public void describeUDBBinlogBackupURLCallback() {
        client.describeUDBLogBackupURL(param, new UcloudHandler<DescribeUDBLogBackupURLResult>() {
            @Override
            public Object success(DescribeUDBLogBackupURLResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(DescribeUDBLogBackupURLResult result) {
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