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
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        String projectId = "cn-sh2";
        String uGAId = "cn-sh2";
        Integer beginTime = 1;
        Integer endTime = 1;
        param = new GetGlobalSSHTrafficParam(projectId, uGAId, beginTime, endTime);
        param.setProjectId("org-izug1m");
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