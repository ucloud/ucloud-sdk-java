package cn.ucloud.udb.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.util.JSONComparator;
import cn.ucloud.udb.model.CreateUDBParamGroupParam;
import cn.ucloud.udb.model.CreateUDBParamGroupResult;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-03-06 11:13
 **/
public class CreateUDBParamGroupTest {

    private UDBClient client;

    private CreateUDBParamGroupParam param;


    @Before
    public void setUp() throws Exception {
        client = GetUDBClient.getUDBClient();
        param = new CreateUDBParamGroupParam("cn-sh2", "cn-sh2-02", "sdk-java-param-group",
                "sdk-java", "udb-hzceb3cr", "mongodb-3.2");
        param.setProjectId("org-izug1m");
    }

    @Test
    public void createUDBParamGroup() {
        try {
            CreateUDBParamGroupResult result = client.createUDBParamGroup(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

    @Test
    public void createUDBParamGroupCallback() {
        client.createUDBParamGroup(param, new UcloudHandler<CreateUDBParamGroupResult>() {
            @Override
            public Object success(CreateUDBParamGroupResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(CreateUDBParamGroupResult result) {
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