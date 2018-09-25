package cn.ucloud.client;

import cn.ucloud.model.CreateUHostInstanceParam;
import cn.ucloud.model.CreateUHostInstanceResult;
import cn.ucloud.pojo.Account;
import cn.ucloud.pojo.UhostConfig;
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
        param = new CreateUHostInstanceParam("cn-bj2","cn-bj2-02","uimage-cjswb5");
        param.setName("java-sdk-test");
        param.setPassword("123456ab");
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