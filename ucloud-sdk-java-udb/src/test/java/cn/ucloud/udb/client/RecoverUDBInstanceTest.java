package cn.ucloud.udb.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.util.JSONComparator;
import cn.ucloud.udb.model.PromoteUDBSlaveParam;
import cn.ucloud.udb.model.RecoverUDBInstanceParam;
import cn.ucloud.udb.model.RecoverUDBInstanceResult;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-03-08 13:51
 **/
public class RecoverUDBInstanceTest {

    private UDBClient client;

    private RecoverUDBInstanceParam param;




    @Before
    public void setUp() throws Exception {
        client = GetUDBClient.getUDBClient();
        param = new RecoverUDBInstanceParam("cn-sh2", "udb-5qoh3hru","udb-zahyyi04",1551993284);
        param.setProjectId("org-izug1m");
    }

    @Test
    public void recoverUDBInstance() {
        try {
            RecoverUDBInstanceResult result = client.recoverUDBInstance(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

    @Test
    public void recoverUDBInstanceCallback() {
        client.recoverUDBInstance(param, new UcloudHandler<RecoverUDBInstanceResult>() {
            @Override
            public Object success(RecoverUDBInstanceResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(RecoverUDBInstanceResult result) {
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