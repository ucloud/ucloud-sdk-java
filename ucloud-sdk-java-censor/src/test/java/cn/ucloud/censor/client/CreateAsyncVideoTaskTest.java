package cn.ucloud.censor.client;

import cn.ucloud.censor.model.CreateAsyncVideoTaskParam;
import cn.ucloud.censor.model.CreateAsyncVideoTaskResult;
import cn.ucloud.censor.pojo.CensorConfig;
import cn.ucloud.common.pojo.Account;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertNull;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-04-18 14:40
 **/
public class CreateAsyncVideoTaskTest {
    private CensorClient client;

    private CreateAsyncVideoTaskParam param;

    @Before
    public void setUp() throws Exception {
        client = new DefaultCensorClient(new CensorConfig(
                new Account(System.getenv("UCloudPrivateKey"),
                        System.getenv("UCloudPublicKey"))));
        String resourceId = "uaicensor-nkh1osfy";
        List<String> scenes = new ArrayList<>();
        scenes.add("porn");
        Integer interval = 26;
        String url = "http://dl623.80s.im:920/1904/坚不可摧/坚不可摧.mp4";
        param = new CreateAsyncVideoTaskParam(resourceId, scenes, interval,url);
    }

    @Test
    public void createAsyncVideoTask() {
        try {
            CreateAsyncVideoTaskResult result =
                    client.createAsyncVideoTask(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }
}