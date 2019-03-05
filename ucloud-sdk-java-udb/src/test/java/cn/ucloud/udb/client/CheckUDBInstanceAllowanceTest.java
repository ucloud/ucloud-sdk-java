package cn.ucloud.udb.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.udb.model.BackupUDBInstanceParam;
import cn.ucloud.udb.model.CheckUDBInstanceAllowanceParam;
import cn.ucloud.udb.model.CheckUDBInstanceAllowanceResult;
import com.google.gson.Gson;
import org.json.JSONException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;

import static org.junit.Assert.*;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-03-05 18:33
 **/
public class CheckUDBInstanceAllowanceTest {

    private UDBClient client;

    private CheckUDBInstanceAllowanceParam param;


    @Before
    public void setUp() throws Exception {
        client = GetUDBClient.getUDBClient();
        param = new CheckUDBInstanceAllowanceParam("cn-sh2", "cn-sh2-02", "nosql", 8, 20,
                true, 100, "Normal");
        param.setSsdType("SATA");
        param.setProjectId("org-izug1m");
    }


    @Test
    public void checkUDBInstanceAllowance() {
        try {
            CheckUDBInstanceAllowanceResult result = client.checkUDBInstanceAllowance(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

    @Test
    public void checkUDBInstanceAllowanceCallback() {
        client.checkUDBInstanceAllowance(param, new UcloudHandler<CheckUDBInstanceAllowanceResult>() {
            @Override
            public Object success(CheckUDBInstanceAllowanceResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(CheckUDBInstanceAllowanceResult result) {
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