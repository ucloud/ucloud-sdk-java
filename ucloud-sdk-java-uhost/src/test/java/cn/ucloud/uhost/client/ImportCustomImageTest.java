package cn.ucloud.uhost.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.uhost.model.ImportCustomImageParam;
import cn.ucloud.uhost.model.ImportCustomImageResult;
import cn.ucloud.uhost.pojo.UhostConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;

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
        param = new ImportCustomImageParam("cn-bj2","java-sdk-import-test","ufile-url",
                "Other","Other","qcow2",true);
        param.setProjectId("org-4nfe1i");
    }

    @Test
    public void importCustomImage() {
        try {
            ImportCustomImageResult result = client.importCustomImage(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }
}