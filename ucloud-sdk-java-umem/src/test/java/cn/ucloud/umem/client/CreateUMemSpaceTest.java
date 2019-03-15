package cn.ucloud.umem.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.umem.model.CreateUMemSpaceParam;
import cn.ucloud.umem.model.CreateUMemSpaceResult;
import cn.ucloud.umem.pojo.UMEMConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;


/**
 * @Description : UMEM.CreateUMemSpace 测试
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-15 10:00
 **/
public class CreateUMemSpaceTest {

    private UMEMClient client;

    private CreateUMemSpaceParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultUMEMClient(new UMEMConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        String region = "cn-sh2";
        String zone = "cn-sh2-02";
        Integer size = 16;
        String name = "sdk-java2";
        param = new CreateUMemSpaceParam(region, size, name,zone);
        param.setProjectId("org-izug1m");
    }


    @Test
    public void createUMemSpace() {
        try {
            CreateUMemSpaceResult result = client.createUMemSpace(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

}