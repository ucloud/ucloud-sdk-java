package cn.ucloud.usms.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.usms.model.DeleteUSMSSignatureParam;
import cn.ucloud.usms.model.DeleteUSMSTemplateParam;
import cn.ucloud.usms.model.DeleteUSMSTemplateResult;
import cn.ucloud.usms.pojo.USMSConfig;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author: codezhang
 * @date: 2019/12/13 11:25 下午
 * @describe:
 **/
public class DeleteUSMSTemplateTest {

    private USMSClient client;

    private DeleteUSMSTemplateParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultUSMSClient(new USMSConfig(
                new Account(System.getenv("UCloudPrivateKey"),
                        System.getenv("UCloudPublicKey"))));
        List<String> templateIds = new ArrayList<>();
        templateIds.add("UTN1912130094F5");
        param = new DeleteUSMSTemplateParam(templateIds);
    }

    @Test
    public void deleteUSMSTemplate() {
        try {
            DeleteUSMSTemplateResult result = client.deleteUSMSTemplate(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

    @Test
    public void testDeleteUSMSTemplate() {
        client.deleteUSMSTemplate(param, new UcloudHandler<DeleteUSMSTemplateResult>() {
            @Override
            public Object success(DeleteUSMSTemplateResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(DeleteUSMSTemplateResult result) {
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