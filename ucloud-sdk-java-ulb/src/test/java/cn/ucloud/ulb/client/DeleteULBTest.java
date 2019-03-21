package cn.ucloud.ulb.client;

import cn.ucloud.ulb.client.DefaultULBClient;
import cn.ucloud.ulb.client.ULBClient;
import cn.ucloud.ulb.model.DeleteULBParam;
import cn.ucloud.ulb.model.DeleteULBResult;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.ulb.pojo.ULBConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;

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
                new Account(System.getenv("UCloudPrivateKey"),
                        System.getenv("UCloudPublicKey"))));
        param = new DeleteULBParam("cn-bj2","ulb-lzpob3");
        param.setProjectId("org-4nfe1i");
    }


    @Test
    public void deleteULB() {
        try {
            DeleteULBResult result = client.deleteULB(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }
}