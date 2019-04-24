package cn.ucloud.ocr.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.ocr.model.GetUAIOcrResourceRecordInfoParam;
import cn.ucloud.ocr.model.GetUAIOcrResourceRecordInfoResult;
import cn.ucloud.ocr.model.ModifyUAIOcrResourceMemoParam;
import cn.ucloud.ocr.model.ModifyUAIOcrResourceMemoResult;
import cn.ucloud.ocr.pojo.OcrConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-04-19 16:36
 **/
public class GetUAIOcrResourceRecordInfoTest {
    private OcrClient client;

    private GetUAIOcrResourceRecordInfoParam param;

    @Before
    public void setUp() throws Exception {
        client = new DefaultOcrClient(new OcrConfig(
                new Account(System.getenv("UCloudPrivateKey"),
                        System.getenv("UCloudPublicKey"))));
        String projectId = System.getenv("ProjectId");
        String region = "cn-bj2";
        Long beginTime = 1555557017L;
        Long endTime = 1555638570L;
        param = new GetUAIOcrResourceRecordInfoParam(region,beginTime,endTime);
        param.setProjectId(projectId);
    }

    @Test
    public void getUAIOcrResourceRecordInfo() {
        try {
            GetUAIOcrResourceRecordInfoResult result =
                    client.getUAIOcrResourceRecordInfo(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }
}