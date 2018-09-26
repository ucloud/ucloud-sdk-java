package cn.ucloud.client;

import cn.ucloud.handler.UcloudHandler;
import cn.ucloud.model.DeleteUDiskParam;
import cn.ucloud.model.DeleteUDiskResult;
import cn.ucloud.pojo.Account;
import cn.ucloud.pojo.UdiskConfig;
import org.junit.Before;
import org.junit.Test;

/**
 * @description:
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2018/9/26 14:40
 */
public class DeleteUDiskTest {
    private UdiskClient client;

    private DeleteUDiskParam param;

    @Before
    public void initData() {
        client = new DefaultUdiskClient(new UdiskConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        param = new DeleteUDiskParam("cn-sh2", "cn-sh2-01", "bs-iuas54");
        param.setProjectId("org-4nfe1i");
    }

    @Test
    public void deleteUDisk() {
        try {
            DeleteUDiskResult result = client.deleteUDisk(param);
            System.out.println("同步：" + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void deleteUDiskCallback() {
        client.deleteUDisk(param, new UcloudHandler<DeleteUDiskResult>() {
            @Override
            public Object success(DeleteUDiskResult result) {
                System.out.println("异步 success：" + result);
                return null;
            }

            @Override
            public Object failed(DeleteUDiskResult result) {
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
