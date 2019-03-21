package cn.ucloud.udisk.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.udisk.model.RenameUDiskParam;
import cn.ucloud.udisk.model.RenameUDiskResult;
import cn.ucloud.udisk.pojo.UdiskConfig;
import org.junit.*;

import static org.junit.Assert.assertNull;

/**
 * @description:
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2018/9/26 15:06
 */
public class RenameUDiskTest {

    private UdiskClient client;

    private RenameUDiskParam param;

    @Before
    public void initData() {
        client = new DefaultUdiskClient(new UdiskConfig(
                new Account(System.getenv("UCloudPrivateKey"),
                        System.getenv("UCloudPublicKey"))));
        param = new RenameUDiskParam("cn-sh2", "cn-sh2-02", "bs-yroe5bmn",
                "rename-sdk-java");
        param.setProjectId("org-izug1m");
    }

    @Test
    public void renameUDisk() {
        try {
            RenameUDiskResult result = client.renameUDisk(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    @Ignore
    public void renameUDiskCallback() {
        client.renameUDisk(param, new UcloudHandler<RenameUDiskResult>() {
            @Override
            public Object success(RenameUDiskResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(RenameUDiskResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object error(Exception e) {
                assertNull(e);
                return null;
            }
        },false);
    }
}
