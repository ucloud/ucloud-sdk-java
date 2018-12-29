package cn.ucloud.uhost.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.uhost.model.TerminateCustomImageParam;
import cn.ucloud.uhost.model.TerminateCustomImageResult;
import cn.ucloud.uhost.pojo.UhostConfig;
import org.junit.Before;
import org.junit.Test;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-18 16:58
 **/
public class TerminateCustomImageTest {

    private UhostClient client;

    private TerminateCustomImageParam param;

    @Before
    public void initData() {
        client = new DefaultUhostClient(new UhostConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        param = new TerminateCustomImageParam("cn-bj2","uimage-tjbrnz");
        param.setProjectId("org-4nfe1i");
    }

    @Test
    public void terminateCustomImage() {
        try {
            TerminateCustomImageResult terminateCustomImageResult = client.terminateCustomImage(param);
            System.out.println(terminateCustomImageResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}