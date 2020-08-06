package cn.ucloud.usms.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.usms.model.UpdateUSMSTemplateParam;
import cn.ucloud.usms.model.UpdateUSMSTemplateResult;
import cn.ucloud.usms.pojo.USMSConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: codezhang
 * @date: 2019/12/13 11:15 下午
 * @describe:
 **/
public class UpdateUSMSTemplateTest {
    private USMSClient client;

    private UpdateUSMSTemplateParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultUSMSClient(new USMSConfig(
                new Account(System.getenv("UCloudPrivateKey"),
                        System.getenv("UCloudPublicKey"))));
        param = new UpdateUSMSTemplateParam(
                System.getenv("UnPassUSMSTemplateId"),
                "sdk-test,time:{1}",
                "sdk-java-test-不用审核通过");
    }

    @Test
    public void updateUSMSTemplate() {
        try {
            UpdateUSMSTemplateResult result = client.updateUSMSTemplate(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

    @Test
    public void updateUSMSTemplateCallback() {
        client.updateUSMSTemplate(param, new UcloudHandler<UpdateUSMSTemplateResult>() {
            @Override
            public Object success(UpdateUSMSTemplateResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(UpdateUSMSTemplateResult result) {
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