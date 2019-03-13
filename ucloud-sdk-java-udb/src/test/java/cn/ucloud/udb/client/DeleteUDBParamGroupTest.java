package cn.ucloud.udb.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.udb.model.DeleteUDBParamGroupParam;
import cn.ucloud.udb.model.DeleteUDBParamGroupResult;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-03-07 16:30
 **/
public class DeleteUDBParamGroupTest {
    private UDBClient client;

    private DeleteUDBParamGroupParam param;


    @Before
    public void setUp() throws Exception {
        client = GetUDBClient.getUDBClient();
        param = new DeleteUDBParamGroupParam("cn-sh2", "cn-sh2-02", 18921);
        param.setProjectId("org-izug1m");
    }

    @Test
    public void deleteUDBParamGroup() {
        try {
            DeleteUDBParamGroupResult result = client.deleteUDBParamGroup(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

    @Test
    public void deleteUDBParamGroupCallback() {
        client.deleteUDBParamGroup(param, new UcloudHandler<DeleteUDBParamGroupResult>() {
            @Override
            public Object success(DeleteUDBParamGroupResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(DeleteUDBParamGroupResult result) {
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