package cn.ucloud.udb.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.udb.model.StopUDBInstanceParam;
import cn.ucloud.udb.model.StopUDBInstanceResult;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-03-08 14:43
 **/
public class StopUDBInstanceTest {

    private UDBClient client;

    private StopUDBInstanceParam param;


    @Before
    public void setUp() throws Exception {
        client = GetUDBClient.getUDBClient();
        param = new StopUDBInstanceParam("cn-sh2",
                "udb-zahyyi04");
        param.setProjectId("org-izug1m");
    }

    @Test
    public void stopUDBInstance() {
        try {
            StopUDBInstanceResult result = client.stopUDBInstance(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

    @Test
    public void stopUDBInstanceCallback() {
        client.stopUDBInstance(param, new UcloudHandler<StopUDBInstanceResult>() {
            @Override
            public Object success(StopUDBInstanceResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(StopUDBInstanceResult result) {
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