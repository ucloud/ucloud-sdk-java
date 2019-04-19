package cn.ucloud.ocr.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.ocr.model.ModifyUAIOcrResourceMemoParam;
import cn.ucloud.ocr.model.ModifyUAIOcrResourceMemoResult;
import cn.ucloud.ocr.pojo.OcrConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-04-19 16:04
 **/
public class ModifyUAIOcrResourceMemoTest {

    private OcrClient client;

    private ModifyUAIOcrResourceMemoParam param;

    @Before
    public void setUp() throws Exception {
        client = new DefaultOcrClient(new OcrConfig(
                new Account(System.getenv("UCloudPrivateKey"),
                        System.getenv("UCloudPublicKey"))));
        String projectId = System.getenv("ProjectId");
        String region = "cn-bj2";
        String resourceId = "uaiocr-uw4cd44y";
        String resourceMemo = "sdk-test";
        param = new ModifyUAIOcrResourceMemoParam(region,resourceId,resourceMemo);
        param.setProjectId(projectId);
    }

    @Test
    public void modifyUAIOcrResourceMemo() {
        try {
            ModifyUAIOcrResourceMemoResult result =
                    client.modifyUAIOcrResourceMemo(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }
}