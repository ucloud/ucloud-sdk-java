package cn.ucloud.vpc.client;

import cn.ucloud.vpc.client.DefaultVPCClient;
import cn.ucloud.vpc.client.VPCClient;
import cn.ucloud.vpc.model.CreateVPCParam;
import cn.ucloud.vpc.model.CreateVPCResult;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.vpc.pojo.VPCConfig;
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
                        System.getenv("UcloudPublicKey"))));
        param = new CreateVPCParam("cn-bj2","sdk-java-vpc2");
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