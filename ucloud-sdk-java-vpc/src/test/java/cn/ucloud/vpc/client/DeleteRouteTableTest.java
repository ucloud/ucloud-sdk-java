package cn.ucloud.vpc.client;

import cn.ucloud.vpc.model.DeleteRouteTableParam;
import cn.ucloud.vpc.model.DeleteRouteTableResult;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.vpc.pojo.VPCConfig;
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
                new Account(System.getenv("UCloudPrivateKey"),
                        System.getenv("UCloudPublicKey"))));
        param = new DeleteRouteTableParam("cn-bj2", "routetable-dmtlpro1");
    }

    @Test
    public void deleteRouteTable() {
        try {
            DeleteRouteTableResult deleteRouteTableResult = client.deleteRouteTable(param);
            JSONComparator.jsonComparator(deleteRouteTableResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}