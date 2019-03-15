package cn.ucloud.uhost.client;

import cn.ucloud.uhost.client.DefaultUhostClient;
import cn.ucloud.uhost.client.UhostClient;
import cn.ucloud.uhost.model.ModifyUHostInstanceNameParam;
import cn.ucloud.uhost.model.ModifyUHostInstanceNameResult;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.uhost.pojo.UhostConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;

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
        param = new ModifyUHostInstanceNameParam("cn-sh2","uhost-rjonwb2x");
        param.setProjectId("org-izug1m");
        param.setName("java-sdk-test");
    }

    @Test
    public void modifyUHostInstanceName() {
        try {
            ModifyUHostInstanceNameResult result = client.modifyUHostInstanceName(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }
}