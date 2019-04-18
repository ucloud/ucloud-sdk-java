package cn.ucloud.censor.client;

import cn.ucloud.censor.model.CreateImageTaskParam;
import cn.ucloud.censor.model.CreateImageTaskResult;
import cn.ucloud.censor.model.GetAsyncVideoTaskResultParam;
import cn.ucloud.censor.model.GetAsyncVideoTaskResultResult;
import cn.ucloud.censor.pojo.CensorConfig;
import cn.ucloud.common.pojo.Account;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-04-18 15:18
 **/
public class GetAsyncVideoTaskResultTest {
    private CensorClient client;

    private GetAsyncVideoTaskResultParam param;

    @Before
    public void setUp() throws Exception {
        client = new DefaultCensorClient(new CensorConfig(
                new Account(System.getenv("UCloudPrivateKey"),
                        System.getenv("UCloudPublicKey"))));
        String resourceId = "uaicensor-nkh1osfy";
        String jobId = "16b6c952-8404-4b16-8a1b-b75c0a059d53";
        param = new GetAsyncVideoTaskResultParam(resourceId,jobId);
    }

    @Test
    public void createImageTask() {
        try {
            GetAsyncVideoTaskResultResult result =
                    client.getAsyncVideoTaskResult(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            e.printStackTrace();
            assertNull(e);
        }
    }
}