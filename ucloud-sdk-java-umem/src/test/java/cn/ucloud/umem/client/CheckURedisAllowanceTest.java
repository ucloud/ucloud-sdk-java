package cn.ucloud.umem.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.umem.model.CheckURedisAllowanceParam;
import cn.ucloud.umem.model.CheckURedisAllowanceResult;
import cn.ucloud.umem.pojo.UMEMConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;


/**
 * @Description : UMEM.CheckURedisAllowance 测试
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-15 10:00
 **/
public class CheckURedisAllowanceTest {

    private UMEMClient client;

    private CheckURedisAllowanceParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultUMEMClient(new UMEMConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        String region = "cn-sh2";
        String zone = "cn-sh2-02";
        Integer size = 2;
        Integer count = 1;
        param = new CheckURedisAllowanceParam(region, zone, size, count);
        param.setProjectId("org-izug1m");
    }


    @Test
    public void checkURedisAllowance() {
        try {
            CheckURedisAllowanceResult result = client.checkURedisAllowance(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

}