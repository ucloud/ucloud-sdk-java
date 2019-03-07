package cn.ucloud.udb.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.util.JSONComparator;
import cn.ucloud.udb.model.CheckUDBEngineParam;
import cn.ucloud.udb.model.CheckUDBEngineResult;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-03-05 18:26
 **/
public class CheckUDBEngineTest {

    private UDBClient client;

    private CheckUDBEngineParam param;

    @Before
    public void setUp() throws Exception {
        client = GetUDBClient.getUDBClient();
        param = new CheckUDBEngineParam("cn-sh2", "udb-h3q25faw", "MyISAM");
        param.setProjectId("org-izug1m");
    }

    @Test
    public void checkUDBEngine() {
        try {
            CheckUDBEngineResult result = client.checkUDBEngine(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

    @Test
    public void checkUDBEngineCallback() {
        client.checkUDBEngine(param, new UcloudHandler<CheckUDBEngineResult>() {
            @Override
            public Object success(CheckUDBEngineResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(CheckUDBEngineResult result) {
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