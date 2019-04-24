package cn.ucloud.ocr.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.ocr.model.ModifyUAIOcrResourceNameParam;
import cn.ucloud.ocr.model.ModifyUAIOcrResourceNameResult;
import cn.ucloud.ocr.pojo.OcrConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-04-19 16:04
 **/
public class ModifyUAIOcrResourceNameTest {

    private OcrClient client;

    private ModifyUAIOcrResourceNameParam param;

    @Before
    public void setUp() throws Exception {
        client = new DefaultOcrClient(new OcrConfig(
                new Account(System.getenv("UCloudPrivateKey"),
                        System.getenv("UCloudPublicKey"))));
        String projectId = System.getenv("ProjectId");
        String region = "cn-bj2";
        String resourceId = "uaiocr-uw4cd44y";
        String resourceName = "sdk-test-name";
        param = new ModifyUAIOcrResourceNameParam(region,resourceId,resourceName);
        param.setProjectId(projectId);
    }

    @Test
    public void modifyUAIOcrResourceName() {
        try {
            ModifyUAIOcrResourceNameResult result =
                    client.modifyUAIOcrResourceName(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }
}