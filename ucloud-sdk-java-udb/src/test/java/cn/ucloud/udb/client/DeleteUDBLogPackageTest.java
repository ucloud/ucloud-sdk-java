package cn.ucloud.udb.client;

import cn.ucloud.common.handler.UcloudHandler;

import cn.ucloud.udb.model.DeleteUDBLogPackageParam;
import cn.ucloud.udb.model.DeleteUDBLogPackageResult;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-03-06 14:15
 **/
public class DeleteUDBLogPackageTest {


    private UDBClient client;

    private DeleteUDBLogPackageParam param;


    @Before
    public void setUp() throws Exception {
        client = GetUDBClient.getUDBClient();
        param = new DeleteUDBLogPackageParam("cn-sh2", "cn-sh2-02", "62493");
        param.setProjectId("org-izug1m");
    }

    @Test
    public void deleteUDBLogPackage() {
        try {
            DeleteUDBLogPackageResult result = client.deleteUDBLogPackage(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

    @Test
    public void deleteUDBLogPackageCallback() {
        client.deleteUDBLogPackage(param, new UcloudHandler<DeleteUDBLogPackageResult>() {
            @Override
            public Object success(DeleteUDBLogPackageResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(DeleteUDBLogPackageResult result) {
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