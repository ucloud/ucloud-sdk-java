package cn.ucloud.vpc.client;

import cn.ucloud.vpc.client.DefaultVPCClient;
import cn.ucloud.vpc.client.VPCClient;
import cn.ucloud.vpc.model.DeleteVPCParam;
import cn.ucloud.vpc.model.DeleteVPCResult;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.vpc.pojo.VPCConfig;
import org.junit.Before;
import org.junit.Test;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-21 14:11
 **/
public class DeleteVPCTest {



    private VPCClient client;

    private DeleteVPCParam param;


    @Before
    public void initData() {
        client = new DefaultVPCClient(new VPCConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        param = new DeleteVPCParam("cn-bj2","uvnet-1wu2eb");
        param.setProjectId("org-4nfe1i");
    }


    @Test
    public void deleteVPC() {
        try {
            DeleteVPCResult deleteVPCResult = client.deleteVPC(param);
            System.out.println(deleteVPCResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}