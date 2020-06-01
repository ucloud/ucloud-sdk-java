package cn.ucloud.unet.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.unet.pojo.UnetConfig;

/**
 * UnetClient的工厂类
 *
 * @author jucyfer
 */
public abstract class UnetClients {
    /**
     * * 工厂方法，生成一个默认的UnetClient实现
     *
     * @param account Account对象，包含publicKey和privateKey
     * @return 当前采用DefaultUnetClient默认实现
     */
    public static UnetClient getDefaultInstance(Account account) {
        return new DefaultUnetClient(new UnetConfig(account));
    }

    /**
     * * 工厂方法，生成一个默认的UnetClient实现
     *
     * @param privateKey privateKey字符串
     * @param publicKey  privateKey字符串
     * @return 当前采用DefaultUnetClient默认实现
     */
    public static UnetClient getDefaultInstance(String privateKey, String publicKey) {
        return new DefaultUnetClient(new UnetConfig(new Account(privateKey, publicKey)));
    }

    /**
     * * 工厂方法，生成一个默认的UnetClient实现
     *
     * @param config UnetConfig对象
     * @return 当前采用DefaultUnetClient默认实现
     */
    public static UnetClient getDefaultInstance(UnetConfig config) {
        return new DefaultUnetClient(config);
    }
}
