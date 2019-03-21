package cn.ucloud.umem.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.umem.model.CheckRegionResourceParam;
import cn.ucloud.umem.model.CheckRegionResourceResult;
import cn.ucloud.umem.pojo.UMEMConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;


/**
 * @Description : UMEM.CheckRegionResource 测试
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-15 10:00
 **/
public class CheckRegionResourceTest {

    private UMEMClient client;

    private CheckRegionResourceParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultUMEMClient(new UMEMConfig(
                new Account(System.getenv("UCloudPrivateKey"),
                        System.getenv("UCloudPublicKey"))));
        param = new CheckRegionResourceParam();

        param.setProjectId("org-izug1m");
    }


    @Test
    public void checkRegionResource() {
        try {
            CheckRegionResourceResult result = client.checkRegionResource(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

}