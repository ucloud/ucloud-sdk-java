package cn.ucloud.umem.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.umem.model.CreateUDredisSpaceParam;
import cn.ucloud.umem.model.CreateUDredisSpaceResult;
import cn.ucloud.umem.pojo.UMEMConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;


/**
 * @Description : UMEM.CreateUDredisSpace 测试
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-15 10:00
 **/
public class CreateUDredisSpaceTest {

    private UMEMClient client;

    private CreateUDredisSpaceParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultUMEMClient(new UMEMConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        String region = "cn-sh2";
        String zone = "cn-sh2";
        Integer size = 1;
        String name = "cn-sh2";
        param = new CreateUDredisSpaceParam(region, zone, size, name);
        param.setProjectId("org-izug1m");
    }


    @Test
    public void createUDredisSpace() {
        try {
            CreateUDredisSpaceResult result = client.createUDredisSpace(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

}