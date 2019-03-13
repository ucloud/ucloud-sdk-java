package cn.ucloud.udb.client;

import cn.ucloud.common.handler.UcloudHandler;

import cn.ucloud.udb.model.DescribeUDBInstanceParam;
import cn.ucloud.udb.model.DisableUDBRWSplittingParam;
import cn.ucloud.udb.model.DisableUDBRWSplittingResult;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-03-07 22:12
 **/
public class DisableUDBRWSplittingTest {

    private UDBClient client;

    private DisableUDBRWSplittingParam param;

    @Before
    public void setUp() throws Exception {
        client = GetUDBClient.getUDBClient();
        param = new DisableUDBRWSplittingParam("cn-sh2", "cn-sh2-02",
                "udb-zahyyi04");
        param.setProjectId("org-izug1m");
    }

    @Test
    public void disableUDBRWSplitting() {
        try {
            DisableUDBRWSplittingResult result = client.disableUDBRWSplitting(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

    @Test
    public void disableUDBRWSplittingCallback() {
        client.disableUDBRWSplitting(param, new UcloudHandler<DisableUDBRWSplittingResult>() {
            @Override
            public Object success(DisableUDBRWSplittingResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(DisableUDBRWSplittingResult result) {
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