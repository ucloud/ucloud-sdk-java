package cn.ucloud.udb.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.util.JSONComparator;
import cn.ucloud.udb.model.DeleteUDBCInstanceParam;
import cn.ucloud.udb.model.DeleteUDBCInstanceResult;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-03-06 14:08
 **/
public class DeleteUDBCInstanceTest {


    private UDBClient client;

    private DeleteUDBCInstanceParam param;


    @Before
    public void setUp() throws Exception {
        client = GetUDBClient.getUDBClient();
        param = new DeleteUDBCInstanceParam("cn-sh2", "cn-sh2-02", "udbc-xxx");
        param.setProjectId("org-izug1m");
    }

    // todo 测试 权限问题
    @Test
    public void deleteUDBCInstance() {
        try {
            DeleteUDBCInstanceResult result = client.deleteUDBCInstance(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

    @Test
    public void deleteUDBCInstanceCallback() {
        client.deleteUDBCInstance(param, new UcloudHandler<DeleteUDBCInstanceResult>() {
            @Override
            public Object success(DeleteUDBCInstanceResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(DeleteUDBCInstanceResult result) {
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