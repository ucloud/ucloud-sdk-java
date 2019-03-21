package cn.ucloud.pathx.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.pathx.model.DeleteUGATaskParam;
import cn.ucloud.pathx.model.DeleteUGATaskResult;
import cn.ucloud.pathx.pojo.PATHXConfig;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertNull;


/**
 * @Description : PATHX.DeleteUGATask 测试
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 10:02
 **/
public class DeleteUGATaskTest {

    private PATHXClient client;

    private DeleteUGATaskParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultPATHXClient(new PATHXConfig(
                new Account(System.getenv("UCloudPrivateKey"),
                        System.getenv("UCloudPublicKey"))));
        String projectId = "org-izug1m";
        String uGAId = "uga-gzivmuiu";
        param = new DeleteUGATaskParam(projectId, uGAId);
        List<Integer> udpPorts = new ArrayList<>();
        udpPorts.add(222);
        param.setUdpPorts(udpPorts);
    }


    @Test
    public void deleteUGATask() {
        try {
            DeleteUGATaskResult result = client.deleteUGATask(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

}