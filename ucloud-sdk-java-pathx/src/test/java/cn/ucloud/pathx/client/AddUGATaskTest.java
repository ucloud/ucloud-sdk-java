package cn.ucloud.pathx.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.pathx.model.AddUGATaskParam;
import cn.ucloud.pathx.model.AddUGATaskResult;
import cn.ucloud.pathx.pojo.PATHXConfig;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertNull;


/**
 * @Description : PATHX.AddUGATask 测试
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 10:02
 **/
public class AddUGATaskTest {

    private PATHXClient client;

    private AddUGATaskParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultPATHXClient(new PATHXConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        String projectId = "org-izug1m";
        String uGAId = "uga-gzivmuiu";
        param = new AddUGATaskParam(projectId, uGAId);
        param.setProjectId("org-izug1m");
        List<Integer> tcpPorts = new ArrayList<>();
        tcpPorts.add(222);
        //param.setTcpPorts(tcpPorts);
        param.setUdpPorts(tcpPorts);
    }


    @Test
    public void addUGATask() {
        try {
            AddUGATaskResult result = client.addUGATask(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

}