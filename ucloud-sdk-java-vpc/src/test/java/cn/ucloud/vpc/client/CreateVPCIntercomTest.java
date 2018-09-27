package cn.ucloud.vpc.client;

import cn.ucloud.vpc.client.DefaultVPCClient;
import cn.ucloud.vpc.client.VPCClient;
import cn.ucloud.vpc.model.CreateVPCIntercomParam;
import cn.ucloud.vpc.model.CreateVPCIntercomResult;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.vpc.pojo.VPCConfig;
import org.junit.Before;
import org.junit.Test;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-21 17:23
 **/
public class CreateVPCIntercomTest {

    private VPCClient client;

    private CreateVPCIntercomParam param;

    @Before
    public void initData() {
        client = new DefaultVPCClient(new VPCConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        param = new CreateVPCIntercomParam("cn-bj2","uvnet-lsltj0","uvnet-qmrkj1");
        param.setProjectId("org-4nfe1i");
    }


    @Test
    public void createVPCIntercom() {
        try {
            CreateVPCIntercomResult vpcIntercom = client.createVPCIntercom(param);
            System.out.println(vpcIntercom);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}