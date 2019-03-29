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
                new Account(System.getenv("UCloudPrivateKey"),
                        System.getenv("UCloudPublicKey"))));
        param = new DetachUDiskParam("cn-sh2", "cn-sh2-02",
                "uhost-hx3g2lln","bs-afaiqyut");
        param.setProjectId("org-o1ftjk");
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
