package cn.ucloud.udb.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.util.JSONComparator;
import cn.ucloud.udb.model.ClearUDBLogParam;
import cn.ucloud.udb.model.ClearUDBLogResult;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-03-05 21:38
 **/
public class ClearUDBLogTest {

    private UDBClient client;

    private ClearUDBLogParam param;


    @Before
    public void setUp() throws Exception {
        client = GetUDBClient.getUDBClient();
        param = new ClearUDBLogParam("cn-sh2", "udb-h3q25faw", 30);
        param.setProjectId("org-izug1m");
    }

    @Test
    public void clearUDBLog() {
        try {
            ClearUDBLogResult result = client.clearUDBLog(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

    @Test
    public void clearUDBLogCallback() {
        client.clearUDBLog(param, new UcloudHandler<ClearUDBLogResult>() {
            @Override
            public Object success(ClearUDBLogResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(ClearUDBLogResult result) {
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