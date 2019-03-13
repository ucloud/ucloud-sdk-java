package cn.ucloud.uhost.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.uhost.model.GetUhostInstanceVncInfoParam;
import cn.ucloud.uhost.model.GetUhostInstanceVncInfoResult;
import cn.ucloud.uhost.pojo.UhostConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;


/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-14 16:44
 **/
public class GetUHostInstanceVncInfoTest {

    private UhostClient client;

    private GetUhostInstanceVncInfoParam param;

    @Before
    public void initData() {
        client = new DefaultUhostClient(new UhostConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        param = new GetUhostInstanceVncInfoParam("cn-bj2", "uhost-rjonwb2x");
        param.setProjectId("org-izug1m");
        param.setZone("cn-bj2-02");
    }

    @Test
    public void getUHostInstanceVncInfo() {
        try {
            GetUhostInstanceVncInfoResult result = client.getUHostInstanceVncInfo(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }
}