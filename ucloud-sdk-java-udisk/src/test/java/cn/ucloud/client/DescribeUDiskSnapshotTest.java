package cn.ucloud.client;

import cn.ucloud.handler.UcloudHandler;
import cn.ucloud.model.DescribeUDiskSnapshotParam;
import cn.ucloud.model.DescribeUDiskSnapshotResult;
import cn.ucloud.pojo.Account;
import cn.ucloud.pojo.UdiskConfig;
import org.junit.Before;
import org.junit.Test;

/**
 * @description:
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2018/9/26 17:12
 */
public class DescribeUDiskSnapshotTest {
    private UdiskClient client;

    private DescribeUDiskSnapshotParam param;

    @Before
    public void initData() {
        client = new DefaultUdiskClient(new UdiskConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        param = new DescribeUDiskSnapshotParam("cn-sh2");
        param.setProjectId("org-4nfe1i");
    }

    @Test
    public void doTest() {
        try {
            DescribeUDiskSnapshotResult result = client.getDescribeUDiskSnapshot(param);
            System.out.println("同步：" + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void doTestCallback() {
        client.getDescribeUDiskSnapshot(param, new UcloudHandler<DescribeUDiskSnapshotResult>() {
            @Override
            public Object success(DescribeUDiskSnapshotResult result) {
                System.out.println("异步 success：" + result);
                return null;
            }

            @Override
            public Object failed(DescribeUDiskSnapshotResult result) {
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
