package cn.ucloud.udb.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.udb.model.RevokeAccountPrivilegesParam;
import cn.ucloud.udb.model.RevokeAccountPrivilegesResult;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-03-08 14:21
 **/
public class RevokeAccountPrivilegesTest {

    private UDBClient client;

    private RevokeAccountPrivilegesParam param;

    @Before
    public void setUp() throws Exception {
        client = GetUDBClient.getUDBClient();
        param = new RevokeAccountPrivilegesParam("cn-sh2", "sdk-java",
                "db-test", "udb-5qoh3hru");
        param.setProjectId("org-izug1m");
    }


    @Test
    public void revokeAccountPrivileges() {
        try {
            RevokeAccountPrivilegesResult result = client.revokeAccountPrivileges(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

    @Test
    public void revokeAccountPrivilegesCallback() {
        client.revokeAccountPrivileges(param, new UcloudHandler<RevokeAccountPrivilegesResult>() {
            @Override
            public Object success(RevokeAccountPrivilegesResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(RevokeAccountPrivilegesResult result) {
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