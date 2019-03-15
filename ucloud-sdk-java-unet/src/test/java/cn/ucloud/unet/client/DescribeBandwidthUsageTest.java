package cn.ucloud.unet.client;

import cn.ucloud.unet.model.DescribeBandwidthUsageParam;
import cn.ucloud.unet.model.DescribeBandwidthUsageResult;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.unet.pojo.UnetConfig;
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
        eipIds.add("eip-vcsnbgi4");
        param = new DescribeBandwidthUsageParam("cn-sh2");
        param.setEipIds(eipIds);
    }

    @Test
    public void describeBandwidthUsage() {
        try {
            DescribeBandwidthUsageResult allocateEIPResult = client.describeBandwidthUsage(param);
            JSONComparator.jsonComparator(allocateEIPResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
