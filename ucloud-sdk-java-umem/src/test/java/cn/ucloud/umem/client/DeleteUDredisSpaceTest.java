package cn.ucloud.umem.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.umem.model.DeleteUDredisSpaceParam;
import cn.ucloud.umem.model.DeleteUDredisSpaceResult;
import cn.ucloud.umem.pojo.UMEMConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;


/**
 * @Description : UMEM.DeleteUDredisSpace 测试
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-15 10:00
 **/
public class DeleteUDredisSpaceTest {

    private UMEMClient client;

    private DeleteUDredisSpaceParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultUMEMClient(new UMEMConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        String region = "cn-sh2";
        String spaceId = "cn-sh2";
        param = new DeleteUDredisSpaceParam(region, spaceId);
        param.setProjectId("org-izug1m");
    }


    @Test
    public void deleteUDredisSpace() {
        try {
            DeleteUDredisSpaceResult result = client.deleteUDredisSpace(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

}