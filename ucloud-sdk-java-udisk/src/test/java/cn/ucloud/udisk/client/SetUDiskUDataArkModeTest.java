package cn.ucloud.udisk.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.udisk.model.SetUDiskUDataArkModeParam;
import cn.ucloud.udisk.model.SetUDiskUDataArkModeResult;
import cn.ucloud.udisk.pojo.UdiskConfig;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertNull;

/**
 * @description:
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2018/9/26 18:01
 */
public class SetUDiskUDataArkModeTest {
    private UdiskClient client;

    private SetUDiskUDataArkModeParam param;

    @Before
    public void initData() {
        client = new DefaultUdiskClient(new UdiskConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        param = new SetUDiskUDataArkModeParam("cn-sh2", "cn-sh2-01", "bs-4qfrwv","org-4nfe1i",
                "Yes");
    }

    @Test
    public void setUDiskUDataArkMode() {
        try {
            SetUDiskUDataArkModeResult result = client.setUDiskUDataArkMode(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Ignore
    @Test
    public void setUDiskUDataArkModeCallback() {
        client.setUDiskUDataArkMode(param, new UcloudHandler<SetUDiskUDataArkModeResult>() {
            @Override
            public Object success(SetUDiskUDataArkModeResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(SetUDiskUDataArkModeResult result) {
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
