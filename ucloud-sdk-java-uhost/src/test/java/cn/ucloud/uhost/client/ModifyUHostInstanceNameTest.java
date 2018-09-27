package cn.ucloud.uhost.client;

import cn.ucloud.uhost.client.DefaultUhostClient;
import cn.ucloud.uhost.client.UhostClient;
import cn.ucloud.uhost.model.ModifyUHostInstanceNameParam;
import cn.ucloud.uhost.model.ModifyUHostInstanceNameResult;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.uhost.pojo.UhostConfig;
import org.junit.Before;
import org.junit.Test;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-18 14:25
 **/
public class ModifyUHostInstanceNameTest {

    private UhostClient client;

    private ModifyUHostInstanceNameParam param;

    @Before
    public void initData() {
        client = new DefaultUhostClient(new UhostConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        param = new ModifyUHostInstanceNameParam("cn-bj2","uhost-zzsffd");
        param.setProjectId("org-4nfe1i");
        param.setName("java-sdk-test");
    }

    @Test
    public void modifyUHostInstanceName() {
        try {
            ModifyUHostInstanceNameResult modifyUHostInstanceNameResult = client.modifyUHostInstanceName(param);
            System.out.println(modifyUHostInstanceNameResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}