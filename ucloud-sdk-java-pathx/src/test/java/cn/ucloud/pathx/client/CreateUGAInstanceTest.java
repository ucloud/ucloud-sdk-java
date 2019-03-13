package cn.ucloud.pathx.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.pathx.model.CreateUGAInstanceParam;
import cn.ucloud.pathx.model.CreateUGAInstanceResult;
import cn.ucloud.pathx.pojo.PATHXConfig;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertNull;


/**
 * @Description : PATHX.CreateUGAInstance 测试
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-12 04:27
 **/
public class CreateUGAInstanceTest {

    private PATHXClient client;

    private CreateUGAInstanceParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultPATHXClient(new PATHXConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        String projectId = "org-izug1m";
        String name = "sdk-java-test";
        List<Integer> tcpPorts = new ArrayList<>();
        tcpPorts.add(80);
        param = new CreateUGAInstanceParam(projectId, name);
        param.setTcpPorts(tcpPorts);
        param.setDomain("codezhang.cn");
    }


    @Test
    public void createUGAInstance() {
        try {
            CreateUGAInstanceResult result = client.createUGAInstance(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

}