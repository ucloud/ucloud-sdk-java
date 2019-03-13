package cn.ucloud.udb.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.udb.model.ModifyUDBInstancePasswordParam;
import cn.ucloud.udb.model.ModifyUDBInstancePasswordResult;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-03-08 13:36
 **/
public class ModifyUDBInstancePasswordTest {

    private UDBClient client;

    private ModifyUDBInstancePasswordParam param;


    @Before
    public void setUp() throws Exception {
        client = GetUDBClient.getUDBClient();
        param = new ModifyUDBInstancePasswordParam("cn-sh2", "udb-h3q25faw", "modify-password");
        param.setProjectId("org-izug1m");
    }

    @Test
    public void modifyUDBInstancePassword() {
        try {
            ModifyUDBInstancePasswordResult result = client.modifyUDBInstancePassword(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

    @Test
    public void modifyUDBInstancePasswordCallback() {
        client.modifyUDBInstancePassword(param, new UcloudHandler<ModifyUDBInstancePasswordResult>() {
            @Override
            public Object success(ModifyUDBInstancePasswordResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(ModifyUDBInstancePasswordResult result) {
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