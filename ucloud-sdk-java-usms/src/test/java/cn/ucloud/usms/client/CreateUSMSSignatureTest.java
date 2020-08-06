package cn.ucloud.usms.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.usms.model.CreateUSMSSignatureParam;
import cn.ucloud.usms.model.CreateUSMSSignatureResult;
import cn.ucloud.usms.pojo.USMSConfig;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;

/**
 * @author: codezhang
 * @date: 2019/12/13 6:41 下午
 * @describe:
 **/
public class CreateUSMSSignatureTest {

    private USMSClient client;

    private CreateUSMSSignatureParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultUSMSClient(new USMSConfig(
                new Account(System.getenv("UCloudPrivateKey"),
                        System.getenv("UCloudPublicKey"))));
        param = new CreateUSMSSignatureParam("sdk-java-test-不要通过审核",
                0,
                0,
                0,
                "嘻嘻哈哈",
                System.getenv("USMSFilePath"));
    }


    @Test
    public void createUSMSSignature() {
        try {
            CreateUSMSSignatureResult result = client.createUSMSSignature(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            e.printStackTrace();
            assertNull(e);
        }
    }

    @Test
    public void createUSMSSignatureCallback() {
        client.createUSMSSignature(param, new UcloudHandler<CreateUSMSSignatureResult>() {
            @Override
            public Object success(CreateUSMSSignatureResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(CreateUSMSSignatureResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object error(Exception e) {
                e.printStackTrace();
                return null;
            }
        });
    }
}
