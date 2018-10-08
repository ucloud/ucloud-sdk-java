package cn.ucloud.ufs.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.ufs.model.DescribeUFSVolumePriceParam;
import cn.ucloud.ufs.model.DescribeUFSVolumePriceResult;
import cn.ucloud.ufs.pojo.UFSConfig;
import org.junit.Before;
import org.junit.Test;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-10-08 16:30
 **/
public class DescribeUFSVolumePriceTest {

    private UFSClient client;

    private DescribeUFSVolumePriceParam param;

    @Before
    public void initData() {
        client = new DefaultUFSClient(new UFSConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        param = new DescribeUFSVolumePriceParam("cn-bj2",1024);
        param.setProjectId("org-4nfe1i");
    }

    @Test
    public void describeUFSVolumePrice() {
        try {
            DescribeUFSVolumePriceResult describeUFSVolumePriceResult = client.describeUFSVolumePrice(param);
            System.out.println(describeUFSVolumePriceResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}