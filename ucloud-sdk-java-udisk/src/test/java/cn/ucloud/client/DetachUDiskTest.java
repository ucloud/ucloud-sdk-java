package cn.ucloud.client;

import cn.ucloud.handler.UcloudHandler;
import cn.ucloud.model.AttachUDiskParam;
import cn.ucloud.model.DetachUDiskResult;
import cn.ucloud.model.DetachUDiskParam;
import cn.ucloud.model.DetachUDiskResult;
import cn.ucloud.pojo.Account;
import cn.ucloud.pojo.UdiskConfig;
import org.junit.Before;
import org.junit.Test;

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
            System.out.println("同步：" + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void detachUDiskCallback() {
        client.detachUDisk(param, new UcloudHandler<DetachUDiskResult>() {
            @Override
            public Object success(DetachUDiskResult result) {
                System.out.println("异步 success：" + result);
                return null;
            }

            @Override
            public Object failed(DetachUDiskResult result) {
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
