package cn.ucloud.udb.client;

import cn.ucloud.common.handler.UcloudHandler;

import cn.ucloud.udb.model.ListMonitorItemsParam;
import cn.ucloud.udb.model.ListMonitorItemsResult;
import com.google.gson.Gson;
import org.junit.Before;
import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;

import static org.junit.Assert.*;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-03-07 22:46
 **/
public class ListMonitorItemsTest {


    private UDBClient client;

    private ListMonitorItemsParam param;




    @Before
    public void setUp() throws Exception {
        client = GetUDBClient.getUDBClient();
        param = new ListMonitorItemsParam("cn-sh2", "udb-h3q25faw");
        param.setProjectId("org-izug1m");
    }

    @Test
    public void listMonitorItems() {
        try {
            ListMonitorItemsResult result = client.listMonitorItems(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            e.printStackTrace();
            assertNull(e);
        }
    }

    @Test
    public void listMonitorItemsCallback() {
        client.listMonitorItems(param, new UcloudHandler<ListMonitorItemsResult>() {
            @Override
            public Object success(ListMonitorItemsResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(ListMonitorItemsResult result) {
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