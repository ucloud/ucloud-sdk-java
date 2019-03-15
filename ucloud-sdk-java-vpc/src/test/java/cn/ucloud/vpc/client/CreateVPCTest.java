package cn.ucloud.vpc.client;

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
        network.add("10.24.0.0/16");
        param.setNetwork(network);
    }


    @Test
    public void createVPC() {
        try {
            CreateVPCResult vpc = client.createVPC(param);
            JSONComparator.jsonComparator(vpc);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}