package cn.ucloud.ubill.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.ubill.pojo.UBillConfig;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2020年02月13日12:03:15
 **/
public class GetUBillClient {

    public static UBillClient getUBillClient() {
        return new DefaultUBillClient(new UBillConfig(
                new Account(System.getenv("UCloudPrivateKey"),
                        System.getenv("UCloudPublicKey"))));
    }
}
