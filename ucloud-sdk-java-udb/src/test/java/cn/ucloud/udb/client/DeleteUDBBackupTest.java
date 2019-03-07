package cn.ucloud.udb.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.udb.model.CompleteDBTransferTaskParam;
import cn.ucloud.udb.model.DeleteUDBBackupParam;
import cn.ucloud.udb.model.DeleteUDBBackupResult;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-03-06 14:04
 **/
public class DeleteUDBBackupTest {

    private UDBClient client;

    private DeleteUDBBackupParam param;


    @Before
    public void setUp() throws Exception {
        client = GetUDBClient.getUDBClient();
        param = new DeleteUDBBackupParam("cn-sh2", "cn-sh2-02", 268348);
        param.setProjectId("org-izug1m");
    }

    @Test
    public void deleteUDBBackup() {
        try {
            DeleteUDBBackupResult result = client.deleteUDBBackup(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

    @Test
    public void deleteUDBBackupCallback() {
        client.deleteUDBBackup(param, new UcloudHandler<DeleteUDBBackupResult>() {
            @Override
            public Object success(DeleteUDBBackupResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(DeleteUDBBackupResult result) {
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