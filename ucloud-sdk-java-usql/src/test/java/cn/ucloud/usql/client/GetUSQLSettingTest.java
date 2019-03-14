package cn.ucloud.usql.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.usql.model.GetUSQLSettingParam;
import cn.ucloud.usql.model.GetUSQLSettingResult;
import cn.ucloud.usql.pojo.USQLConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;


/**
 * @Description : USQL.GetUSQLSetting 测试
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 07:56
 **/
public class GetUSQLSettingTest {

    private USQLClient client;

    private GetUSQLSettingParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultUSQLClient(new USQLConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        String region = "cn-sh2";
        param = new GetUSQLSettingParam(region);
        param.setProjectId("org-izug1m");
    }


    @Test
    public void getUSQLSetting() {
        try {
            GetUSQLSettingResult result = client.getUSQLSetting(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

}