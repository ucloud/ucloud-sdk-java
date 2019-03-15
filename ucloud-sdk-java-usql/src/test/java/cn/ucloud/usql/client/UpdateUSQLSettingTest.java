package cn.ucloud.usql.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.usql.model.UpdateUSQLSettingParam;
import cn.ucloud.usql.model.UpdateUSQLSettingResult;
import cn.ucloud.usql.pojo.USQLConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;


/**
 * @Description : USQL.UpdateUSQLSetting 测试
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 07:56
 **/
public class UpdateUSQLSettingTest {

    private USQLClient client;

    private UpdateUSQLSettingParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultUSQLClient(new USQLConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        String region = "cn-bj2";
        String outputLocation = "ufile://usql-query-results-izug1m-cn-bj2";
        param = new UpdateUSQLSettingParam(region, outputLocation);
        param.setProjectId("org-izug1m");
    }

    @Test
    public void updateUSQLSetting() {
        try {
            UpdateUSQLSettingResult result = client.updateUSQLSetting(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

}