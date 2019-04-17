package cn.ucloud.censor.client;

import cn.ucloud.censor.model.GetUAICensorResourceListParam;
import cn.ucloud.censor.model.GetUAICensorResourceListResult;
import cn.ucloud.censor.pojo.CensorConfig;
import cn.ucloud.common.pojo.Account;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-04-17 14:17
 **/
public class GetUAICensorResourceListTest {

    private CensorClient client;

    private GetUAICensorResourceListParam param;

    @Before
    public void setUp() throws Exception {
        client = new DefaultCensorClient(new CensorConfig(
                new Account(System.getenv("UCloudPrivateKey"),
                        System.getenv("UCloudPublicKey"))));
        String projectId = System.getenv("ProjectId");
        String region = "cn-bj2";
        String zone = "cn-bj2-04";
        param = new GetUAICensorResourceListParam(region, zone);
        param.setProjectId(projectId);
    }

    @Test
    public void getUAICensorResourceList() {
        try {
            GetUAICensorResourceListResult result =
                    client.getUAICensorResourceList(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }
}