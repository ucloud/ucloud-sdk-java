package cn.ucloud.uhost.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.uhost.model.CopyCustomImageParam;
import cn.ucloud.uhost.model.CopyCustomImageResult;
import cn.ucloud.uhost.pojo.UhostConfig;
import org.junit.Before;
import org.junit.Test;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-10-09 19:54
 **/
public class CopyCustomImageTest {

    private UhostClient client;

    private CopyCustomImageParam param;

    @Before
    public void initData() {
        client = new DefaultUhostClient(new UhostConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        param = new CopyCustomImageParam("cn-bj2","uimage-4h2rc2","org-4nfe1i");
        param.setProjectId("org-4nfe1i");
    }

    @Test
    public void copyCustomImage() {
        try {
            CopyCustomImageResult copyCustomImageResult = client.copyCustomImage(param);
            System.out.println(copyCustomImageResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}