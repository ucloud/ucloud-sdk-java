package cn.ucloud.udb.client;

import cn.ucloud.common.handler.UcloudHandler;

import cn.ucloud.udb.model.BackupUDBInstanceSlowLogParam;
import cn.ucloud.udb.model.BackupUDBInstanceSlowLogResult;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-03-05 17:11
 **/
public class BackupUDBInstanceSlowLogTest {

    private UDBClient client;

    private BackupUDBInstanceSlowLogParam param;

    @Before
    public void setUp() throws Exception {
        client = GetUDBClient.getUDBClient();
        param = new BackupUDBInstanceSlowLogParam("cn-sh2", "udb-h3q25faw", 1551770000, 1551777220
                , "sdk-java-test-slow");
        param.setProjectId("org-izug1m");
    }

    @Test
    public void backupUDBInstanceSlowLog() {
        try {
            BackupUDBInstanceSlowLogResult result = client.backupUDBInstanceSlowLog(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

    @Test
    public void backupUDBInstanceSlowLogCallback() {
        client.backupUDBInstanceSlowLog(param, new UcloudHandler<BackupUDBInstanceSlowLogResult>() {
            @Override
            public Object success(BackupUDBInstanceSlowLogResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(BackupUDBInstanceSlowLogResult result) {
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