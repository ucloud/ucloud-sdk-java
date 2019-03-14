package cn.ucloud.udb.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.udb.model.ModifyUDBInstanceNameParam;
import cn.ucloud.udb.model.ModifyUDBInstanceNameResult;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-03-08 13:34
 **/
public class ModifyUDBInstanceNameTest {

    private UDBClient client;

    private ModifyUDBInstanceNameParam param;


    @Before
    public void setUp() throws Exception {
        client = GetUDBClient.getUDBClient();
        param = new ModifyUDBInstanceNameParam("cn-sh2", "udb-h3q25faw", "modify-name");
        param.setProjectId("org-izug1m");
    }

    @Test
    public void modifyUDBInstanceName() {
        try {
            ModifyUDBInstanceNameResult result = client.modifyUDBInstanceName(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

    @Test
    public void modifyUDBInstanceNameCallback() {
        client.modifyUDBInstanceName(param, new UcloudHandler<ModifyUDBInstanceNameResult>() {
            @Override
            public Object success(ModifyUDBInstanceNameResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(ModifyUDBInstanceNameResult result) {
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