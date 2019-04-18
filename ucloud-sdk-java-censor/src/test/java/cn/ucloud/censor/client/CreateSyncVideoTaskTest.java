package cn.ucloud.censor.client;

import cn.ucloud.censor.model.CreateAsyncVideoTaskParam;
import cn.ucloud.censor.model.CreateAsyncVideoTaskResult;
import cn.ucloud.censor.model.CreateSyncVideoTaskParam;
import cn.ucloud.censor.model.CreateSyncVideoTaskResult;
import cn.ucloud.censor.model.GetAsyncVideoTaskResultParam;
import cn.ucloud.censor.model.GetAsyncVideoTaskResultResult;
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
 * @Date : 2019-04-18 16:37
 **/
public class CreateSyncVideoTaskTest {

    private CensorClient client;

    private CreateSyncVideoTaskParam param;

    @Before
    public void setUp() throws Exception {
        client = new DefaultCensorClient(new CensorConfig(
                new Account(System.getenv("UCloudPrivateKey"),
                        System.getenv("UCloudPublicKey"))));
        String resourceId = "uaicensor-nkh1osfy";
        List<String> scenes = new ArrayList<>();
        scenes.add("porn");
        Integer interval = 26;
        String url = "http://dl74.80s.im:920/1610/80s测试短片/80s测试短片.mp4";
        param = new CreateSyncVideoTaskParam(resourceId, scenes, interval,url);
    }

    @Test
    public void createAsyncVideoTask() {
        try {
            CreateSyncVideoTaskResult result =
                    client.createSyncVideoTask(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }
}