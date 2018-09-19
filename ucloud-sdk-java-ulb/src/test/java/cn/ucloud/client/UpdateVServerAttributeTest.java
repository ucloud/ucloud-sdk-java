package cn.ucloud.client;

import cn.ucloud.model.UpdateVServerAttributeParam;
import cn.ucloud.model.UpdateVServerAttributeResult;
import cn.ucloud.pojo.Account;
import cn.ucloud.pojo.ULBConfig;
import org.junit.Before;
import org.junit.Test;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-19 14:46
 **/
public class UpdateVServerAttributeTest {


    private ULBClient client;

    private UpdateVServerAttributeParam param;

    @Before
    public void initData() {
        client = new DefaultULBClient(new ULBConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"),
                        System.getenv("UcloudPassword"))));
        param = new UpdateVServerAttributeParam("cn-bj2","ulb-0kawkr","vserver-se0ay2");
        param.setProjectId("org-4nfe1i");
        param.setVserverName("jjj");
    }


    @Test
    public void updateVServerAttribute() {
        try {
            UpdateVServerAttributeResult updateVServerAttributeResult = client.updateVServerAttribute(param);
            System.out.println(updateVServerAttributeResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}