package cn.ucloud.pathx.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.common.util.JSONComparator;
import cn.ucloud.pathx.model.ModifyUPathTemplateParam;
import cn.ucloud.pathx.model.ModifyUPathTemplateResult;
import cn.ucloud.pathx.pojo.PATHXConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;


/**
 * @Description : PATHX.ModifyUPathTemplate 测试
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-07 04:19
 **/
public class ModifyUPathTemplateTest {

    private PATHXClient client;

    private ModifyUPathTemplateParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultPATHXClient(new PATHXConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        String projectId = "cn-sh2";
        param = new ModifyUPathTemplateParam(projectId);
        param.setProjectId("org-izug1m");
    }


    @Test
    public void modifyUPathTemplate() {
        try {
            ModifyUPathTemplateResult result = client.modifyUPathTemplate(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

    @Test
    public void modifyUPathTemplateCallback() {
        client.modifyUPathTemplate(param, new UcloudHandler
                <ModifyUPathTemplateResult>() {
            @Override
            public Object success(ModifyUPathTemplateResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(ModifyUPathTemplateResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object error(Exception e) {
                assertNull(e);
                return null;
            }
        }, false);
    }
}