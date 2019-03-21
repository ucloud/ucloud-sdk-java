package cn.ucloud.udb.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.udb.pojo.UDBConfig;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-03-05 15:09
 **/
public class GetUDBClient {

    public static UDBClient getUDBClient() {
        return new DefaultUDBClient(new UDBConfig(
                new Account(System.getenv("UCloudPrivateKey"),
                        System.getenv("UCloudPublicKey"))));
    }
}
