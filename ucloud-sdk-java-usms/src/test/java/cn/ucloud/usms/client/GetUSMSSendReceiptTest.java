package cn.ucloud.usms.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.usms.model.GetUSMSSendReceiptParam;
import cn.ucloud.usms.model.GetUSMSSendReceiptResult;
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
 * @Date : 2019-06-04 17:58
 **/
public class GetUSMSSendReceiptTest {
    private USMSClient client;

    private GetUSMSSendReceiptParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultUSMSClient(new USMSConfig(
                new Account(System.getenv("UCloudPrivateKey"),
                        System.getenv("UCloudPublicKey"))));
        List<String> sessionNos = new ArrayList<>();
        sessionNos.add("2a9053cf-17e9-462d-8810-29f97684ad4e");
        param = new GetUSMSSendReceiptParam(sessionNos);
        param.setProjectId("org-o1ftjk");
    }


    @Test
    public void getUSMSSendReceipt() {
        try {
            GetUSMSSendReceiptResult result = client.getUSMSSendReceipt(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            e.printStackTrace();
            assertNull(e);
        }
    }
}