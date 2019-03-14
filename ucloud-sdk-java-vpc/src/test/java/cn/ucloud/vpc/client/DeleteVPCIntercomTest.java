package cn.ucloud.vpc.client;

import cn.ucloud.vpc.model.DeleteVPCIntercomParam;
import cn.ucloud.vpc.model.DeleteVPCIntercomResult;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.vpc.pojo.VPCConfig;
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
                        System.getenv("UcloudPublicKey"))));
        param = new DeleteVPCIntercomParam("cn-bj2", "uvnet-453iklki", "uvnet-ckhwco");
    }


    @Test
    public void deleteVPCIntercom() {
        try {
            DeleteVPCIntercomResult deleteVPCIntercomResult = client.deleteVPCIntercom(param);
            System.out.println(deleteVPCIntercomResult);
            JSONComparator.jsonComparator(deleteVPCIntercomResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}