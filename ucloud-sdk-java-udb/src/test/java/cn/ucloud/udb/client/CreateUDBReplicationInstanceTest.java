package cn.ucloud.udb.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.udb.model.CreateUDBReplicationInstanceParam;
import cn.ucloud.udb.model.CreateUDBReplicationInstanceResult;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-03-06 11:23
 **/
public class CreateUDBReplicationInstanceTest {


    private UDBClient client;

    private CreateUDBReplicationInstanceParam param;


    @Before
    public void setUp() throws Exception {
        client = GetUDBClient.getUDBClient();
        param = new CreateUDBReplicationInstanceParam("cn-sh2", "udb-5yb2i0vn", "re_db");
        param.setProjectId("org-izug1m");
    }

    @Test
    public void createUDBReplicationInstance() {

        try {
            CreateUDBReplicationInstanceResult result = client.createUDBReplicationInstance(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

    @Test
    public void createUDBReplicationInstanceCallback() {
        client.createUDBReplicationInstance(param, new UcloudHandler<CreateUDBReplicationInstanceResult>() {
            @Override
            public Object success(CreateUDBReplicationInstanceResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(CreateUDBReplicationInstanceResult result) {
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