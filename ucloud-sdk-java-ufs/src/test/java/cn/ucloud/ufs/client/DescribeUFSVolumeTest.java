package cn.ucloud.ufs.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.ufs.model.DescribeUFSVolumeParam;
import cn.ucloud.ufs.model.DescribeUFSVolumeResult;
import cn.ucloud.ufs.pojo.UFSConfig;
import org.junit.Before;
import org.junit.Test;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-10-08 15:25
 **/
public class DescribeUFSVolumeTest {

    private UFSClient client;

    private DescribeUFSVolumeParam param;

    @Before
    public void initData() {
        client = new DefaultUFSClient(new UFSConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        param = new DescribeUFSVolumeParam("cn-bj2");
        param.setProjectId("org-4nfe1i");
    }

    @Test
    public void describeUFSVolume() {
        try {
            DescribeUFSVolumeResult describeUFSVolumeResult = client.describeUFSVolume(param);
            System.out.println(describeUFSVolumeResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}