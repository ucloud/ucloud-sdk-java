package cn.ucloud.pathx.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.pathx.model.ModifyUGANameParam;
import cn.ucloud.pathx.model.ModifyUGANameResult;
import cn.ucloud.pathx.pojo.PATHXConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;


/**
 * @Description : PATHX.ModifyUGAName 测试
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 10:02
 **/
public class ModifyUGANameTest {

    private PATHXClient client;

    private ModifyUGANameParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultPATHXClient(new PATHXConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        String projectId = "cn-sh2";
        String uGAId = "cn-sh2";
        String name = "cn-sh2";
        param = new ModifyUGANameParam(projectId, uGAId, name);
        param.setProjectId("org-izug1m");
    }


    @Test
    public void modifyUGAName() {
        try {
            ModifyUGANameResult result = client.modifyUGAName(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

}