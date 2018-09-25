package cn.ucloud.client;

import cn.ucloud.model.ModifyUHostInstanceRemarkParam;
import cn.ucloud.model.ModifyUHostInstanceRemarkResult;
import cn.ucloud.pojo.Account;
import cn.ucloud.pojo.UhostConfig;
import org.junit.Before;
import org.junit.Test;

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
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        param = new ModifyUHostInstanceRemarkParam("cn-bj2","uhost-zzsffd");
        param.setProjectId("org-4nfe1i");
        param.setRemark("java-sdk-test");
    }
    @Test
    public void modifyUHostInstanceRemark() {
        try {
            ModifyUHostInstanceRemarkResult modifyUHostInstanceRemarkResult = client.modifyUHostInstanceRemark(param);
            System.out.println(modifyUHostInstanceRemarkResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}