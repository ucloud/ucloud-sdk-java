package cn.ucloud.common.client;

import cn.ucloud.common.model.GetRegionParam;
import cn.ucloud.common.model.GetRegionResult;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.common.pojo.UcloudConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-11-13 14:06
 **/
public class GetRegionTest {
    private UcloudClient client;

    private GetRegionParam param;

    @Before
    public void initData() {
        client = new DefaultUcloudClient(new UcloudConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        param = new GetRegionParam();
    }

    @Test
    public void getRegion() {
        try {
            GetRegionResult region = client.getRegion(param);
            System.out.println(region);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}