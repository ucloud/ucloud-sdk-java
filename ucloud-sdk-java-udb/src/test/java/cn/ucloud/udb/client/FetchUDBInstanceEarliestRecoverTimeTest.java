package cn.ucloud.udb.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.udb.model.FetchUDBInstanceEarliestRecoverTimeParam;
import cn.ucloud.udb.model.FetchUDBInstanceEarliestRecoverTimeResult;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-03-07 22:36
 **/
public class FetchUDBInstanceEarliestRecoverTimeTest {

    private UDBClient client;

    private FetchUDBInstanceEarliestRecoverTimeParam param;


    @Before
    public void setUp() throws Exception {
        client = GetUDBClient.getUDBClient();
        param = new FetchUDBInstanceEarliestRecoverTimeParam("cn-sh2", "udb-h3q25faw");
        param.setProjectId("org-izug1m");
    }

    @Test
    public void fetchUDBInstanceEarliestRecoverTime() {
        try {
            FetchUDBInstanceEarliestRecoverTimeResult result =
                    client.fetchUDBInstanceEarliestRecoverTime(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

    @Test
    public void fetchUDBInstanceEarliestRecoverTimeCallback() {
        client.fetchUDBInstanceEarliestRecoverTime(param, new UcloudHandler<FetchUDBInstanceEarliestRecoverTimeResult>() {
            @Override
            public Object success(FetchUDBInstanceEarliestRecoverTimeResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(FetchUDBInstanceEarliestRecoverTimeResult result) {
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