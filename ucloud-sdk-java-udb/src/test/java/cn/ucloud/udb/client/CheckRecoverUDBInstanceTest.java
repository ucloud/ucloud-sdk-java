package cn.ucloud.udb.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.util.JSONComparator;
import cn.ucloud.udb.model.CheckRecoverUDBInstanceParam;
import cn.ucloud.udb.model.CheckRecoverUDBInstanceResult;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-03-05 18:16
 **/
public class CheckRecoverUDBInstanceTest {

    private UDBClient client;

    private CheckRecoverUDBInstanceParam param;


    @Before
    public void setUp() throws Exception {
        client = GetUDBClient.getUDBClient();
        param = new CheckRecoverUDBInstanceParam("cn-sh2", "udb-h3q25faw");
        param.setProjectId("org-izug1m");
    }

    @Test
    public void checkRecoverUDBInstance() {
        try {
            CheckRecoverUDBInstanceResult result = client.checkRecoverUDBInstance(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

    @Test
    public void checkRecoverUDBInstanceCallback() {
        client.checkRecoverUDBInstance(param, new UcloudHandler<CheckRecoverUDBInstanceResult>() {
            @Override
            public Object success(CheckRecoverUDBInstanceResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(CheckRecoverUDBInstanceResult result) {
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