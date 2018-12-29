package cn.ucloud.ufs.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.ufs.model.CreateUFSVolumeParam;
import cn.ucloud.ufs.model.CreateUFSVolumeResult;
import cn.ucloud.ufs.pojo.UFSConfig;
import org.junit.Before;
import org.junit.Test;

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
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        param = new CreateUFSVolumeParam("cn-bj2",1024);
        param.setProjectId("org-4nfe1i");
    }
    @Test
    public void createUFSVolume() {
        try {
            CreateUFSVolumeResult ufsVolume = client.createUFSVolume(param);
            System.out.println(ufsVolume);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}