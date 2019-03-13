package cn.ucloud.udb.client;

import cn.ucloud.common.handler.UcloudHandler;

import cn.ucloud.udb.model.ChangeUDBParamGroupParam;
import cn.ucloud.udb.model.ChangeUDBParamGroupResult;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-03-05 17:47
 **/
public class ChangeUDBParamGroupTest {

    private UDBClient client;

    private ChangeUDBParamGroupParam param;

    @Before
    public void setUp() throws Exception {
        client = GetUDBClient.getUDBClient();
        param = new ChangeUDBParamGroupParam("cn-sh2", "udb-h3q25faw", "sdk-java-test");
        param.setProjectId("org-izug1m");
    }

    // todo 测试
    @Test
    public void changeUDBParamGroup() {
        try {
            ChangeUDBParamGroupResult result = client.changeUDBParamGroup(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

    @Test
    public void changeUDBParamGroupCallback() {
        client.changeUDBParamGroup(param, new UcloudHandler<ChangeUDBParamGroupResult>() {
            @Override
            public Object success(ChangeUDBParamGroupResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(ChangeUDBParamGroupResult result) {
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