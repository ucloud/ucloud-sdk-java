package cn.ucloud.udb.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.udb.model.ListUDBConfigSvrParam;
import cn.ucloud.udb.model.ListUDBConfigSvrResult;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-03-08 11:05
 **/
public class ListUDBConfigSvrTest {

    private UDBClient client;

    private ListUDBConfigSvrParam param;


    @Before
    public void setUp() throws Exception {
        client = GetUDBClient.getUDBClient();
        param = new ListUDBConfigSvrParam("cn-sh2", "cn-sh2-02");
        param.setProjectId("org-izug1m");
    }

    @Test
    public void listUDBConfigSvr() {
        try {
            ListUDBConfigSvrResult result = client.listUDBConfigSvr(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }
}