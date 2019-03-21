package cn.ucloud.pathx.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.pathx.model.CreateCommonUGAInstanceParam;
import cn.ucloud.pathx.model.CreateCommonUGAInstanceResult;
import cn.ucloud.pathx.pojo.PATHXConfig;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertNull;


/**
 * @Description : PATHX.CreateCommonUGAInstance 测试
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 10:02
 **/
public class CreateCommonUGAInstanceTest {

    private PATHXClient client;

    private CreateCommonUGAInstanceParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultPATHXClient(new PATHXConfig(
                new Account(System.getenv("UCloudPrivateKey"),
                        System.getenv("UCloudPublicKey"))));
        String projectId = "org-izug1m";
        Integer quantity = 0;
        String location = "中国";
        String chargeType = "Month";
        String uGAType = "AppStore";
        String name = "sdk-java";
        param = new CreateCommonUGAInstanceParam(projectId, quantity, location, chargeType, uGAType, name);
        List<Integer> tcpPorts = new ArrayList<>();
        tcpPorts.add(8080);
        param.setTcpPorts(tcpPorts);
        param.setDomain("codezhang.cn");
    }


    @Test
    public void createCommonUGAInstance() {
        try {
            CreateCommonUGAInstanceResult result = client.createCommonUGAInstance(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

}