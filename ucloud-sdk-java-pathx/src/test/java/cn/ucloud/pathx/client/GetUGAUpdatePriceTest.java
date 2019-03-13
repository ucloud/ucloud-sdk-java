package cn.ucloud.pathx.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.pathx.model.GetUGAUpdatePriceParam;
import cn.ucloud.pathx.model.GetUGAUpdatePriceResult;
import cn.ucloud.pathx.pojo.PATHXConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;


/**
 * @Description : PATHX.GetUGAUpdatePrice 测试
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 10:02
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

}