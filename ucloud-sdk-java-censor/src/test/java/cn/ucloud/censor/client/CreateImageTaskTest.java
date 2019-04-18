package cn.ucloud.censor.client;

import cn.ucloud.censor.model.CreateImageTaskParam;
import cn.ucloud.censor.model.CreateImageTaskResult;
import cn.ucloud.censor.model.CreateUAICensorResourceParam;
import cn.ucloud.censor.model.CreateUAICensorResourceResult;
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
 * @Date : 2019-04-18 10:18
 **/
public class CreateImageTaskTest {

    private CensorClient client;

    private CreateImageTaskParam param;

    @Before
    public void setUp() throws Exception {
        client = new DefaultCensorClient(new CensorConfig(
                new Account(System.getenv("UCloudPrivateKey"),
                        System.getenv("UCloudPublicKey"))));
        String resourceId = "uaicensor-nkh1osfy";
        List<String> scenes = new ArrayList<>();
        scenes.add("porn");
        String method = "url";
        String url = "https://p.ssl.qhimg.com/dmfd/400_300_/t0120b2f23b554b8402.jpg";
        param = new CreateImageTaskParam(resourceId,scenes,method);
        param.setUrl(url);
    }

    @Test
    public void createImageTask() {
        try {
            CreateImageTaskResult result =
                    client.createImageTask(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            e.printStackTrace();
            assertNull(e);
        }
    }
}