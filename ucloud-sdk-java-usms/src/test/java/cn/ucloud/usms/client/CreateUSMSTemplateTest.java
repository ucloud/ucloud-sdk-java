package cn.ucloud.usms.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.usms.model.CreateUSMSSignatureParam;
import cn.ucloud.usms.model.CreateUSMSTemplateParam;
import cn.ucloud.usms.model.CreateUSMSTemplateResult;
import cn.ucloud.usms.pojo.USMSConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: codezhang
 * @date: 2019/12/13 10:53 下午
 * @describe:
 **/
public class CreateUSMSTemplateTest {

    private USMSClient client;

    private CreateUSMSTemplateParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultUSMSClient(new USMSConfig(
                new Account(System.getenv("UCloudPrivateKey"),
                        System.getenv("UCloudPublicKey"))));
        param = new CreateUSMSTemplateParam(2,
                "sdk-java-test-不要通过审核",
                "sdk java test,time{1}");
    }

    @Test
    public void createUSMSTemplate() {
        try {
            CreateUSMSTemplateResult result = client.createUSMSTemplate(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

    @Test
    public void createUSMSTemplateCallback() {
        client.createUSMSTemplate(param, new UcloudHandler<CreateUSMSTemplateResult>() {
            @Override
            public Object success(CreateUSMSTemplateResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(CreateUSMSTemplateResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object error(Exception e) {
                assertNull(e);
                return null;
            }
        });
    }
}