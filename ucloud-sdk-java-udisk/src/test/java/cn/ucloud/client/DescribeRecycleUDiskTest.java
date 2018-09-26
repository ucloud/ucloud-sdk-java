package cn.ucloud.client;

import cn.ucloud.handler.UcloudHandler;
import cn.ucloud.model.DescribeRecycleUDiskParam;
import cn.ucloud.model.DescribeRecycleUDiskResult;
import cn.ucloud.pojo.Account;
import cn.ucloud.pojo.UdiskConfig;
import org.junit.Before;
import org.junit.Test;

/**
 * @description:
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2018/9/26 16:52
 */
public class DescribeRecycleUDiskTest {
    private UdiskClient client;

    private DescribeRecycleUDiskParam param;

    @Before
    public void initData() {
        client = new DefaultUdiskClient(new UdiskConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        param = new DescribeRecycleUDiskParam("cn-sh2", "cn-sh2-01");
        param.setProjectId("org-4nfe1i");
    }

    @Test
    public void doTest() {
        try {
            DescribeRecycleUDiskResult result = client.getDescribeRecycleUDisk(param);
            System.out.println("同步：" + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void doTestCallback() {
        client.getDescribeRecycleUDisk(param, new UcloudHandler<DescribeRecycleUDiskResult>() {
            @Override
            public Object success(DescribeRecycleUDiskResult result) {
                System.out.println("异步 success：" + result);
                return null;
            }

            @Override
            public Object failed(DescribeRecycleUDiskResult result) {
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
