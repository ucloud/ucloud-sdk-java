package cn.ucloud.udisk.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.udisk.model.CreateUDiskSnapshotParam;
import cn.ucloud.udisk.model.CreateUDiskSnapshotResult;
import cn.ucloud.udisk.pojo.UdiskConfig;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

/**
 * @description:
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2018/9/26 16:06
 */
public class CreateUDiskSnapshotTest {
    private UdiskClient client;

    private CreateUDiskSnapshotParam param;

    @Before
    public void initData() {
        client = new DefaultUdiskClient(new UdiskConfig(
                new Account(System.getenv("UCloudPrivateKey"),
                        System.getenv("UCloudPublicKey"))));
        param = new CreateUDiskSnapshotParam("cn-sh2", "cn-sh2-01", "bs-4qfrwv","snapshot-bs-4qfrwv");
        param.setQuantity(2);
        param.setProjectId("org-4nfe1i");
    }

    @Test
    public void createUDiskSnapshot() {
        try {
            CreateUDiskSnapshotResult result = client.createUDiskSnapshot(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Ignore
    @Test
    public void createUDiskSnapshotCallback() {
        client.createUDiskSnapshot(param, new UcloudHandler<CreateUDiskSnapshotResult>() {
            @Override
            public Object success(CreateUDiskSnapshotResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(CreateUDiskSnapshotResult result) {
                JSONComparator.jsonComparator(result);
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
