package cn.ucloud.udb.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.udb.model.CheckUDBInstanceAllowanceParam;
import cn.ucloud.udb.model.CheckUDBInstanceToHAAllowanceParam;
import cn.ucloud.udb.model.CheckUDBInstanceToHAAllowanceResult;
import com.google.gson.Gson;
import org.junit.Before;
import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;

import static org.junit.Assert.*;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-03-05 21:25
 **/
public class CheckUDBInstanceToHAAllowanceTest {


    private UDBClient client;

    private CheckUDBInstanceToHAAllowanceParam param;


    @Before
    public void setUp() throws Exception {
        client = GetUDBClient.getUDBClient();
        param = new CheckUDBInstanceToHAAllowanceParam("cn-sh2", "udb-h3q25faw");
        param.setProjectId("org-izug1m");
    }

    @Test
    public void checkUDBInstanceToHAAllowance() {
        try {
            CheckUDBInstanceToHAAllowanceResult result = client.checkUDBInstanceToHAAllowance(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

    @Test
    public void checkUDBInstanceToHAAllowanceCallback() {
        client.checkUDBInstanceToHAAllowance(param, new UcloudHandler<CheckUDBInstanceToHAAllowanceResult>() {
            @Override
            public Object success(CheckUDBInstanceToHAAllowanceResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(CheckUDBInstanceToHAAllowanceResult result) {
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