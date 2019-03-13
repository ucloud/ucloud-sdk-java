package cn.ucloud.udb.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.udb.model.PromoteUDBInstanceToHAParam;
import cn.ucloud.udb.model.PromoteUDBInstanceToHAResult;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-03-08 13:41
 **/
public class PromoteUDBInstanceToHATest {

    private UDBClient client;

    private PromoteUDBInstanceToHAParam param;


    @Before
    public void setUp() throws Exception {
        client = GetUDBClient.getUDBClient();
        param = new PromoteUDBInstanceToHAParam("cn-sh2", "udb-5qoh3hru");
        param.setProjectId("org-izug1m");
    }

    @Test
    public void promoteUDBInstanceToHA() {
        try {
            PromoteUDBInstanceToHAResult result = client.promoteUDBInstanceToHA(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

    @Test
    public void promoteUDBInstanceToHACallback() {
        client.promoteUDBInstanceToHA(param, new UcloudHandler<PromoteUDBInstanceToHAResult>() {
            @Override
            public Object success(PromoteUDBInstanceToHAResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(PromoteUDBInstanceToHAResult result) {
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