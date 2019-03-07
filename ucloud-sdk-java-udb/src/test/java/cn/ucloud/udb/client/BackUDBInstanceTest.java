package cn.ucloud.udb.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.util.JSONComparator;
import cn.ucloud.udb.model.BackupUDBInstanceParam;
import cn.ucloud.udb.model.BackupUDBInstanceResult;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;


/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-03-05 13:31
 **/
public class BackUDBInstanceTest {

    private UDBClient client;

    private BackupUDBInstanceParam param;


    @Before
    public void setUp() throws Exception {
        client = GetUDBClient.getUDBClient();
        param = new BackupUDBInstanceParam("cn-sh2", "udb-h3q25faw", "sdk-java-test");
        param.setProjectId("org-izug1m");
    }

    @Test
    public void backupUDBInstance() {
        try {
            BackupUDBInstanceResult result = client.backupUDBInstance(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

    @Test
    public void backupUDBInstanceCallback() {
        client.backupUDBInstance(param, new UcloudHandler<BackupUDBInstanceResult>() {
            @Override
            public Object success(BackupUDBInstanceResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(BackupUDBInstanceResult result) {
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