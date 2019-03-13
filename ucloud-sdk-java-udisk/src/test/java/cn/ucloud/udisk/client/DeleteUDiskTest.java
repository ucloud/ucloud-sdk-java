package cn.ucloud.udisk.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.udisk.model.DeleteUDiskParam;
import cn.ucloud.udisk.model.DeleteUDiskResult;
import cn.ucloud.udisk.pojo.UdiskConfig;
import org.junit.Before;
import org.junit.Ignore;
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
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Ignore
    @Test
    public void deleteUDiskCallback() {
        client.deleteUDisk(param, new UcloudHandler<DeleteUDiskResult>() {
            @Override
            public Object success(DeleteUDiskResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(DeleteUDiskResult result) {
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
