package cn.ucloud.client;

import cn.ucloud.model.CreateVPCParam;
import cn.ucloud.model.CreateVPCResult;
import cn.ucloud.pojo.Account;
import cn.ucloud.pojo.VPCConfig;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-21 11:40
 **/
public class CreateVPCTest {

    private VPCClient client;

    private CreateVPCParam param;

    @Before
    public void initData() {
        client = new DefaultVPCClient(new VPCConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"),
                        System.getenv("UcloudPassword"))));
        param = new CreateVPCParam("cn-bj2","sdk-java-vpc");
        List<String> network = new ArrayList<>();
        network.add("10.10.0.0/16");
        param.setNetwork(network);
        param.setProjectId("org-4nfe1i");
    }


    @Test
    public void createVPC() {
        try {
            CreateVPCResult vpc = client.createVPC(param);
            System.out.println(vpc);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}