package cn.ucloud.ufs.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.ufs.model.CreateUFSVolumeParam;
import cn.ucloud.ufs.model.CreateUFSVolumeResult;
import cn.ucloud.ufs.pojo.UFSConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-10-08 16:29
 **/
public class CreateUFSVolumeTest {

    private UFSClient client;

    private CreateUFSVolumeParam param;

    @Before
    public void initData() {
        client = new DefaultUFSClient(new UFSConfig(
                new Account(System.getenv("UCloudPrivateKey"),
                        System.getenv("UCloudPublicKey"))));
        param = new CreateUFSVolumeParam("cn-bj2",1024);
        param.setProjectId("org-izug1m");
    }
    @Test
    public void createUFSVolume() {
        try {
            CreateUFSVolumeResult result = client.createUFSVolume(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }
}