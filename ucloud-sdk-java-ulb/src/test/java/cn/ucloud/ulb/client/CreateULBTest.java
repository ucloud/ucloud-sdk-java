package cn.ucloud.ulb.client;

import cn.ucloud.ulb.client.DefaultULBClient;
import cn.ucloud.ulb.client.ULBClient;
import cn.ucloud.ulb.model.CreateULBParam;
import cn.ucloud.ulb.model.CreateULBResult;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.ulb.pojo.ULBConfig;
import org.junit.Before;
import org.junit.Test;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-19 09:57
 **/
public class CreateULBTest {

    private ULBClient client;

    private CreateULBParam param;

    @Before
    public void initData() {
        client = new DefaultULBClient(new ULBConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        param = new CreateULBParam("cn-bj2");
        param.setProjectId("org-4nfe1i");
        param.setTag("sdk-java-test");
    }


    @Test
    public void createULB() {
        try {
            CreateULBResult ulb = client.createULB(param);
            System.out.println(ulb);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}