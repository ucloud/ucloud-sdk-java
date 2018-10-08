package cn.ucloud.ufs.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.ufs.model.UpdateUFSVolumeInfoParam;
import cn.ucloud.ufs.model.UpdateUFSVolumeInfoResult;
import cn.ucloud.ufs.pojo.UFSConfig;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2018/10/8 17:30
 */
public class UpdateUFSVolumeInfoTest {
    private UFSClient client;

    private UpdateUFSVolumeInfoParam param;

    @Before
    public void initData() {
        client = new DefaultUFSClient(new UFSConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        param = new UpdateUFSVolumeInfoParam("cn-bj2", "ufs-qx1waw");
        param.setProjectId("org-4nfe1i");
        param.setVolumeName("test_Volume");
        param.setRemark("this is test");
    }

    @Test
    public void updateUFSVolumeInfo() {
        try {
            UpdateUFSVolumeInfoResult describeUFSVolumeResult = client.updateUFSVolumeInfo(param);
            System.out.println(describeUFSVolumeResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
