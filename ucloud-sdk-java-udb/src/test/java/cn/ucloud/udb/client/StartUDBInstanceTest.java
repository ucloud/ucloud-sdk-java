package cn.ucloud.udb.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.udb.model.StartUDBInstanceParam;
import cn.ucloud.udb.model.StartUDBInstanceResult;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-03-08 14:41
 **/
public class StartUDBInstanceTest {

    private UDBClient client;

    private StartUDBInstanceParam param;


    @Before
    public void setUp() throws Exception {
        client = GetUDBClient.getUDBClient();
        param = new StartUDBInstanceParam("cn-sh2",
                "udb-zahyyi04");
        param.setProjectId("org-izug1m");
    }

    @Test
    public void startUDBInstance() {
        try {
            StartUDBInstanceResult result = client.startUDBInstance(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

    @Test
    public void startUDBInstanceCallback() {
        client.startUDBInstance(param, new UcloudHandler<StartUDBInstanceResult>() {
            @Override
            public Object success(StartUDBInstanceResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(StartUDBInstanceResult result) {
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