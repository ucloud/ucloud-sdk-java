package cn.ucloud.client;

import cn.ucloud.model.TerminateCustomImageParam;
import cn.ucloud.pojo.Account;
import cn.ucloud.pojo.UhostConfig;
import org.junit.Before;
import org.junit.Test;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-18 16:58
 **/
public class TerminateCustomImageTest {

    private UhostClient client;

    private TerminateCustomImageParam param;

    @Before
    public void initData() {
        client = new DefaultUhostClient(new UhostConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        param = new TerminateCustomImageParam("cn-bj2","xxx");
    }

    @Test
    public void terminateCustomImage() {
        // todo 测试
    }
}