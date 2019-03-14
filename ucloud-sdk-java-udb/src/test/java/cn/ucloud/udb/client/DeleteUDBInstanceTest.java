package cn.ucloud.udb.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.udb.model.DeleteUDBInstanceParam;
import cn.ucloud.udb.model.DeleteUDBInstanceResult;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-03-06 14:10
 **/
public class DeleteUDBInstanceTest {


    private UDBClient client;

    private DeleteUDBInstanceParam param;


    @Before
    public void setUp() throws Exception {
        client = GetUDBClient.getUDBClient();
        param = new DeleteUDBInstanceParam("cn-sh2", "udb-h3q25faw");
        param.setProjectId("org-izug1m");
    }

    // todo 测试 删除接口异常
    @Test
    public void deleteUDBCInstance() {
        try {
            DeleteUDBInstanceResult result = client.deleteUDBInstance(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

    @Test
    public void deleteUDBCInstanceCallback() {
        client.deleteUDBInstance(param, new UcloudHandler<DeleteUDBInstanceResult>() {
            @Override
            public Object success(DeleteUDBInstanceResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(DeleteUDBInstanceResult result) {
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