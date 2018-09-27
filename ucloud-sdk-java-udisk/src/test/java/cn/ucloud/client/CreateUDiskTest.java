package cn.ucloud.client;

import cn.ucloud.handler.UcloudHandler;
import cn.ucloud.model.AttachUDiskParam;
import cn.ucloud.model.AttachUDiskResult;
import cn.ucloud.model.CreateUDiskParam;
import cn.ucloud.model.CreateUDiskResult;
import cn.ucloud.pojo.Account;
import cn.ucloud.pojo.UdiskConfig;
import org.junit.Before;
import org.junit.Test;

/**
 * @description:
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2018/9/26 13:53
 */
public class CreateUDiskTest {
    private UdiskClient client;

    private CreateUDiskParam param;

    @Before
    public void initData() {
        client = new DefaultUdiskClient(new UdiskConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        param = new CreateUDiskParam("cn-sh2", "cn-sh2-01", 16, "udisk-test");
        param.setProjectId("org-4nfe1i");
    }

    @Test
    public void createUDisk() {
        try {
            CreateUDiskResult result = client.createUDisk(param);
            System.out.println("同步：" + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void createUDiskCallback() {
        client.createUDisk(param, new UcloudHandler<CreateUDiskResult>() {
            @Override
            public Object success(CreateUDiskResult result) {
                System.out.println("异步 success：" + result);
                return null;
            }

            @Override
            public Object failed(CreateUDiskResult result) {
                System.out.println("异步 failed：" + result);
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
