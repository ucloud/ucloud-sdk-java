package cn.ucloud.client;

import cn.ucloud.model.DeleteULBParam;
import cn.ucloud.model.DeleteULBResult;
import cn.ucloud.pojo.Account;
import cn.ucloud.pojo.ULBConfig;
import org.junit.Before;
import org.junit.Test;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-19 11:34
 **/
public class DeleteULBTest {

    private ULBClient client;

    private DeleteULBParam param;

    @Before
    public void initData() {
        client = new DefaultULBClient(new ULBConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        param = new DeleteULBParam("cn-bj2","ulb-lzpob3");
        param.setProjectId("org-4nfe1i");
    }


    @Test
    public void deleteULB() {
        try {
            DeleteULBResult deleteULBResult = client.deleteULB(param);
            System.out.println(deleteULBResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}