package cn.ucloud.ocr.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.ocr.model.GetUAIOcrAvailResourceTypeParam;
import cn.ucloud.ocr.model.GetUAIOcrAvailResourceTypeResult;
import cn.ucloud.ocr.pojo.OcrConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-04-19 15:33
 **/
public class GetUAIOcrAvailResourceTypeTest {


    private OcrClient client;

    private GetUAIOcrAvailResourceTypeParam param;

    @Before
    public void setUp() throws Exception {
        client = new DefaultOcrClient(new OcrConfig(
                new Account(System.getenv("UCloudPrivateKey"),
                        System.getenv("UCloudPublicKey"))));
        String projectId = System.getenv("ProjectId");
        String region = "cn-bj2";
        param = new GetUAIOcrAvailResourceTypeParam(region);
        param.setProjectId(projectId);
    }

    @Test
    public void getUAICensorAvailResourceType() {
        try {
            GetUAIOcrAvailResourceTypeResult result =
                    client.getUAIOcrAvailResourceType(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

}