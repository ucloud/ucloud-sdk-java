package cn.ucloud.udb.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.util.JSONComparator;
import cn.ucloud.udb.model.PromoteUDBSlaveParam;
import cn.ucloud.udb.model.RestartRWSplittingParam;
import cn.ucloud.udb.model.RestartRWSplittingResult;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-03-08 14:07
 **/
public class RestartRWSplittingTest {

    private UDBClient client;

    private RestartRWSplittingParam param;




    @Before
    public void setUp() throws Exception {
        client = GetUDBClient.getUDBClient();
        param = new RestartRWSplittingParam("cn-sh2", "cn-sh2-02","udb-zahyyi04");
        param.setProjectId("org-izug1m");
    }
    @Test
    public void restartRWSplitting() {
        try {
            RestartRWSplittingResult result = client.restartRWSplitting(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

    @Test
    public void restartRWSplittingCallback() {
        client.restartRWSplitting(param, new UcloudHandler<RestartRWSplittingResult>() {
            @Override
            public Object success(RestartRWSplittingResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(RestartRWSplittingResult result) {
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