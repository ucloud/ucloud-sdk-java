package cn.ucloud.uhost.client;

import cn.ucloud.uhost.client.DefaultUhostClient;
import cn.ucloud.uhost.client.UhostClient;
import cn.ucloud.uhost.model.ModifyUHostInstanceRemarkParam;
import cn.ucloud.uhost.model.ModifyUHostInstanceRemarkResult;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.uhost.pojo.UhostConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-18 18:20
 **/
public class ModifyUHostInstanceRemarkTest {


    private UhostClient client;

    private ModifyUHostInstanceRemarkParam param;

    @Before
    public void initData() {
        client = new DefaultUhostClient(new UhostConfig(
                new Account(System.getenv("UCloudPrivateKey"),
                        System.getenv("UCloudPublicKey"))));
        param = new ModifyUHostInstanceRemarkParam("cn-sh2","uhost-rjonwb2x");
        param.setProjectId("org-izug1m");
        param.setRemark("java-sdk-test");
    }
    @Test
    public void modifyUHostInstanceRemark() {
        try {
            ModifyUHostInstanceRemarkResult result = client.modifyUHostInstanceRemark(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }
}