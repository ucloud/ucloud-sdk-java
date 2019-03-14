package cn.ucloud.udisk.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.udisk.model.DescribeUDiskPriceParam;
import cn.ucloud.udisk.model.DescribeUDiskPriceResult;
import cn.ucloud.udisk.pojo.UdiskConfig;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertNull;

/**
 * @description:
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2018/9/18 10:44
 */
public class DescribeUDiskPriceTest {
    private UdiskClient client;

    private DescribeUDiskPriceParam param;

    @Before
    public void initData() {
        client = new DefaultUdiskClient(new UdiskConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        param = new DescribeUDiskPriceParam("cn-sh2", "cn-sh2-01", 16);
        param.setProjectId("org-4nfe1i");
    }

    @Test
    public void describeUDiskPrice() {
        try {
            DescribeUDiskPriceResult result = client.describeUDiskPrice(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Ignore
    @Test
    public void describeUDiskPriceCallback() {
       client.describeUDiskPrice(param, new UcloudHandler<DescribeUDiskPriceResult>() {
            @Override
            public Object success(DescribeUDiskPriceResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(DescribeUDiskPriceResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object error(Exception e) {
                assertNull(e);
                return null;
            }
        });

    }
}
