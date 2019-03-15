package cn.ucloud.umem.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.umem.model.CheckUDredisSpaceAllowanceParam;
import cn.ucloud.umem.model.CheckUDredisSpaceAllowanceResult;
import cn.ucloud.umem.pojo.UMEMConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;


/**
 * @Description : UMEM.CheckUDredisSpaceAllowance 测试
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-15 10:00
 **/
public class CheckUDredisSpaceAllowanceTest {

    private UMEMClient client;

    private CheckUDredisSpaceAllowanceParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultUMEMClient(new UMEMConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        String region = "cn-sh2";
        String zone = "cn-sh2-02";
        Integer size = 2;
        Integer count = 10;
        param = new CheckUDredisSpaceAllowanceParam(region, zone, size, count);
        param.setProjectId("org-izug1m");
    }


    @Test
    public void checkUDredisSpaceAllowance() {
        try {
            CheckUDredisSpaceAllowanceResult result = client.checkUDredisSpaceAllowance(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

}