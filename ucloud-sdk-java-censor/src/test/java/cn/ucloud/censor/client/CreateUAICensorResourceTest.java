package cn.ucloud.censor.client;

import cn.ucloud.censor.model.CreateUAICensorResourceParam;
import cn.ucloud.censor.model.CreateUAICensorResourceResult;
import cn.ucloud.censor.model.GetUAICensorAvailResourceTypeParam;
import cn.ucloud.censor.model.GetUAICensorAvailResourceTypeResult;
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
 * @Date : 2019-04-17 14:05
 **/
public class CreateUAICensorResourceTest {

    private CensorClient client;

    private CreateUAICensorResourceParam param;

    @Before
    public void setUp() throws Exception {
        client = new DefaultCensorClient(new CensorConfig(
                new Account(System.getenv("UCloudPrivateKey"),
                        System.getenv("UCloudPublicKey"))));
        String projectId = System.getenv("ProjectId");
        String region = "cn-bj2";
        String zone = "cn-bj2-04";
        List<Integer> ids = new ArrayList<>();
        ids.add(1);
        ids.add(2);
        param = new CreateUAICensorResourceParam(region,zone,ids);
        param.setProjectId(projectId);
    }

    @Test
    public void createUAICensorResource() {
        try {
            CreateUAICensorResourceResult result =
                    client.createUAICensorResource(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }
}