package cn.ucloud.ufs.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.ufs.model.RemoveUFSVolumeParam;
import cn.ucloud.ufs.model.RemoveUFSVolumeResult;
import cn.ucloud.ufs.pojo.UFSConfig;
import org.junit.Before;
import org.junit.Test;

/**
 * @description:
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2018/10/8 17:51
 */
public class RemoveUFSVolumeTest {
    private UFSClient client;

    private RemoveUFSVolumeParam param;

    @Before
    public void initData() {
        client = new DefaultUFSClient(new UFSConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        param = new RemoveUFSVolumeParam("cn-bj2", "ufs-xkohyk");
        param.setProjectId("org-4nfe1i");
    }

    @Test
    public void removeUFSVolume() {
        try {
            RemoveUFSVolumeResult describeUFSVolumeResult = client.removeUFSVolume(param);
            System.out.println(describeUFSVolumeResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
