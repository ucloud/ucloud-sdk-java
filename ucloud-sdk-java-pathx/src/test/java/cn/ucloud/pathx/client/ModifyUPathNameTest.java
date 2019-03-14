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
        String projectId = "org-izug1m";
        String uPathId = "upath-bwccmk2b";
        String name = "sdk-java-test-rename";
        param = new ModifyUPathNameParam(projectId, uPathId, name);
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