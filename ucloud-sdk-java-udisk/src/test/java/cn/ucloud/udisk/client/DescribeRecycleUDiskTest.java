package cn.ucloud.udisk.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.udisk.model.DescribeRecycleUDiskParam;
import cn.ucloud.udisk.model.DescribeRecycleUDiskResult;
import cn.ucloud.udisk.pojo.UdiskConfig;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertNull;

/**
 * @description:
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2018/9/26 16:52
 */
public class DescribeRecycleUDiskTest {
    private UdiskClient client;

    private DescribeRecycleUDiskParam param;

    @Before
    public void initData() {
        client = new DefaultUdiskClient(new UdiskConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        param = new DescribeRecycleUDiskParam("cn-sh2", "cn-sh2-01");
        param.setProjectId("org-4nfe1i");
    }

    @Test
    public void describeRecycleUDisk() {
        try {
            DescribeRecycleUDiskResult result = client.describeRecycleUDisk(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Ignore
    @Test
    public void describeRecycleUDiskCallback() {
        client.describeRecycleUDisk(param, new UcloudHandler<DescribeRecycleUDiskResult>() {
            @Override
            public Object success(DescribeRecycleUDiskResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(DescribeRecycleUDiskResult result) {
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
