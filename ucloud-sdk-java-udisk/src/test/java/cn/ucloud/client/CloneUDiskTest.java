package cn.ucloud.client;

import cn.ucloud.handler.UcloudHandler;
import cn.ucloud.model.CloneUDiskParam;
import cn.ucloud.model.CloneUDiskResult;
import cn.ucloud.pojo.Account;
import cn.ucloud.pojo.UdiskConfig;
import org.junit.Before;
import org.junit.Test;

/**
 * @description:
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2018/9/26 15:38
 */
public class CloneUDiskTest {
    private UdiskClient client;

    private CloneUDiskParam param;

    @Before
    public void initData() {
        client = new DefaultUdiskClient(new UdiskConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        param = new CloneUDiskParam("cn-sh2", "cn-sh2-01", "clone-from-bs-4qfrwv","bs-4qfrwv");
        param.setProjectId("org-4nfe1i");
    }

    @Test
    public void doTest() {
        try {
            CloneUDiskResult result = client.cloneUDisk(param);
            System.out.println("同步：" + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void doTestCallback() {
        client.cloneUDisk(param, new UcloudHandler<CloneUDiskResult>() {
            @Override
            public Object success(CloneUDiskResult result) {
                System.out.println("异步 success：" + result);
                return null;
            }

            @Override
            public Object failed(CloneUDiskResult result) {
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
