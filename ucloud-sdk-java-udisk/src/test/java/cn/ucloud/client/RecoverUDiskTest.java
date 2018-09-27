package cn.ucloud.client;

import cn.ucloud.handler.UcloudHandler;
import cn.ucloud.model.RecoverUDiskParam;
import cn.ucloud.model.RecoverUDiskResult;
import cn.ucloud.pojo.Account;
import cn.ucloud.pojo.UdiskConfig;
import org.junit.Before;
import org.junit.Test;

/**
 * @description:
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2018/9/26 15:24
 */
public class RecoverUDiskTest {
    private UdiskClient client;

    private RecoverUDiskParam param;

    @Before
    public void initData() {
        client = new DefaultUdiskClient(new UdiskConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        param = new RecoverUDiskParam("cn-sh2", "cn-sh2-01", "bs-c1ohsh");
        param.setProjectId("org-4nfe1i");
    }

    @Test
    public void doTest() {
        try {
            RecoverUDiskResult result = client.recoverUDisk(param);
            System.out.println("同步：" + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void doTestCallback() {
        client.recoverUDisk(param, new UcloudHandler<RecoverUDiskResult>() {
            @Override
            public Object success(RecoverUDiskResult result) {
                System.out.println("异步 success：" + result);
                return null;
            }

            @Override
            public Object failed(RecoverUDiskResult result) {
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
