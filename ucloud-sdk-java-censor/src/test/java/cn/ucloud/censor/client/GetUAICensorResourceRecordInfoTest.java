package cn.ucloud.censor.client;

import cn.ucloud.censor.model.GetUAICensorAvailResourceTypeParam;
import cn.ucloud.censor.model.GetUAICensorAvailResourceTypeResult;
import cn.ucloud.censor.model.GetUAICensorResourceRecordInfoParam;
import cn.ucloud.censor.model.GetUAICensorResourceRecordInfoResult;
import cn.ucloud.censor.pojo.CensorConfig;
import cn.ucloud.common.pojo.Account;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-04-18 17:07
 **/
public class GetUAICensorResourceRecordInfoTest {

    private CensorClient client;

    private GetUAICensorResourceRecordInfoParam param;

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
        param = new GetUAICensorResourceRecordInfoParam(region,zone,beginTime,endTime);
        param.setProjectId(projectId);
    }

    @Test
    public void getUAICensorResourceRecordInfo() {
        try {
            GetUAICensorResourceRecordInfoResult result =
                    client.getUAICensorResourceRecordInfo(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }
}