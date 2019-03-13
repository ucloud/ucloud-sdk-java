package cn.ucloud.udb.client;

import cn.ucloud.common.handler.UcloudHandler;

import cn.ucloud.udb.model.ModifyUDBInstanceNameParam;
import cn.ucloud.udb.model.PromoteUDBSlaveParam;
import cn.ucloud.udb.model.PromoteUDBSlaveResult;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-03-08 13:46
 **/
public class PromoteUDBSlaveTest {

    private UDBClient client;

    private PromoteUDBSlaveParam param;




    @Before
    public void setUp() throws Exception {
        client = GetUDBClient.getUDBClient();
        param = new PromoteUDBSlaveParam("cn-sh2", "udb-rfzhjps1");
        param.setProjectId("org-izug1m");
    }

    @Test
    public void promoteUDBSlave() {
        try {
            PromoteUDBSlaveResult result = client.promoteUDBSlave(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

    @Test
    public void promoteUDBSlaveCallback() {
        client.promoteUDBSlave(param, new UcloudHandler<PromoteUDBSlaveResult>() {
            @Override
            public Object success(PromoteUDBSlaveResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(PromoteUDBSlaveResult result) {
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