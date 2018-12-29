package cn.ucloud.common.client;

import cn.ucloud.common.model.GetProjectListResult;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.common.pojo.UcloudConfig;
import org.junit.Before;
import org.junit.Test;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-11-13 15:29
 **/
public class GetProjectListTest {

    private UcloudClient client;
    @Before
    public void initData() {
        client = new DefaultUcloudClient(new UcloudConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
    }

    @Test
    public void getProductList() {
        try {
            GetProjectListResult productList = client.getProductList();
            System.out.println(productList);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}