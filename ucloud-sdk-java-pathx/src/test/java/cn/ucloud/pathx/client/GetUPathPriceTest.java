package cn.ucloud.pathx.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.pathx.model.GetUPathPriceParam;
import cn.ucloud.pathx.model.GetUPathPriceResult;
import cn.ucloud.pathx.pojo.PATHXConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;


/**
 * @Description : PATHX.GetUPathPrice 测试
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 10:02
 **/
public class GetUPathPriceTest {

    private PATHXClient client;

    private GetUPathPriceParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultPATHXClient(new PATHXConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        String projectId = "cn-sh2";
        Integer bandwidth = 1;
        Integer quantity = 1;
        String chargeType = "cn-sh2";
        String lineId = "cn-sh2";
        param = new GetUPathPriceParam(projectId, bandwidth, quantity, chargeType, lineId);
        param.setProjectId("org-izug1m");
    }


    @Test
    public void getUPathPrice() {
        try {
            GetUPathPriceResult result = client.getUPathPrice(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

}