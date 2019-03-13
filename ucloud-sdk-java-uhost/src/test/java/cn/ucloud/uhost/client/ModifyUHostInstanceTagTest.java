package cn.ucloud.uhost.client;

import cn.ucloud.uhost.client.DefaultUhostClient;
import cn.ucloud.uhost.client.UhostClient;
import cn.ucloud.uhost.model.ModifyUHostInstanceTagParam;
import cn.ucloud.uhost.model.ModifyUHostInstanceTagResult;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.uhost.pojo.UhostConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-17 18:39
 **/
public class ModifyUHostInstanceTagTest {

    private UhostClient client;

    private ModifyUHostInstanceTagParam param;

    @Before
    public void initData() {
        client = new DefaultUhostClient(new UhostConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        // uimage-cjswb5 ubuntu 16.04
        param = new ModifyUHostInstanceTagParam("cn-sh2","uhost-rjonwb2x");
        param.setTag("demo");
    }

    @Test
    public void modifyUHostInstanceTag() {
        try {
            ModifyUHostInstanceTagResult result = client.modifyUHostInstanceTag(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }
}