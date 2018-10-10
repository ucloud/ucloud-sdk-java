package cn.ucloud.uhost.client;


import cn.ucloud.uhost.model.CreateCustomImageParam;
import cn.ucloud.uhost.model.CreateCustomImageResult;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.uhost.pojo.UhostConfig;
import org.junit.Before;
import org.junit.Test;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-18 18:32
 **/
public class CreateCustomImageTest {

    private UhostClient client;

    private CreateCustomImageParam param;

    @Before
    public void initData() {
        client = new DefaultUhostClient(new UhostConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        param = new CreateCustomImageParam("cn-bj2","uhost-zzsffd","java-sdk-test");
        param.setProjectId("org-4nfe1i");
    }

    @Test
    public void createCustomImage() {
        try {
            CreateCustomImageResult customImage = client.createCustomImage(param);
            System.out.println(customImage);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}