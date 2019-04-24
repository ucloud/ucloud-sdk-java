package cn.ucloud.ocr.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.ocr.model.GetUAIOcrResourceListParam;
import cn.ucloud.ocr.model.GetUAIOcrResourceListResult;
import cn.ucloud.ocr.pojo.OcrConfig;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-04-19 15:51
 **/
public class GetUAIOcrResourceListTest {

    private OcrClient client;

    private GetUAIOcrResourceListParam param;

    @Before
    public void setUp() throws Exception {
        client = new DefaultOcrClient(new OcrConfig(
                new Account(System.getenv("UCloudPrivateKey"),
                        System.getenv("UCloudPublicKey"))));
        String projectId = System.getenv("ProjectId");
        String region = "cn-bj2";
        param = new GetUAIOcrResourceListParam(region);
        param.setProjectId(projectId);
    }

    @Test
    public void getUAIOcrResourceList() {
        try {
            GetUAIOcrResourceListResult result =
                    client.getUAIOcrResourceList(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }
}