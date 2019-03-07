package cn.ucloud.udb.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.util.JSONComparator;
import cn.ucloud.udb.model.DescribeUDBBackupBlacklistParam;
import cn.ucloud.udb.model.DescribeUDBBackupBlacklistResult;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-03-07 17:10
 **/
public class DescribeUDBBackupBlacklistTest {

    private UDBClient client;

    private DescribeUDBBackupBlacklistParam param;


    @Before
    public void setUp() throws Exception {
        client = GetUDBClient.getUDBClient();
        param = new DescribeUDBBackupBlacklistParam("cn-sh2", "udb-h3q25faw");
        param.setProjectId("org-izug1m");
    }

    @Test
    public void describeUDBBackupBlacklist() {
        try {
            DescribeUDBBackupBlacklistResult result = client.describeUDBBackupBlacklist(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

    @Test
    public void describeUDBBackupBlacklistCallback() {
        client.describeUDBBackupBlacklist(param, new UcloudHandler<DescribeUDBBackupBlacklistResult>() {
            @Override
            public Object success(DescribeUDBBackupBlacklistResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(DescribeUDBBackupBlacklistResult result) {
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