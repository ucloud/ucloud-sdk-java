package cn.ucloud.ocr.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.ocr.model.CreateUAIOcrResourceParam;
import cn.ucloud.ocr.model.CreateUAIOcrResourceResult;
import cn.ucloud.ocr.model.GetUAIOcrAvailResourceTypeParam;
import cn.ucloud.ocr.model.GetUAIOcrAvailResourceTypeResult;
import cn.ucloud.ocr.pojo.OcrConfig;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-04-19 15:41
 **/
public class CreateUAIOcrResourceTest {

    private OcrClient client;

    private CreateUAIOcrResourceParam param;

    @Before
    public void setUp() throws Exception {
        client = new DefaultOcrClient(new OcrConfig(
                new Account(System.getenv("UCloudPrivateKey"),
                        System.getenv("UCloudPublicKey"))));
        String projectId = System.getenv("ProjectId");
        String region = "cn-bj2";
        List<Integer> ids = new ArrayList<>();
        ids.add(0);
        param = new CreateUAIOcrResourceParam(region,ids);
        param.setProjectId(projectId);
    }

    @Test
    public void createUAIOcrResource() {
        try {
            CreateUAIOcrResourceResult result =
                    client.createUAIOcrResource(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }
}