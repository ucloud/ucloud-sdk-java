package cn.ucloud.pathx.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.pathx.model.InsertPathXWhitelistParam;
import cn.ucloud.pathx.model.InsertPathXWhitelistResult;
import cn.ucloud.pathx.model.PathXWhitelist;
import cn.ucloud.pathx.pojo.PATHXConfig;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertNull;


/**
 * @Description : PATHX.InsertPathXWhitelist 测试
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 10:02
 **/
public class InsertPathXWhitelistTest {

    private PATHXClient client;

    private InsertPathXWhitelistParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultPATHXClient(new PATHXConfig(
                new Account(System.getenv("UCloudPrivateKey"),
                        System.getenv("UCloudPublicKey"))));
        String projectId = "org-o1ftjk";
        String instanceId = "uga-bq14khi3";
        List<PathXWhitelist> whitelists = new ArrayList<>();
        whitelists.add(new PathXWhitelist("192.168.1.2","tcp","23"));
        param = new InsertPathXWhitelistParam(projectId, instanceId,whitelists);
    }


    @Test
    public void insertPathXWhitelist() {
        try {
            InsertPathXWhitelistResult result = client.insertPathXWhitelist(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

}