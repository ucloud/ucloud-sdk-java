package cn.ucloud.udb.client;

import cn.ucloud.common.handler.UcloudHandler;

import cn.ucloud.udb.model.RevokeAccountPrivilegesParam;
import cn.ucloud.udb.model.UpdateUDBInstanceBackupStrategyParam;
import cn.ucloud.udb.model.UpdateUDBInstanceBackupStrategyResult;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-03-08 14:50
 **/
public class UpdateUDBInstanceBackupStrategyTest {

    private UDBClient client;

    private UpdateUDBInstanceBackupStrategyParam param;

    @Before
    public void setUp() throws Exception {
        client = GetUDBClient.getUDBClient();
        param = new UpdateUDBInstanceBackupStrategyParam("cn-sh2", "udb-5qoh3hru");
        param.setBackupTime(0);
        param.setProjectId("org-izug1m");
    }



    @Test
    public void updateUDBInstanceBackupStrategy() {
        try {
            UpdateUDBInstanceBackupStrategyResult result =
                    client.updateUDBInstanceBackupStrategy(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

    @Test
    public void updateUDBInstanceBackupStrategyCallback() {
        client.updateUDBInstanceBackupStrategy(param, new UcloudHandler<UpdateUDBInstanceBackupStrategyResult>() {
            @Override
            public Object success(UpdateUDBInstanceBackupStrategyResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(UpdateUDBInstanceBackupStrategyResult result) {
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