package cn.ucloud.pathx.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.pathx.model.ModifyGlobalSSHPortParam;
import cn.ucloud.pathx.model.ModifyGlobalSSHPortResult;
import cn.ucloud.pathx.pojo.PATHXConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;


/**
 * @Description : PATHX.ModifyGlobalSSHPort 测试
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 10:02
 **/
public class ModifyGlobalSSHPortTest {

    private PATHXClient client;

    private ModifyGlobalSSHPortParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultPATHXClient(new PATHXConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        String projectId = "org-izug1m";
        String instanceId = "uga-eskzpkk2";
        Integer port = 112;
        param = new ModifyGlobalSSHPortParam(projectId, instanceId, port);
    }


    @Test
    public void modifyGlobalSSHPort() {
        try {
            ModifyGlobalSSHPortResult result = client.modifyGlobalSSHPort(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

}