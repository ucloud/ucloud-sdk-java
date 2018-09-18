package cn.ucloud.client;

import cn.ucloud.handler.UcloudHandler;
import cn.ucloud.model.DescribeUDiskPriceParam;
import cn.ucloud.model.DescribeUDiskPriceResult;
import cn.ucloud.pojo.Account;
import cn.ucloud.pojo.BaseResponseResult;
import cn.ucloud.pojo.UdiskConfig;
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
                        System.getenv("UcloudPublicKey"),
                        System.getenv("UcloudPassword"))));
        param = new DescribeUDiskPriceParam("cn-bj2", "cn-bj2-02", 64);
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
