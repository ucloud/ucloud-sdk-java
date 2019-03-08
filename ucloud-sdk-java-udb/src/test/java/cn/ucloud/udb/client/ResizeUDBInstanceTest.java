package cn.ucloud.udb.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.util.JSONComparator;
import cn.ucloud.udb.model.PromoteUDBSlaveParam;
import cn.ucloud.udb.model.ResizeUDBInstanceParam;
import cn.ucloud.udb.model.ResizeUDBInstanceResult;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-03-08 14:03
 **/
public class ResizeUDBInstanceTest {

    private UDBClient client;

    private ResizeUDBInstanceParam param;




    @Before
    public void setUp() throws Exception {
        client = GetUDBClient.getUDBClient();
        param = new ResizeUDBInstanceParam("cn-sh2", "udb-rfzhjps1",1000,
                30);
        param.setProjectId("org-izug1m");
    }

    @Test
    public void resizeUDBInstance() {
        try {
            ResizeUDBInstanceResult result = client.resizeUDBInstance(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

    @Test
    public void resizeUDBInstanceCallback() {
        client.resizeUDBInstance(param, new UcloudHandler<ResizeUDBInstanceResult>() {
            @Override
            public Object success(ResizeUDBInstanceResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(ResizeUDBInstanceResult result) {
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