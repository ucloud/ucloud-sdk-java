package cn.ucloud.ufs.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.ufs.model.InitUFSVolumeWhiteListParam;
import cn.ucloud.ufs.model.InitUFSVolumeWhiteListResult;
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
 * @date: 2018/10/8 17:47
 */
public class InitUFSVolumeWhiteListTest {
    private UFSClient client;

    private InitUFSVolumeWhiteListParam param;

    @Before
    public void initData() {
        client = new DefaultUFSClient(new UFSConfig(
                new Account(System.getenv("UCloudPrivateKey"),
                        System.getenv("UCloudPublicKey"))));
        List<String> uhostIds = new ArrayList<>();
        uhostIds.add("uhost-zzsffd");
        param = new InitUFSVolumeWhiteListParam("cn-bj2", "ufs-vnc50gpn");
        param.setuHostIds(uhostIds);
        param.setProjectId("org-izug1m");
    }

    @Test
    public void initUFSVolumeWhiteList() {
        try {
            InitUFSVolumeWhiteListResult result = client.initUFSVolumeWhiteList(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }
}
