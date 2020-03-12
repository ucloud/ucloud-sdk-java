package cn.ucloud.usms.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.usms.model.SendUSMSMessageParam;
import cn.ucloud.usms.model.SendUSMSMessageResult;
import cn.ucloud.usms.pojo.USMSConfig;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertNull;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-06-04 17:36
 **/
public class SendUSMSMessageTest {

    private USMSClient client;

    private SendUSMSMessageParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultUSMSClient(new USMSConfig(
                new Account(System.getenv("UCloudPrivateKey"),
                        System.getenv("UCloudPublicKey"))));
        List<String> phoneNumbers = new ArrayList<>();
        phoneNumbers.add(System.getenv("USMSPhone"));
        String templateId = System.getenv("USMSTemplateId");
        param = new SendUSMSMessageParam(phoneNumbers, templateId);
        param.setSigContent(System.getenv("USMSSigId"));
        param.setProjectId(System.getenv("ProjectId"));
//      List<String> templateParams = new ArrayList<>();
//      templateParams.add("param test");
//      param.setTemplateParams(templateParams);
    }


    @Test
    public void sendUSMSMessage() {
        try {
            SendUSMSMessageResult result = client.sendUSMSMessage(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            e.printStackTrace();
            assertNull(e);
        }
    }
}