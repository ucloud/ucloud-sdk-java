package cn.ucloud.usms.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.usms.model.UpdateUSMSSignatureParam;
import cn.ucloud.usms.model.UpdateUSMSSignatureResult;
import cn.ucloud.usms.pojo.USMSConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: codezhang
 * @date: 2019/12/13 9:30 下午
 * @describe:
 **/
public class UpdateUSMSSignatureTest {

    private USMSClient client;

    private UpdateUSMSSignatureParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultUSMSClient(new USMSConfig(
                new Account(System.getenv("UCloudPrivateKey"),
                        System.getenv("UCloudPublicKey"))));
        param = new UpdateUSMSSignatureParam(
                System.getenv("UnPassUSMSSigId"),
                "sdk-java-test-不要通过审核",
                0,
                0,
                System.getenv("USMSFilePath"));
    }

    @Test
    public void updateUSMSSignature() {
        try {
            UpdateUSMSSignatureResult result = client.updateUSMSSignature(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

    @Test
    public void testUpdateUSMSSignature() {
        client.updateUSMSSignature(param, new UcloudHandler<UpdateUSMSSignatureResult>() {
            @Override
            public Object success(UpdateUSMSSignatureResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(UpdateUSMSSignatureResult result) {
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