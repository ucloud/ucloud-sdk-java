package cn.ucloud.client;

import cn.ucloud.handler.UcloudHandler;
import cn.ucloud.model.RestoreUDiskParam;
import cn.ucloud.model.RestoreUDiskResult;
import cn.ucloud.pojo.Account;
import cn.ucloud.pojo.UdiskConfig;
import org.junit.Before;
import org.junit.Test;

/**
 * @description:
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2018/9/26 17:59
 */
public class RestoreUDiskTest {
    private UdiskClient client;

    private RestoreUDiskParam param;

    @Before
    public void initData() {
        client = new DefaultUdiskClient(new UdiskConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        param = new RestoreUDiskParam("cn-sh2", "cn-sh2-01", "bs-4qfrwv");
        param.setProjectId("org-4nfe1i");
    }

    @Test
    public void doTest() {
        try {
            RestoreUDiskResult result = client.restoreUDisk(param);
            System.out.println("同步：" + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void doTestCallback() {
        client.restoreUDisk(param, new UcloudHandler<RestoreUDiskResult>() {
            @Override
            public Object success(RestoreUDiskResult result) {
                System.out.println("异步 success：" + result);
                return null;
            }

            @Override
            public Object failed(RestoreUDiskResult result) {
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
