package cn.ucloud.udisk.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.udisk.model.DescribeUDiskSnapshotParam;
import cn.ucloud.udisk.model.DescribeUDiskSnapshotResult;
import cn.ucloud.udisk.pojo.UdiskConfig;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertNull;

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
    public void describeUDiskSnapshot() {
        try {
            DescribeUDiskSnapshotResult result = client.describeUDiskSnapshot(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Ignore
    @Test
    public void describeUDiskSnapshotCallback() {
        client.describeUDiskSnapshot(param, new UcloudHandler<DescribeUDiskSnapshotResult>() {
            @Override
            public Object success(DescribeUDiskSnapshotResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(DescribeUDiskSnapshotResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object error(Exception e) {
                assertNull(e);
                return null;
            }
        }, false);
    }
}
