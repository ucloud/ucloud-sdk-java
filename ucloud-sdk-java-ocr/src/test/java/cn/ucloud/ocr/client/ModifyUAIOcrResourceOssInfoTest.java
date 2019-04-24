package cn.ucloud.ocr.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.ocr.model.ModifyUAIOcrResourceOssInfoParam;
import cn.ucloud.ocr.model.ModifyUAIOcrResourceOssInfoResult;
import cn.ucloud.ocr.pojo.OcrConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-04-19 16:04
 **/
public class ModifyUAIOcrResourceOssInfoTest {

    private OcrClient client;

    private ModifyUAIOcrResourceOssInfoParam param;

    @Before
    public void setUp() throws Exception {
        client = new DefaultOcrClient(new OcrConfig(
                new Account(System.getenv("UCloudPrivateKey"),
                        System.getenv("UCloudPublicKey"))));
        String projectId = System.getenv("ProjectId");
        String region = "cn-bj2";
        String resourceId = "uaiocr-uw4cd44y";
        String privateKey = "xxxxx";
        String publicKey = "xxxxx";
        param = new ModifyUAIOcrResourceOssInfoParam(region, resourceId, privateKey,publicKey);
        param.setProjectId(projectId);
    }

    @Test
    public void modifyUAIOcrResourceOssInfo() {
        try {
            ModifyUAIOcrResourceOssInfoResult result =
                    client.modifyUAIOcrResourceOssInfo(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }
}