package cn.ucloud.vpc.client;

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
        param = new CloneRouteTableParam("cn-bj2", "routetable-ucyi5kkm");
    }


    @Test
    public void cloneRouteTable() {
        try {
            CloneRouteTableResult cloneRouteTableResult = client.cloneRouteTable(param);
            System.out.println(cloneRouteTableResult);
            JSONComparator.jsonComparator(cloneRouteTableResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}