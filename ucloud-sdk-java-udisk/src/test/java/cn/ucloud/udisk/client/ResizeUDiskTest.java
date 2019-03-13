package cn.ucloud.udisk.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.udisk.model.ResizeUDiskParam;
import cn.ucloud.udisk.model.ResizeUDiskResult;
import cn.ucloud.udisk.pojo.UdiskConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;

/**
 * @description:
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2018/9/26 17:40
 */
public class ResizeUDiskTest {
    private UdiskClient client;

    private ResizeUDiskParam param;

    @Before
    public void initData() {
        client = new DefaultUdiskClient(new UdiskConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        param = new ResizeUDiskParam("cn-sh2","cn-sh2-01","bs-4qfrwv",8);
        param.setProjectId("org-4nfe1i");
    }

    @Test
    public void resizeUDisk() {
        try {
            ResizeUDiskResult result = client.resizeUDisk(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void resizeUDiskCallback() {
        client.resizeUDisk(param, new UcloudHandler<ResizeUDiskResult>() {
            @Override
            public Object success(ResizeUDiskResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(ResizeUDiskResult result) {
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
