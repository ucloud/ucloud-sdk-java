package cn.ucloud.udb.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.util.JSONComparator;
import cn.ucloud.udb.model.BackupUDBInstanceBinlogParam;
import cn.ucloud.udb.model.BackupUDBInstanceBinlogResult;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertNull;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-03-05 16:12
 **/
public class BackupUDBInstanceBinlogTest {

    private UDBClient client;

    private BackupUDBInstanceBinlogParam param;

    @Before
    public void setUp() throws Exception {
        client = GetUDBClient.getUDBClient();
        param = new BackupUDBInstanceBinlogParam("cn-sh2", "udb-h3q25faw", "sdk-java-test");
        param.setProjectId("org-izug1m");
    }

    @Test
    public void backupUDBInstanceBinlog() {
        try {
            BackupUDBInstanceBinlogResult result = client.backupUDBInstanceBinlog(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

    @Test
    public void backupUDBInstanceBinlogCallBack() {
        client.backupUDBInstanceBinlog(param, new UcloudHandler<BackupUDBInstanceBinlogResult>() {
            @Override
            public Object success(BackupUDBInstanceBinlogResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(BackupUDBInstanceBinlogResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object error(Exception e) {
                Assert.assertNull(e);
                return null;
            }
        }, false);
    }
}