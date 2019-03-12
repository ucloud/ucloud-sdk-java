package cn.ucloud.pathx.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.common.util.JSONComparator;
import cn.ucloud.pathx.model.GetUGAUpdatePriceParam;
import cn.ucloud.pathx.model.GetUGAUpdatePriceResult;
import cn.ucloud.pathx.pojo.PATHXConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;


/**
 * @Description : PATHX.GetUGAUpdatePrice 测试
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-12 04:27
 **/
public class GetUGAUpdatePriceTest {

    private PATHXClient client;

    private GetUGAUpdatePriceParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultPATHXClient(new PATHXConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        String projectId = "cn-sh2";
        Integer uPathNum = 1;
        param = new GetUGAUpdatePriceParam(projectId, uPathNum);
        param.setProjectId("org-izug1m");
    }


    @Test
    public void getUGAUpdatePrice() {
        try {
            GetUGAUpdatePriceResult result = client.getUGAUpdatePrice(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

    @Test
    public void getUGAUpdatePriceCallback() {
        client.getUGAUpdatePrice(param, new UcloudHandler
                <GetUGAUpdatePriceResult>() {
            @Override
            public Object success(GetUGAUpdatePriceResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(GetUGAUpdatePriceResult result) {
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