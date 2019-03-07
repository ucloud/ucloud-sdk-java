package cn.ucloud.udb.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.util.JSONComparator;
import cn.ucloud.udb.model.CreateUDBInstanceByRecoveryParam;
import cn.ucloud.udb.model.CreateUDBInstanceByRecoveryResult;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-03-06 11:07
 **/
public class CreateUDBInstanceByRecoveryTest {

    private UDBClient client;

    private CreateUDBInstanceByRecoveryParam param;


    @Before
    public void setUp() throws Exception {
        client = GetUDBClient.getUDBClient();
        param = new CreateUDBInstanceByRecoveryParam("cn-sh2", "recovery", "udb-h3q25faw", 1551809764);
        param.setProjectId("org-izug1m");
    }

    @Test
    public void createUDBInstanceByRecovery() {
        try {
            CreateUDBInstanceByRecoveryResult result = client.createUDBInstanceByRecovery(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

    @Test
    public void createUDBInstanceByRecoveryCallback() {
        client.createUDBInstanceByRecovery(param, new UcloudHandler<CreateUDBInstanceByRecoveryResult>() {
            @Override
            public Object success(CreateUDBInstanceByRecoveryResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(CreateUDBInstanceByRecoveryResult result) {
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