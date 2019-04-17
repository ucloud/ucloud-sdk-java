package cn.ucloud.censor.client;

import cn.ucloud.censor.model.DeleteUAICensorResourceParam;
import cn.ucloud.censor.model.DeleteUAICensorResourceResult;
import cn.ucloud.censor.model.ModifyUAICensorResourceMemoParam;
import cn.ucloud.censor.model.ModifyUAICensorResourceMemoResult;
import cn.ucloud.censor.pojo.CensorConfig;
import cn.ucloud.common.pojo.Account;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-04-17 14:43
 **/
public class DeleteUAICensorResourceTest {

    private CensorClient client;

    private DeleteUAICensorResourceParam param;

    @Before
    public void setUp() throws Exception {
        client = new DefaultCensorClient(new CensorConfig(
                new Account(System.getenv("UCloudPrivateKey"),
                        System.getenv("UCloudPublicKey"))));
        String projectId = System.getenv("ProjectId");
        String region = "cn-bj2";
        String zone = "cn-bj2-04";
        String resourceId = "uaicensor-aqlfqidb";
        param = new DeleteUAICensorResourceParam(region, zone, resourceId);
        param.setProjectId(projectId);
    }

    @Test
    public void deleteUAICensorResource() {
        try {
            DeleteUAICensorResourceResult result =
                    client.deleteUAICensorResource(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

}