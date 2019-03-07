package cn.ucloud.udb.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.util.JSONComparator;
import cn.ucloud.udb.model.CreateUDBInstanceParam;
import cn.ucloud.udb.model.CreateUDBInstanceResult;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-03-06 10:41
 **/
public class CreateUDBInstanceTest {


    private UDBClient client;

    private CreateUDBInstanceParam param;


    @Before
    public void setUp() throws Exception {
        client = GetUDBClient.getUDBClient();
        param = new CreateUDBInstanceParam("cn-sh2", "cn-sh2-02", "sdk-java-test-mongo",
                "sdk-java-test", "mongodb-3.2", 27017, 20, 29, 1000);
        param.setProjectId("org-izug1m");
    }

    @Test
    public void createUDBInstance() {
        try {
            CreateUDBInstanceResult result = client.createUDBInstance(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

    @Test
    public void createUDBInstanceCallback() {
        client.createUDBInstance(param, new UcloudHandler<CreateUDBInstanceResult>() {
            @Override
            public Object success(CreateUDBInstanceResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(CreateUDBInstanceResult result) {
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