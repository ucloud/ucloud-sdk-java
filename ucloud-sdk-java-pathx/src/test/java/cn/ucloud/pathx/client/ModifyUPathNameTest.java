package cn.ucloud.pathx.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.pathx.model.ModifyUPathNameParam;
import cn.ucloud.pathx.model.ModifyUPathNameResult;
import cn.ucloud.pathx.pojo.PATHXConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;


/**
 * @Description : PATHX.ModifyUPathName 测试
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 10:02
 **/
public class ModifyUPathNameTest {

    private PATHXClient client;

    private ModifyUPathNameParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultPATHXClient(new PATHXConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        String projectId = "cn-sh2";
        String uPathId = "cn-sh2";
        String name = "cn-sh2";
        param = new ModifyUPathNameParam(projectId, uPathId, name);
        param.setProjectId("org-izug1m");
    }


    @Test
    public void modifyUPathName() {
        try {
            ModifyUPathNameResult result = client.modifyUPathName(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

}