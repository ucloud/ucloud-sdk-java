package cn.ucloud.unet.client;

import cn.ucloud.unet.model.UpdateEIPAttributeParam;
import cn.ucloud.unet.model.UpdateEIPAttributeResult;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.unet.pojo.UnetConfig;
import org.junit.Before;
import org.junit.Test;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-27 11:09
 **/
public class UpdateEIPAttributeTest {

    private UnetClient client;

    private UpdateEIPAttributeParam param;

    @Before
    public void initData() {
        client = new DefaultUnetClient(new UnetConfig(
                new Account(System.getenv("UCloudPrivateKey"),
                        System.getenv("UCloudPublicKey"))));
        param = new UpdateEIPAttributeParam("cn-sh2", "eip-vcsnbgi4");
        param.setName("sdk-java-test");
        param.setRemark("改名字");
        param.setTag("ucloud-sdk-java-test");
    }

    @Test
    public void updateEIPAttribute() {
        try {
            UpdateEIPAttributeResult updateEIPAttributeResult = client.updateEIPAttribute(param);
            JSONComparator.jsonComparator(updateEIPAttributeResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}