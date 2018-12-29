package cn.ucloud.vpc.client;

import cn.ucloud.vpc.client.DefaultVPCClient;
import cn.ucloud.vpc.client.VPCClient;
import cn.ucloud.vpc.model.CloneRouteTableParam;
import cn.ucloud.vpc.model.CloneRouteTableResult;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.vpc.pojo.VPCConfig;
import org.junit.Before;
import org.junit.Test;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-21 18:38
 **/
public class CloneRouteTableTest {


    private VPCClient client;

    private CloneRouteTableParam param;

    @Before
    public void initData() {
        client = new DefaultVPCClient(new VPCConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        param = new CloneRouteTableParam("cn-bj2","routetable-pxtsmf");
        param.setProjectId("org-4nfe1i");
    }


    @Test
    public void cloneRouteTable() {
        try {
            CloneRouteTableResult cloneRouteTableResult = client.cloneRouteTable(param);
            System.out.println(cloneRouteTableResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}