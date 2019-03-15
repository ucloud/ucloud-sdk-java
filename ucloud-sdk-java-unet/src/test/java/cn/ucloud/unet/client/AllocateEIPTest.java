package cn.ucloud.unet.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.unet.model.AllocateEIPParam;
import cn.ucloud.unet.model.AllocateEIPResult;
import cn.ucloud.unet.pojo.UnetConfig;
import org.junit.Before;
import org.junit.Test;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-27 10:32
 **/
public class AllocateEIPTest {

    private UnetClient client;

    private AllocateEIPParam param;

    @Before
    public void initData() {
        client = new DefaultUnetClient(new UnetConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        param = new AllocateEIPParam("cn-sh2", "Bgp", 2);
        param.setTag("ucloud-sdk-java-test");
        param.setRemark("ucloud-sdk-java-test-eip");
    }

    @Test
    public void allocateEIP() {
        try {
            AllocateEIPResult allocateEIPResult = client.allocateEIP(param);
            JSONComparator.jsonComparator(allocateEIPResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}