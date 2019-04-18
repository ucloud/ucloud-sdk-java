package cn.ucloud.censor.client;

import cn.ucloud.censor.model.CreateUAICensorResourceResult;
import cn.ucloud.censor.model.GetUAICensorResourceMetricInfoParam;
import cn.ucloud.censor.model.GetUAICensorResourceMetricInfoResult;
import cn.ucloud.censor.pojo.CensorConfig;
import cn.ucloud.common.pojo.Account;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-04-18 17:33
 **/
public class GetUAICensorResourceMetricInfoTest {
    private CensorClient client;

    private GetUAICensorResourceMetricInfoParam param;

    @Before
    public void setUp() throws Exception {
        client = new DefaultCensorClient(new CensorConfig(
                new Account(System.getenv("UCloudPrivateKey"),
                        System.getenv("UCloudPublicKey"))));
        String projectId = System.getenv("ProjectId");
        String region = "cn-bj2";
        String zone = "cn-bj2-04";
        Long beginTime = 1555557017L;
        Long endTime = 1555578617L;
        String resourceId = "uaicensor-nkh1osfy";
        param = new GetUAICensorResourceMetricInfoParam(region, beginTime, endTime,resourceId);
        param.setProjectId(projectId);
    }

    @Test
    public void createUAICensorResource() {
        try {
            GetUAICensorResourceMetricInfoResult result =
                    client.getUAICensorResourceMetricInfo(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }
}