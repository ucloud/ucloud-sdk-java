package cn.ucloud.ufs.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.ufs.model.ExtendUFSVolumeParam;
import cn.ucloud.ufs.model.ExtendUFSVolumeResult;
import cn.ucloud.ufs.pojo.UFSConfig;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2018/10/8 17:44
 */
public class ExtendUFSVolumeTest {
    private UFSClient client;

    private ExtendUFSVolumeParam param;

    @Before
    public void initData() {
        client = new DefaultUFSClient(new UFSConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        param = new ExtendUFSVolumeParam("cn-bj2", "ufs-qx1waw", 2 * 1024);
        param.setProjectId("org-4nfe1i");
    }

    @Test
    public void extendUFSVolume() {
        try {
            ExtendUFSVolumeResult describeUFSVolumeResult = client.extendUFSVolume(param);
            System.out.println(describeUFSVolumeResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
