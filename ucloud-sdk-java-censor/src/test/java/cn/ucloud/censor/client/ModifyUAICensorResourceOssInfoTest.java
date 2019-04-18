package cn.ucloud.censor.client;

import cn.ucloud.censor.model.CreateUAICensorResourceParam;
import cn.ucloud.censor.model.CreateUAICensorResourceResult;
import cn.ucloud.censor.model.ModifyUAICensorResourceOssInfoParam;
import cn.ucloud.censor.model.ModifyUAICensorResourceOssInfoResult;
import cn.ucloud.censor.pojo.CensorConfig;
import cn.ucloud.common.pojo.Account;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-04-17 15:25
 **/
public class ModifyUAICensorResourceOssInfoTest {

    private CensorClient client;

    private ModifyUAICensorResourceOssInfoParam param;

    @Before
    public void setUp() throws Exception {
        client = new DefaultCensorClient(new CensorConfig(
                new Account(System.getenv("UCloudPrivateKey"),
                        System.getenv("UCloudPublicKey"))));
        String projectId = System.getenv("ProjectId");
        String region = "cn-bj2";
        String zone = "cn-bj2-04";
        String ossPublicKey = "xxx";
        String ossPrivateKey = "xxxxxx";
        String resourceId = "uaicensor-chlf1kri";
        param = new ModifyUAICensorResourceOssInfoParam(region,zone,resourceId,ossPublicKey,ossPrivateKey);
        param.setProjectId(projectId);
    }

    @Test
    public void modifyUAICensorResourceOssInfo() {
        try {
            ModifyUAICensorResourceOssInfoResult result =
                    client.modifyUAICensorResourceOssInfo(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

}