package cn.ucloud.ufs.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.ufs.model.DescribeUFSVolumeWhiteListParam;
import cn.ucloud.ufs.model.DescribeUFSVolumeWhiteListResult;
import cn.ucloud.ufs.pojo.UFSConfig;
import org.junit.Before;
import org.junit.Test;

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
        param.setProjectId("org-4nfe1i");
    }

    @Test
    public void describeUFSVolumeWhiteList() {
        try {
            DescribeUFSVolumeWhiteListResult describeUFSVolumeWhiteListResult = client.describeUFSVolumeWhiteList(param);
            System.out.println(describeUFSVolumeWhiteListResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}