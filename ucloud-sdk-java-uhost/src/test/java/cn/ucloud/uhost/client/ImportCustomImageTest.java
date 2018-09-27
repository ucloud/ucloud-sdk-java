package cn.ucloud.uhost.client;

import cn.ucloud.uhost.client.DefaultUhostClient;
import cn.ucloud.uhost.client.UhostClient;
import cn.ucloud.uhost.model.ImportCustomImageParam;
import cn.ucloud.uhost.model.ImportCustomImageResult;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.uhost.pojo.UhostConfig;
import org.junit.Before;
import org.junit.Test;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-18 15:44
 **/
public class ImportCustomImageTest {

    private UhostClient client;

    private ImportCustomImageParam param;

    @Before
    public void initData() {
        client = new DefaultUhostClient(new UhostConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        param = new ImportCustomImageParam("cn-bj2","java-sdk-import-test","",
                "","","",true);
        param.setProjectId("org-4nfe1i");
    }

    @Test
    public void importCustomImage() {
        // todo 测试
        try {
            ImportCustomImageResult importCustomImageResult = client.importCustomImage(param);
            System.out.println(importCustomImageResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}