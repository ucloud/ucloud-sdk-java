package cn.ucloud.client;

import cn.ucloud.model.UpdateULBAttributeParam;
import cn.ucloud.model.UpdateULBAttributeResult;
import cn.ucloud.pojo.Account;
import cn.ucloud.pojo.ULBConfig;
import org.junit.Before;
import org.junit.Test;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-19 11:45
 **/
public class UpdateULBAttributeTest {

    private ULBClient client;

    private UpdateULBAttributeParam param;

    @Before
    public void initData() {
        client = new DefaultULBClient(new ULBConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"),
                        System.getenv("UcloudPassword"))));
        param = new UpdateULBAttributeParam("cn-bj2","ulb-0kawkr");
        param.setName("codezhang-ulb");
        param.setProjectId("org-4nfe1i");
    }

    @Test
    public void updateULBAttribute() {
        try {
            UpdateULBAttributeResult updateULBAttributeResult = client.updateULBAttribute(param);
            System.out.println(updateULBAttributeResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}