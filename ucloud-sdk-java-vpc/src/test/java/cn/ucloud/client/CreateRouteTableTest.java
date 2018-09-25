package cn.ucloud.client;

import cn.ucloud.model.CreateRouteTableParam;
import cn.ucloud.model.CreateRouteTableResult;
import cn.ucloud.pojo.Account;
import cn.ucloud.pojo.VPCConfig;
import org.junit.Before;
import org.junit.Test;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-21 18:14
 **/
public class CreateRouteTableTest {

    private VPCClient client;

    private CreateRouteTableParam param;

    @Before
    public void initData() {
        client = new DefaultVPCClient(new VPCConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        param = new CreateRouteTableParam("cn-bj2","uvnet-qmrkj1");
        param.setName("sdk-java-route");
        param.setProjectId("org-4nfe1i");
    }


    @Test
    public void createRouteTable() {
        try {
            CreateRouteTableResult routeTable = client.createRouteTable(param);
            System.out.println(routeTable);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}