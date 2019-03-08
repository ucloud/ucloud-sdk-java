package cn.ucloud.udb.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.util.JSONComparator;
import cn.ucloud.udb.model.SwitchUDBInstanceToHAParam;
import cn.ucloud.udb.model.UpdateUDBParamGroupParam;
import cn.ucloud.udb.model.UpdateUDBParamGroupResult;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-03-08 15:06
 **/
public class UpdateUDBParamGroupTest {

    private UDBClient client;

    private UpdateUDBParamGroupParam param;

    @Before
    public void setUp() throws Exception {
        client = GetUDBClient.getUDBClient();
        param = new UpdateUDBParamGroupParam("cn-sh2", "cn-sh2-02",18942,
                "net.http.enabled","true");
        param.setProjectId("org-izug1m");
    }

    @Test
    public void updateUDBParamGroup() {
        try {
            UpdateUDBParamGroupResult result = client.updateUDBParamGroup(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

    @Test
    public void updateUDBParamGroupCallback() {
        client.updateUDBParamGroup(param, new UcloudHandler<UpdateUDBParamGroupResult>() {
            @Override
            public Object success(UpdateUDBParamGroupResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(UpdateUDBParamGroupResult result) {
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