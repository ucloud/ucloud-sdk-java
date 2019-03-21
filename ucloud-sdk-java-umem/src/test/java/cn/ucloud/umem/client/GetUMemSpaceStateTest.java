package cn.ucloud.umem.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.umem.model.GetUMemSpaceStateParam;
import cn.ucloud.umem.model.GetUMemSpaceStateResult;
import cn.ucloud.umem.pojo.UMEMConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;


/**
 * @Description : UMEM.GetUMemSpaceState 测试
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-15 10:00
 **/
public class GetUMemSpaceStateTest {

    private UMEMClient client;

    private GetUMemSpaceStateParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultUMEMClient(new UMEMConfig(
                new Account(System.getenv("UCloudPrivateKey"),
                        System.getenv("UCloudPublicKey"))));
        String region = "cn-sh2";
        String spaceId = "umem-lwzcxbcl";
        param = new GetUMemSpaceStateParam(region, spaceId);
        param.setProjectId("org-izug1m");
    }


    @Test
    public void getUMemSpaceState() {
        try {
            GetUMemSpaceStateResult result = client.getUMemSpaceState(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

}