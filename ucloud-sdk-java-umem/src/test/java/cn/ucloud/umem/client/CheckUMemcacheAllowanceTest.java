package cn.ucloud.umem.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.umem.model.CheckUMemcacheAllowanceParam;
import cn.ucloud.umem.model.CheckUMemcacheAllowanceResult;
import cn.ucloud.umem.pojo.UMEMConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;


/**
 * @Description : UMEM.CheckUMemcacheAllowance 测试
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-15 10:00
 **/
public class CheckUMemcacheAllowanceTest {

    private UMEMClient client;

    private CheckUMemcacheAllowanceParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultUMEMClient(new UMEMConfig(
                new Account(System.getenv("UCloudPrivateKey"),
                        System.getenv("UCloudPublicKey"))));
        String region = "cn-sh2";
        String zone = "cn-sh2-02";
        Integer size = 16;
        Integer count = 10;
        param = new CheckUMemcacheAllowanceParam(region, zone, size, count);
        param.setProjectId("org-izug1m");
    }


    @Test
    public void checkUMemcacheAllowance() {
        try {
            CheckUMemcacheAllowanceResult result = client.checkUMemcacheAllowance(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

}