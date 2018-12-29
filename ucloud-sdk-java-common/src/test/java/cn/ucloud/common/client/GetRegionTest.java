package cn.ucloud.common.client;

import cn.ucloud.common.model.GetRegionResult;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.common.pojo.UcloudConfig;
import org.junit.Before;
import org.junit.Test;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-11-13 14:06
 **/
public class GetRegionTest {
    private UcloudClient client;


    @Before
    public void initData() {
        client = new DefaultUcloudClient(new UcloudConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
    }

    @Test
    public void getRegion() {
        try {
            GetRegionResult region = client.getRegion();
            System.out.println(region);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}