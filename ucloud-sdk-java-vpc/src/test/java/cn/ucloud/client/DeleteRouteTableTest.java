package cn.ucloud.client;

import cn.ucloud.model.DeleteRouteTableParam;
import cn.ucloud.model.DeleteRouteTableResult;
import cn.ucloud.pojo.Account;
import cn.ucloud.pojo.VPCConfig;
import org.junit.Before;
import org.junit.Test;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-21 18:45
 **/
public class DeleteRouteTableTest {

    private VPCClient client;

    private DeleteRouteTableParam param;

    @Before
    public void initData() {
        client = new DefaultVPCClient(new VPCConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        param = new DeleteRouteTableParam("cn-bj2","routetable-2dumbv");
        param.setProjectId("org-4nfe1i");
    }

    @Test
    public void deleteRouteTable() {
        try {
            DeleteRouteTableResult deleteRouteTableResult = client.deleteRouteTable(param);
            System.out.println(deleteRouteTableResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}