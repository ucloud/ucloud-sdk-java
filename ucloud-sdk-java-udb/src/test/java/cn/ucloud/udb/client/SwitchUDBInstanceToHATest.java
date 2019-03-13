package cn.ucloud.udb.client;

import cn.ucloud.common.handler.UcloudHandler;

import cn.ucloud.udb.model.RevokeAccountPrivilegesParam;
import cn.ucloud.udb.model.SwitchUDBInstanceToHAParam;
import cn.ucloud.udb.model.SwitchUDBInstanceToHAResult;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-03-08 14:46
 **/
public class SwitchUDBInstanceToHATest {


    private UDBClient client;

    private SwitchUDBInstanceToHAParam param;

    @Before
    public void setUp() throws Exception {
        client = GetUDBClient.getUDBClient();
        param = new SwitchUDBInstanceToHAParam("cn-sh2", "udb-rfzhjps1");
        param.setProjectId("org-izug1m");
    }
    @Test
    public void switchUDBInstanceToHA() {
        try {
            SwitchUDBInstanceToHAResult result = client.switchUDBInstanceToHA(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

    @Test
    public void switchUDBInstanceToHACallback() {
        client.switchUDBInstanceToHA(param, new UcloudHandler<SwitchUDBInstanceToHAResult>() {
            @Override
            public Object success(SwitchUDBInstanceToHAResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(SwitchUDBInstanceToHAResult result) {
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