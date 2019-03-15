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
        Integer size = 1;
        String name = "sdk-java";
        param = new CreateUMemSpaceParam(region, size, name);
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