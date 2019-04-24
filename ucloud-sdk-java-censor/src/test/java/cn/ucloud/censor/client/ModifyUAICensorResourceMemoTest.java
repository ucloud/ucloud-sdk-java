package cn.ucloud.censor.client;

import cn.ucloud.censor.model.ModifyUAICensorResourceMemoParam;
import cn.ucloud.censor.model.ModifyUAICensorResourceMemoResult;
import cn.ucloud.censor.pojo.CensorConfig;
import cn.ucloud.common.pojo.Account;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-04-17 14:27
 **/
public class ModifyUAICensorResourceMemoTest {

    private CensorClient client;

    private ModifyUAICensorResourceMemoParam param;

    @Before
    public void setUp() throws Exception {
        client = new DefaultCensorClient(new CensorConfig(
                new Account(System.getenv("UCloudPrivateKey"),
                        System.getenv("UCloudPublicKey"))));
        String projectId = System.getenv("ProjectId");
        String region = "cn-bj2";
        String zone = "cn-bj2-04";
        String resourceId = "uaicensor-42yuglvf";
        String resourceMemo = "demo";
        param = new ModifyUAICensorResourceMemoParam(region, zone, resourceId,resourceMemo);
        param.setProjectId(projectId);
    }

    @Test
    public void modifyUAICensorResourceMemo() {
        try {
            ModifyUAICensorResourceMemoResult result =
                    client.modifyUAICensorResourceMemo(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

}