package cn.ucloud.umem.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.umem.model.ModifyUMemSpaceNameParam;
import cn.ucloud.umem.model.ModifyUMemSpaceNameResult;
import cn.ucloud.umem.pojo.UMEMConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;


/**
 * @Description : UMEM.ModifyUMemSpaceName 测试
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-15 10:00
 **/
public class ModifyUMemSpaceNameTest {

    private UMEMClient client;

    private ModifyUMemSpaceNameParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultUMEMClient(new UMEMConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        String region = "cn-sh2";
        String spaceId = "umem-lwzcxbcl";
        String name = "rename-sdk-java";
        param = new ModifyUMemSpaceNameParam(region, spaceId, name);
        param.setProjectId("org-izug1m");
    }


    @Test
    public void modifyUMemSpaceName() {
        try {
            ModifyUMemSpaceNameResult result = client.modifyUMemSpaceName(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

}