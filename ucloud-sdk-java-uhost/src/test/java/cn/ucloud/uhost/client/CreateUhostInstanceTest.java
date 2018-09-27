package cn.ucloud.uhost.client;

import cn.ucloud.uhost.client.DefaultUhostClient;
import cn.ucloud.uhost.client.UhostClient;
import cn.ucloud.uhost.model.CreateUHostInstanceParam;
import cn.ucloud.uhost.model.CreateUHostInstanceResult;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.uhost.pojo.UhostConfig;
import org.junit.Before;
import org.junit.Test;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-17 17:43
 **/
public class CreateUhostInstanceTest {

    private UhostClient client;

    private CreateUHostInstanceParam param;

    @Before
    public void initData() {
        client = new DefaultUhostClient(new UhostConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        // uimage-cjswb5 ubuntu 16.04
        param = new CreateUHostInstanceParam("cn-sh2","cn-sh2-02","uimage-cjswb5");
        param.setName("java-sdk-test-aaa");
        param.setPassword("123456ab");
        param.setProjectId("org-4nfe1i");
        param.setVpcId("uvnet-dbboih");
        param.setSubnetId("subnet-us0fsb");
    }


    @Test
    public void createUHostInstance() {
        try {
            CreateUHostInstanceResult uHostInstance = client.createUHostInstance(param);
            System.out.println(uHostInstance);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}