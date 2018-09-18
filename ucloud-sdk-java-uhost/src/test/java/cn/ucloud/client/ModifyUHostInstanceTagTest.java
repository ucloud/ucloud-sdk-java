package cn.ucloud.client;

import cn.ucloud.model.ModifyUHostInstanceTagParam;
import cn.ucloud.model.ModifyUHostInstanceTagResult;
import cn.ucloud.pojo.Account;
import cn.ucloud.pojo.UhostConfig;
import org.junit.Before;
import org.junit.Test;

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
                        System.getenv("UcloudPublicKey"),
                        System.getenv("UcloudPassword"))));
        // uimage-cjswb5 ubuntu 16.04
        param = new ModifyUHostInstanceTagParam("cn-bj2","uhost-1irm01");
        param.setTag("demo");
    }

    @Test
    public void modifyUHostInstanceTag() {
        try {
            ModifyUHostInstanceTagResult modifyUHostInstanceTagResult = client.modifyUHostInstanceTag(param);
            System.out.println(modifyUHostInstanceTagResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}