package cn.ucloud.udisk.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.udisk.client.DefaultUdiskClient;
import cn.ucloud.udisk.client.UdiskClient;
import cn.ucloud.udisk.model.AttachUDiskParam;
import cn.ucloud.udisk.model.AttachUDiskResult;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.udisk.pojo.UdiskConfig;
import org.junit.Before;
import org.junit.Test;

/**
 * @description: 挂载云硬盘
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2018/9/26 09:58
 */
public class AttachUDiskTest {
    private UdiskClient client;

    private AttachUDiskParam param;

    @Before
    public void initData() {
        client = new DefaultUdiskClient(new UdiskConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        param = new AttachUDiskParam("cn-sh2", "cn-sh2-01", "uhost-gddou3","bs-4qfrwv");
        param.setProjectId("org-4nfe1i");
    }

    @Test
    public void attachUDisk() {
        try {
            AttachUDiskResult result = client.attachUDisk(param);
            System.out.println("同步：" + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void attachUDiskCallback() {
        client.attachUDiskCallback(param, new UcloudHandler<AttachUDiskResult>() {
            @Override
            public Object success(AttachUDiskResult result) {
                System.out.println("异步 success：" + result);
                return null;
            }

            @Override
            public Object failed(AttachUDiskResult result) {
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
