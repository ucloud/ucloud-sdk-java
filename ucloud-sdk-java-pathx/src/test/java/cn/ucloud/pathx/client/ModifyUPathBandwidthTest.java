package cn.ucloud.pathx.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.pathx.model.ModifyUPathBandwidthParam;
import cn.ucloud.pathx.model.ModifyUPathBandwidthResult;
import cn.ucloud.pathx.pojo.PATHXConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;


/**
 * @Description : PATHX.ModifyUPathBandwidth 测试
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 10:02
 **/
public class ModifyUPathBandwidthTest {

    private PATHXClient client;

    private ModifyUPathBandwidthParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultPATHXClient(new PATHXConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        String projectId = "cn-sh2";
        String uPathId = "cn-sh2";
        String bandwidth = "cn-sh2";
        param = new ModifyUPathBandwidthParam(projectId, uPathId, bandwidth);
        param.setProjectId("org-izug1m");
    }


    @Test
    public void modifyUPathBandwidth() {
        try {
            ModifyUPathBandwidthResult result = client.modifyUPathBandwidth(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

}