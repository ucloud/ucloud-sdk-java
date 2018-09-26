package cn.ucloud.client;

import cn.ucloud.handler.UcloudHandler;
import cn.ucloud.model.RenameUDiskParam;
import cn.ucloud.model.RenameUDiskResult;
import cn.ucloud.pojo.Account;
import cn.ucloud.pojo.UdiskConfig;
import org.junit.Before;
import org.junit.Test;

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
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        param = new RenameUDiskParam("cn-sh2", "cn-sh2-01", "bs-c1ohsh","udisk-standby-1");
        param.setProjectId("org-4nfe1i");
    }

    @Test
    public void renameUDisk() {
        try {
            RenameUDiskResult result = client.renameUDisk(param);
            System.out.println("同步：" + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void renameUDiskCallback() {
        client.renameUDisk(param, new UcloudHandler<RenameUDiskResult>() {
            @Override
            public Object success(RenameUDiskResult result) {
                System.out.println("异步 success：" + result);
                return null;
            }

            @Override
            public Object failed(RenameUDiskResult result) {
                System.out.println("异步 failed：" + result);
                return null;
            }

            @Override
            public Object error(Exception e) {
                System.out.println("异步 error：" + e);
                return null;
            }
        },false);
    }
}
