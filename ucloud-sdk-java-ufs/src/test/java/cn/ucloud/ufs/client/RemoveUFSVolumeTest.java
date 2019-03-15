package cn.ucloud.ufs.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.ufs.model.RemoveUFSVolumeParam;
import cn.ucloud.ufs.model.RemoveUFSVolumeResult;
import cn.ucloud.ufs.pojo.UFSConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;

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
        param = new RemoveUFSVolumeParam("cn-bj2", "ufs-vnc50gpn");
        param.setProjectId("org-izug1m");
    }

    @Test
    public void removeUFSVolume() {
        try {
            RemoveUFSVolumeResult result = client.removeUFSVolume(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }
}
