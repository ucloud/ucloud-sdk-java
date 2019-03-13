package cn.ucloud.udisk.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.udisk.model.CreateUDiskParam;
import cn.ucloud.udisk.model.CreateUDiskResult;
import cn.ucloud.udisk.pojo.UdiskConfig;
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
        param = new CreateUDiskParam("cn-sh2", "cn-sh2-02", 16, "udisk-test");
        param.setProjectId("org-izug1m");
    }

    @Test
    public void createUDisk() {
        try {
            CreateUDiskResult result = client.createUDisk(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void createUDiskCallback() {
        client.createUDisk(param, new UcloudHandler<CreateUDiskResult>() {
            @Override
            public Object success(CreateUDiskResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(CreateUDiskResult result) {
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
