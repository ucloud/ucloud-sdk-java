package cn.ucloud.udisk.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.udisk.model.DetachUDiskParam;
import cn.ucloud.udisk.model.DetachUDiskResult;
import cn.ucloud.udisk.pojo.UdiskConfig;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertNull;

/**
 * @description:
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2018/9/26 14:36
 */
public class DetachUDiskTest {
    private UdiskClient client;

    private DetachUDiskParam param;

    @Before
    public void initData() {
        client = new DefaultUdiskClient(new UdiskConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        param = new DetachUDiskParam("cn-sh2", "cn-sh2-01", "uhost-gddou3","bs-0pikhv");
        param.setProjectId("org-4nfe1i");
    }

    @Test
    public void detachUDisk() {
        try {
            DetachUDiskResult result = client.detachUDisk(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Ignore
    @Test
    public void detachUDiskCallback() {
        client.detachUDisk(param, new UcloudHandler<DetachUDiskResult>() {
            @Override
            public Object success(DetachUDiskResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(DetachUDiskResult result) {
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
