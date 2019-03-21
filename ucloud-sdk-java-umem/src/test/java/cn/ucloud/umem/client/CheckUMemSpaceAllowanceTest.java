package cn.ucloud.umem.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.umem.model.CheckUMemSpaceAllowanceParam;
import cn.ucloud.umem.model.CheckUMemSpaceAllowanceResult;
import cn.ucloud.umem.pojo.UMEMConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;


/**
 * @Description : UMEM.CheckUMemSpaceAllowance 测试
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-15 10:00
 **/
public class CheckUMemSpaceAllowanceTest {

    private UMEMClient client;

    private CheckUMemSpaceAllowanceParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultUMEMClient(new UMEMConfig(
                new Account(System.getenv("UCloudPrivateKey"),
                        System.getenv("UCloudPublicKey"))));
        String region = "cn-sh2";
        String zone = "cn-sh2-02";
        Integer size = 16;
        Integer count = 10;
        param = new CheckUMemSpaceAllowanceParam(region, zone, size, count);
        param.setProjectId("org-izug1m");
    }


    @Test
    public void checkUMemSpaceAllowance() {
        try {
            CheckUMemSpaceAllowanceResult result = client.checkUMemSpaceAllowance(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

}