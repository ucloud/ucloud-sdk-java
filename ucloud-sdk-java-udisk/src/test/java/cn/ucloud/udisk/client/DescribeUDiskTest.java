package cn.ucloud.udisk.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.udisk.model.DescribeUDiskParam;
import cn.ucloud.udisk.model.DescribeUDiskResult;
import cn.ucloud.udisk.pojo.UdiskConfig;
import org.junit.Before;
import org.junit.Test;

/**
 * @description:
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2018/9/26 17:08
 */
public class DescribeUDiskTest {
    private UdiskClient client;

    private DescribeUDiskParam param;

    @Before
    public void initData() {
        client = new DefaultUdiskClient(new UdiskConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        param = new DescribeUDiskParam("cn-sh2");
        param.setProjectId("org-4nfe1i");
    }

    @Test
    public void doTest() {
        try {
            DescribeUDiskResult result = client.describeUDisk(param);
            System.out.println("同步：" + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void doTestCallback() {
        client.describeUDisk(param, new UcloudHandler<DescribeUDiskResult>() {
            @Override
            public Object success(DescribeUDiskResult result) {
                System.out.println("异步 success：" + result);
                return null;
            }

            @Override
            public Object failed(DescribeUDiskResult result) {
                System.out.println("异步 failed：" + result);
                return null;
            }

            @Override
            public Object error(Exception e) {
                System.out.println("异步 error：" + e);
                return null;
            }
        }, false);
    }
}
