package cn.ucloud.udb.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.udb.model.CreateUDBCInstanceParam;
import cn.ucloud.udb.model.CreateUDBCInstanceResult;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-03-06 10:33
 **/
public class CreateUDBCInstanceTest {

    private UDBClient client;

    private CreateUDBCInstanceParam param;


    @Before
    public void setUp() throws Exception {
        client = GetUDBClient.getUDBClient();
        param = new CreateUDBCInstanceParam("cn-sh2", "cn-sh2-02", "sdk-java-udbc", "1", "sdk-java");
        param.setProjectId("org-izug1m");
    }

    // todo 测试 权限错误
    @Test
    public void createUDBCInstance() {
        try {
            CreateUDBCInstanceResult result = client.createUDBCInstance(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

    @Test
    public void createUDBCInstanceCallback() {
        client.createUDBCInstance(param, new UcloudHandler<CreateUDBCInstanceResult>() {
            @Override
            public Object success(CreateUDBCInstanceResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(CreateUDBCInstanceResult result) {
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