package cn.ucloud.udisk.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.udisk.model.CreateUDiskParam;
import cn.ucloud.udisk.model.CreateUDiskResult;
import cn.ucloud.udisk.pojo.UdiskConfig;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 * @description:
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2018/9/26 13:53
 */
public class CreateUDiskTest {

    private UdiskClient client;

    private String projectId="org-izug1m";

    private String region="cn-sh2";

    private String zone="cn-sh2-02";

    private CreateUDiskParam param;

    @Before
    public void initData() {
        client = new DefaultUdiskClient(new UdiskConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        param = new CreateUDiskParam(region, zone, 16, "udisk-test");
        param.setProjectId(projectId);
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

    @Ignore
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
