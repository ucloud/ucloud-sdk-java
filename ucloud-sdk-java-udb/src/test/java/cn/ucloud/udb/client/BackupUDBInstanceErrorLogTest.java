package cn.ucloud.udb.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.udb.model.BackupUDBInstanceErrorLogParam;
import cn.ucloud.udb.model.BackupUDBInstanceErrorLogResult;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-03-05 16:58
 **/
public class BackupUDBInstanceErrorLogTest {
    private UDBClient client;

    private BackupUDBInstanceErrorLogParam param;


    @Before
    public void setUp() throws Exception {
        client = GetUDBClient.getUDBClient();
        param = new BackupUDBInstanceErrorLogParam("cn-sh2", "udb-h3q25faw", "sdk-java-test-error-log");
        param.setProjectId("org-izug1m");
    }

    @Test
    public void backupUDBInstanceErrorLog() {
        BackupUDBInstanceErrorLogResult result = null;
        try {
            result = client.backupUDBInstanceErrorLog(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

    @Test
    public void backupUDBInstanceErrorLogCallback() {
        client.backupUDBInstanceErrorLog(param, new UcloudHandler<BackupUDBInstanceErrorLogResult>() {
            @Override
            public Object success(BackupUDBInstanceErrorLogResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(BackupUDBInstanceErrorLogResult result) {
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