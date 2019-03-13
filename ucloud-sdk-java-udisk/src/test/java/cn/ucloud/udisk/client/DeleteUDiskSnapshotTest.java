package cn.ucloud.udisk.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.udisk.model.DeleteUDiskSnapshotParam;
import cn.ucloud.udisk.model.DeleteUDiskSnapshotResult;
import cn.ucloud.udisk.pojo.UdiskConfig;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

/**
 * @description:
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2018/9/26 16:42
 */
public class DeleteUDiskSnapshotTest {
    private UdiskClient client;

    private DeleteUDiskSnapshotParam param;

    @Before
    public void initData() {
        client = new DefaultUdiskClient(new UdiskConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        param = new DeleteUDiskSnapshotParam("cn-sh2", "cn-sh2-01", "bsSnap-c4kkvk");
        param.setProjectId("org-4nfe1i");
    }

    @Test
    public void deleteUDiskSnapshot() {
        try {
            DeleteUDiskSnapshotResult result = client.deleteUDiskSnapshot(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Ignore
    @Test
    public void deleteUDiskSnapshotCallback() {
        client.deleteUDiskSnapshot(param, new UcloudHandler<DeleteUDiskSnapshotResult>() {
            @Override
            public Object success(DeleteUDiskSnapshotResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(DeleteUDiskSnapshotResult result) {
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
