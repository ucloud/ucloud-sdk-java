package cn.ucloud.usms.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.usms.model.CreateUSMSSignatureParam;
import cn.ucloud.usms.model.QueryUSMSTemplateParam;
import cn.ucloud.usms.model.QueryUSMSTemplateResult;
import cn.ucloud.usms.pojo.USMSConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: codezhang
 * @date: 2019/12/13 10:59 下午
 * @describe:
 **/
public class QueryUSMSTemplateTest {

    private USMSClient client;

    private QueryUSMSTemplateParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultUSMSClient(new USMSConfig(
                new Account(System.getenv("UCloudPrivateKey"),
                        System.getenv("UCloudPublicKey"))));
        param = new QueryUSMSTemplateParam(System.getenv("USMSTemplateId"));
    }

    @Test
    public void queryUSMSTemplate() {
        try {
            QueryUSMSTemplateResult result = client.queryUSMSTemplate(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

    @Test
    public void queryUSMSTemplateCallback() {
        client.queryUSMSTemplate(param, new UcloudHandler<QueryUSMSTemplateResult>() {
            @Override
            public Object success(QueryUSMSTemplateResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(QueryUSMSTemplateResult result) {
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