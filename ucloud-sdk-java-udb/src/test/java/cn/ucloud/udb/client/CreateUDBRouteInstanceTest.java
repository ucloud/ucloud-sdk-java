package cn.ucloud.udb.client;

import cn.ucloud.common.handler.UcloudHandler;

import cn.ucloud.udb.model.CreateUDBRouteInstanceParam;
import cn.ucloud.udb.model.CreateUDBRouteInstanceResult;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertNotNull;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-03-06 11:31
 **/
public class CreateUDBRouteInstanceTest {

    private UDBClient client;

    private CreateUDBRouteInstanceParam param;


    @Before
    public void setUp() throws Exception {
        client = GetUDBClient.getUDBClient();
        List<String> dbIds = new ArrayList<>();
        dbIds.add("udb-5yb2i0vn");
        param = new CreateUDBRouteInstanceParam("cn-sh2", "mongodb-3.2", "route-mongo",
                27017, 26, 1000, 20, dbIds);
        param.setProjectId("org-izug1m");
    }

    @Test
    public void createUDBRouteInstance() {
        try {
            CreateUDBRouteInstanceResult result = client.createUDBRouteInstance(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void createUDBRouteInstanceCallback() {
        client.createUDBRouteInstance(param, new UcloudHandler<CreateUDBRouteInstanceResult>() {
            @Override
            public Object success(CreateUDBRouteInstanceResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(CreateUDBRouteInstanceResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object error(Exception e) {
                assertNotNull(e);
                return null;
            }
        }, false);
    }
}