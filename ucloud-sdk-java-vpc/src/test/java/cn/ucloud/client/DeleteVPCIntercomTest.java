package cn.ucloud.client;

import cn.ucloud.model.DeleteVPCIntercomParam;
import cn.ucloud.model.DeleteVPCIntercomResult;
import cn.ucloud.pojo.Account;
import cn.ucloud.pojo.VPCConfig;
import org.junit.Before;
import org.junit.Test;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-21 18:06
 **/
public class DeleteVPCIntercomTest {

    private VPCClient client;

    private DeleteVPCIntercomParam param;

    @Before
    public void initData() {
        client = new DefaultVPCClient(new VPCConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"),
                        System.getenv("UcloudPassword"))));
        param = new DeleteVPCIntercomParam("cn-bj2","uvnet-lsltj0","uvnet-qmrkj1");
        param.setProjectId("org-4nfe1i");
    }

    @Test
    public void deleteVPCIntercom() {
        try {
            DeleteVPCIntercomResult deleteVPCIntercomResult = client.deleteVPCIntercom(param);
            System.out.println(deleteVPCIntercomResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}