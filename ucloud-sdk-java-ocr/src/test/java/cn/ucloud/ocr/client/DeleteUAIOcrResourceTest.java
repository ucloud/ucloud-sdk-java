package cn.ucloud.ocr.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.ocr.model.DeleteUAIOcrResourceParam;
import cn.ucloud.ocr.model.DeleteUAIOcrResourceResult;
import cn.ucloud.ocr.pojo.OcrConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-04-19 16:41
 **/
public class DeleteUAIOcrResourceTest {

    private OcrClient client;

    private DeleteUAIOcrResourceParam param;

    @Before
    public void setUp() throws Exception {
        client = new DefaultOcrClient(new OcrConfig(
                new Account(System.getenv("UCloudPrivateKey"),
                        System.getenv("UCloudPublicKey"))));
        String projectId = System.getenv("ProjectId");
        String region = "cn-bj2";
        String resourceId = "uaiocr-uw4cd44y";
        param = new DeleteUAIOcrResourceParam(region, resourceId);
        param.setProjectId(projectId);
    }

    @Test
    public void deleteUAIOcrResource() {
        try {
            DeleteUAIOcrResourceResult result =
                    client.deleteUAIOcrResource(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

}