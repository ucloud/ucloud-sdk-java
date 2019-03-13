package cn.ucloud.ufs.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.ufs.model.UpdateUFSVolumeWhiteListParam;
import cn.ucloud.ufs.model.UpdateUFSVolumeWhiteListResult;
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
 * @date: 2018/10/8 16:58
 */
public class UpdateUFSVolumeWhiteListTest {
    private UFSClient client;

    private UpdateUFSVolumeWhiteListParam param;

    @Before
    public void initData() {
        client = new DefaultUFSClient(new UFSConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        List<String> uhostIds = new ArrayList<>();
        uhostIds.add("uhost-zzsffd");
        uhostIds.add("uhost-kdegdk");
        param = new UpdateUFSVolumeWhiteListParam("cn-bj2", "ufs-qx1waw", uhostIds);
        param.setProjectId("org-4nfe1i");
    }

    @Test
    public void updateUFSVolumeWhiteList() {
        try {
            UpdateUFSVolumeWhiteListResult result = client.updateUFSVolumeWhiteList(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }
}
