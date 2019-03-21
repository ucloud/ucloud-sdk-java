package cn.ucloud.pathx.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.pathx.model.GetGlobalSSHTrafficParam;
import cn.ucloud.pathx.model.GetGlobalSSHTrafficResult;
import cn.ucloud.pathx.pojo.PATHXConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;


/**
 * @Description : PATHX.GetGlobalSSHTraffic 测试
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 10:02
 **/
public class GetGlobalSSHTrafficTest {

    private PATHXClient client;

    private GetGlobalSSHTrafficParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultPATHXClient(new PATHXConfig(
                new Account(System.getenv("UCloudPrivateKey"),
                        System.getenv("UCloudPublicKey"))));
        String projectId = "org-izug1m";
        String uGAId = "uga-eskzpkk2";
        Integer beginTime = 1552460481;
        Integer endTime = 1552546881;
        param = new GetGlobalSSHTrafficParam(projectId, uGAId, beginTime, endTime);
    }


    @Test
    public void getGlobalSSHTraffic() {
        try {
            GetGlobalSSHTrafficResult result = client.getGlobalSSHTraffic(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

}