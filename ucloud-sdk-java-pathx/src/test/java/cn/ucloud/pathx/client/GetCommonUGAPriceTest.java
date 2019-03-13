package cn.ucloud.pathx.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.pathx.model.GetCommonUGAPriceParam;
import cn.ucloud.pathx.model.GetCommonUGAPriceResult;
import cn.ucloud.pathx.pojo.PATHXConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;


/**
 * @Description : PATHX.GetCommonUGAPrice 测试
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 10:02
 **/
public class GetCommonUGAPriceTest {

    private PATHXClient client;

    private GetCommonUGAPriceParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultPATHXClient(new PATHXConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        String projectId = "cn-sh2";
        param = new GetCommonUGAPriceParam(projectId);
        param.setProjectId("org-izug1m");
    }


    @Test
    public void getCommonUGAPrice() {
        try {
            GetCommonUGAPriceResult result = client.getCommonUGAPrice(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

}