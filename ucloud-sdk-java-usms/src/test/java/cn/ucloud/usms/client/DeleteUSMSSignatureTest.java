package cn.ucloud.usms.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.usms.model.DeleteUSMSSignatureParam;
import cn.ucloud.usms.model.DeleteUSMSSignatureResult;
import cn.ucloud.usms.pojo.USMSConfig;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author: codezhang
 * @date: 2019/12/13 9:26 下午
 * @describe:
 **/
public class DeleteUSMSSignatureTest {

    private USMSClient client;

    private DeleteUSMSSignatureParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultUSMSClient(new USMSConfig(
                new Account(System.getenv("UCloudPrivateKey"),
                        System.getenv("UCloudPublicKey"))));
        List<String> sigIds = new ArrayList<>();
        sigIds.add("SIG20191213AC45EB");
        param = new DeleteUSMSSignatureParam(sigIds);
    }

    @Test
    public void deleteUSMSSignature() {
        try {
            DeleteUSMSSignatureResult result = client.deleteUSMSSignature(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

    @Test
    public void deleteUSMSSignatureCallback() {
        client.deleteUSMSSignature(param, new UcloudHandler<DeleteUSMSSignatureResult>() {
            @Override
            public Object success(DeleteUSMSSignatureResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(DeleteUSMSSignatureResult result) {
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