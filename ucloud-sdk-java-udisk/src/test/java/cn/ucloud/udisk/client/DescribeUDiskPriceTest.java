package cn.ucloud.udisk.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.udisk.client.DefaultUdiskClient;
import cn.ucloud.udisk.client.UdiskClient;
import cn.ucloud.udisk.model.DescribeUDiskPriceParam;
import cn.ucloud.udisk.model.DescribeUDiskPriceResult;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.common.pojo.BaseResponseResult;
import cn.ucloud.udisk.pojo.UdiskConfig;
import org.junit.Before;
import org.junit.Test;

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
    public void getDescribeUDiskPrice() {
        try {
            DescribeUDiskPriceResult result = client.getDescribeUDiskPrice(param);
            System.out.println("同步：" + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void getDescribeUDiskPriceCallback() {
       client.getDescribeUDiskPriceCallback(param, new UcloudHandler() {
            @Override
            public Object success(BaseResponseResult result) {
                System.out.println("异步 success：" + result);
                return null;
            }

            @Override
            public Object failed(BaseResponseResult result) {
                System.out.println("异步 failed：" + result);
                return null;
            }

            @Override
            public Object error(Exception e) {
                System.out.println("异步 error：" + e);
                return null;
            }
        });

    }
}
