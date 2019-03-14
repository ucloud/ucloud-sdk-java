package cn.ucloud.ufs.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.ufs.model.DescribeUFSVolumeWhiteListParam;
import cn.ucloud.ufs.model.DescribeUFSVolumeWhiteListResult;
import cn.ucloud.ufs.pojo.UFSConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-10-08 17:02
 **/
public class DescribeUFSVolumeWhiteListTest {


    private UFSClient client;

    private DescribeUFSVolumeWhiteListParam param;

    @Before
    public void initData() {
        client = new DefaultUFSClient(new UFSConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        param = new DescribeUFSVolumeWhiteListParam("cn-bj2","ufs-qx1waw");
        param.setProjectId("org-izug1m");
    }

    @Test
    public void describeUFSVolumeWhiteList() {
        try {
            DescribeUFSVolumeWhiteListResult result = client.describeUFSVolumeWhiteList(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }
}