package cn.ucloud.udb.client;

import cn.ucloud.common.handler.UcloudHandler;

import cn.ucloud.udb.model.ModifyUDBInstanceNameParam;
import cn.ucloud.udb.model.RestartUDBInstanceParam;
import cn.ucloud.udb.model.RestartUDBInstanceResult;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-03-08 14:17
 **/
public class RestartUDBInstanceTest {

    private UDBClient client;

    private RestartUDBInstanceParam param;




    @Before
    public void setUp() throws Exception {
        client = GetUDBClient.getUDBClient();
        param = new RestartUDBInstanceParam("cn-sh2", "udb-5qoh3hru");
        param.setProjectId("org-izug1m");
    }

    @Test
    public void restartUDBInstance() {
        try {
            RestartUDBInstanceResult result = client.restartUDBInstance(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

    @Test
    public void restartUDBInstanceCallback() {
        client.restartUDBInstance(param, new UcloudHandler<RestartUDBInstanceResult>() {
            @Override
            public Object success(RestartUDBInstanceResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(RestartUDBInstanceResult result) {
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