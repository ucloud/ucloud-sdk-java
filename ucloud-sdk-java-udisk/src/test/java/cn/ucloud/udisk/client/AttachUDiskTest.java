package cn.ucloud.udisk.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.udisk.model.AttachUDiskParam;
import cn.ucloud.udisk.model.AttachUDiskResult;
import cn.ucloud.udisk.pojo.UdiskConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;

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
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

    @Test
    public void attachUDiskCallback() {
        client.attachUDisk(param, new UcloudHandler<AttachUDiskResult>() {
            @Override
            public Object success(AttachUDiskResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(AttachUDiskResult result) {
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
