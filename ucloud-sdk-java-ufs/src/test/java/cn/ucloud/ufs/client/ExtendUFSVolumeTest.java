package cn.ucloud.ufs.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.ufs.model.ExtendUFSVolumeParam;
import cn.ucloud.ufs.model.ExtendUFSVolumeResult;
import cn.ucloud.ufs.pojo.UFSConfig;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertNull;

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
                new Account(System.getenv("UCloudPrivateKey"),
                        System.getenv("UCloudPublicKey"))));
        param = new ExtendUFSVolumeParam("cn-bj2", "ufs-vnc50gpn", 2 * 500);
        param.setProjectId("org-izug1m");
    }

    @Test
    public void extendUFSVolume() {
        try {
            ExtendUFSVolumeResult result = client.extendUFSVolume(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }
}
