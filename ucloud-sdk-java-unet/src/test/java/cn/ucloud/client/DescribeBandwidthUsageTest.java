package cn.ucloud.client;

import cn.ucloud.model.DescribeBandwidthUsageParam;
import cn.ucloud.model.DescribeBandwidthUsageResult;
import cn.ucloud.pojo.Account;
import cn.ucloud.pojo.UnetConfig;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2018/9/27 16:48
 */
public class DescribeBandwidthUsageTest {
    private UnetClient client;

    private DescribeBandwidthUsageParam param;

    @Before
    public void initData() {
        client = new DefaultUnetClient(new UnetConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));

        List<String> eipIds = new ArrayList<>();
        eipIds.add("eip-192.168.1.1");
        eipIds.add("eip-192.168.1.2");
        param = new DescribeBandwidthUsageParam("cn-sh2");
        param.setEipIds(eipIds);
        param.setProjectId("org-4nfe1i");
    }

    @Test
    public void describeBandwidthUsage() {
        try {
            DescribeBandwidthUsageResult allocateEIPResult = client.describeBandwidthUsage(param);
            System.out.println(allocateEIPResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
