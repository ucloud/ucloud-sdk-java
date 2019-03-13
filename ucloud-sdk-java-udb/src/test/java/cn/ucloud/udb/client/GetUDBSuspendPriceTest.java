package cn.ucloud.udb.client;

import cn.ucloud.common.handler.UcloudHandler;

import cn.ucloud.udb.model.FetchDBPrecheckResultParam;
import cn.ucloud.udb.model.GetUDBSuspendPriceParam;
import cn.ucloud.udb.model.GetUDBSuspendPriceResult;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-03-07 22:39
 **/
public class GetUDBSuspendPriceTest {

    private UDBClient client;

    private GetUDBSuspendPriceParam param;


    @Before
    public void setUp() throws Exception {
        client = GetUDBClient.getUDBClient();
        List<String> dbIds = new ArrayList<>();
        dbIds.add("udb-h3q25faw");
        param = new GetUDBSuspendPriceParam("cn-sh2", "cn-sh2-02",dbIds );
        param.setProjectId("org-izug1m");
    }
    @Test
    public void getUDBSuspendPrice() {
        try {
            GetUDBSuspendPriceResult result = client.getUDBSuspendPrice(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

    @Test
    public void getUDBSuspendPriceCallback() {
        client.getUDBSuspendPrice(param, new UcloudHandler<GetUDBSuspendPriceResult>() {
            @Override
            public Object success(GetUDBSuspendPriceResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(GetUDBSuspendPriceResult result) {
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