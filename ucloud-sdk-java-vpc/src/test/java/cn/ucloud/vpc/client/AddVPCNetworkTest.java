package cn.ucloud.vpc.client;

import cn.ucloud.vpc.client.DefaultVPCClient;
import cn.ucloud.vpc.client.VPCClient;
import cn.ucloud.vpc.model.AddVPCNetworkParam;
import cn.ucloud.vpc.model.AddVPCNetworkResult;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.vpc.pojo.VPCConfig;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-21 15:36
 **/
public class AddVPCNetworkTest {


    private VPCClient client;

    private AddVPCNetworkParam param;

    @Before
    public void initData() {
        client = new DefaultVPCClient(new VPCConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        param = new AddVPCNetworkParam("cn-bj2","uvnet-qmrkj1");
        List<String> network = new ArrayList<>();
        network.add("10.11.0.0/16");
        param.setNetwork(network);
        param.setProjectId("org-4nfe1i");
    }


    @Test
    public void addVPCNetwork() {
        try {
            AddVPCNetworkResult addVPCNetworkResult = client.addVPCNetwork(param);
            System.out.println(addVPCNetworkResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}