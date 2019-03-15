package cn.ucloud.umem.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.umem.model.ResizeUMemSpaceParam;
import cn.ucloud.umem.model.ResizeUMemSpaceResult;
import cn.ucloud.umem.pojo.UMEMConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;


/**
 * @Description : UMEM.ResizeUMemSpace 测试
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-15 10:00
 **/
public class ResizeUMemSpaceTest {

    private UMEMClient client;

    private ResizeUMemSpaceParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultUMEMClient(new UMEMConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        String region = "cn-sh2";
        String spaceId = "umem-lwzcxbcl";
        Integer size = 18;
        param = new ResizeUMemSpaceParam(region, spaceId, size);
        param.setProjectId("org-izug1m");
    }


    @Test
    public void resizeUMemSpace() {
        try {
            ResizeUMemSpaceResult result = client.resizeUMemSpace(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

}