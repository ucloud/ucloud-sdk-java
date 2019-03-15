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
        param = new DeleteUDBInstanceParam("cn-sh2", "udb-1bb42rf5");
        param.setProjectId("org-izug1m");
    }

    @Test
    public void deleteUDBCInstance() {
        try {
            DeleteUDBInstanceResult result = client.deleteUDBInstance(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }
}