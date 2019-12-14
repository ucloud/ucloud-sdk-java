package cn.ucloud.usms.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.usms.model.CreateUSMSSignatureParam;
import cn.ucloud.usms.model.CreateUSMSSignatureResult;
import cn.ucloud.usms.model.QueryUSMSSignatureParam;
import cn.ucloud.usms.model.QueryUSMSSignatureResult;
import cn.ucloud.usms.pojo.USMSConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: codezhang
 * @date: 2019/12/13 9:19 下午
 * @describe:
 **/
public class QueryUSMSSignatureTest {

    private USMSClient client;

    private QueryUSMSSignatureParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultUSMSClient(new USMSConfig(
                new Account(System.getenv("UCloudPrivateKey"),
                        System.getenv("UCloudPublicKey"))));
        param = new QueryUSMSSignatureParam();
        param.setSigId(System.getenv("USMSSigId"));
    }

    @Test
    public void queryUSMSSignature() {
        try {
            QueryUSMSSignatureResult result = client.queryUSMSSignature(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            e.printStackTrace();
            assertNull(e);
        }
    }

    @Test
    public void queryUSMSSignatureCallback() {
        client.queryUSMSSignature(param, new UcloudHandler<QueryUSMSSignatureResult>() {
            @Override
            public Object success(QueryUSMSSignatureResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(QueryUSMSSignatureResult result) {
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