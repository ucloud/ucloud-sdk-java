package cn.ucloud.udb.client;

import cn.ucloud.common.handler.UcloudHandler;

import cn.ucloud.udb.model.CheckUDBInstanceConnectionParam;
import cn.ucloud.udb.model.CheckUDBInstanceConnectionResult;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-03-05 21:21
 **/
public class CheckUDBInstanceConnectionTest {


    private UDBClient client;

    private CheckUDBInstanceConnectionParam param;


    @Before
    public void setUp() throws Exception {
        client = GetUDBClient.getUDBClient();
        param = new CheckUDBInstanceConnectionParam("cn-sh2", "udb-h3q25faw");
        param.setProjectId("org-izug1m");
    }

    @Test
    public void checkUDBInstanceConnection() {
        try {
            CheckUDBInstanceConnectionResult result = client.checkUDBInstanceConnection(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

    @Test
    public void checkUDBInstanceConnectionCallback() {
        client.checkUDBInstanceConnection(param, new UcloudHandler<CheckUDBInstanceConnectionResult>() {
            @Override
            public Object success(CheckUDBInstanceConnectionResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(CheckUDBInstanceConnectionResult result) {
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