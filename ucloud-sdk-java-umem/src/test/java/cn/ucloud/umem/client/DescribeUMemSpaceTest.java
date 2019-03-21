package cn.ucloud.umem.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.umem.model.DescribeUMemSpaceParam;
import cn.ucloud.umem.model.DescribeUMemSpaceResult;
import cn.ucloud.umem.pojo.UMEMConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;


/**
 * @Description : UMEM.DescribeUMemSpace 测试
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-15 10:00
 **/
public class DescribeUMemSpaceTest {

    private UMEMClient client;

    private DescribeUMemSpaceParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultUMEMClient(new UMEMConfig(
                new Account(System.getenv("UCloudPrivateKey"),
                        System.getenv("UCloudPublicKey"))));
        String region = "cn-sh2";
        param = new DescribeUMemSpaceParam(region);
        param.setProjectId("org-izug1m");
        param.setZone("cn-sh2-02");
    }


    @Test
    public void describeUMemSpace() {
        try {
            DescribeUMemSpaceResult result = client.describeUMemSpace(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

}