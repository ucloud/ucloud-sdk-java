package cn.ucloud.udb.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.udb.model.UpdateUDBInstanceSlaveBackupSwitchParam;
import cn.ucloud.udb.model.UpdateUDBInstanceSlaveBackupSwitchResult;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-03-08 15:02
 **/
public class UpdateUDBInstanceSlaveBackupSwitchTest {

    private UDBClient client;

    private UpdateUDBInstanceSlaveBackupSwitchParam param;

    @Before
    public void setUp() throws Exception {
        client = GetUDBClient.getUDBClient();
        param = new UpdateUDBInstanceSlaveBackupSwitchParam("cn-sh2", "udb-zahyyi04",
                1);
        param.setSlaveDBId("udb-qlrgw3lo");
        param.setProjectId("org-izug1m");
    }


    @Test
    public void updateUDBInstanceSlaveBackupSwitch() {
        try {
            UpdateUDBInstanceSlaveBackupSwitchResult result =
                    client.updateUDBInstanceSlaveBackupSwitch(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

    @Test
    public void updateUDBInstanceSlaveBackupSwitchCallback() {
        client.updateUDBInstanceSlaveBackupSwitch(param, new UcloudHandler<UpdateUDBInstanceSlaveBackupSwitchResult>() {
            @Override
            public Object success(UpdateUDBInstanceSlaveBackupSwitchResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(UpdateUDBInstanceSlaveBackupSwitchResult result) {
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