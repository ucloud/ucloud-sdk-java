package cn.ucloud.pathx.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.pathx.model.GetUPathUpdatePriceParam;
import cn.ucloud.pathx.model.GetUPathUpdatePriceResult;
import cn.ucloud.pathx.pojo.PATHXConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;


/**
 * @Description : PATHX.GetUPathUpdatePrice 测试
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 10:02
 **/
public class GetUPathUpdatePriceTest {

    private PATHXClient client;

    private GetUPathUpdatePriceParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultPATHXClient(new PATHXConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        String projectId = "cn-sh2";
        String resourceId = "cn-sh2";
        Integer bandwidth = 1;
        param = new GetUPathUpdatePriceParam(projectId, resourceId, bandwidth);
        param.setProjectId("org-izug1m");
    }


    @Test
    public void getUPathUpdatePrice() {
        try {
            GetUPathUpdatePriceResult result = client.getUPathUpdatePrice(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

}