package cn.ucloud.udb.client;

import cn.ucloud.udb.pojo.UDBConfig;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-03-01 10:50
 **/
public class DefaultUDBClient {//extends DefaultUcloudClient implements UDBClient {
    /**
     * UDB 配置参数
     */
    private UDBConfig config;

    public DefaultUDBClient(UDBConfig config) {
        //super(config);
        this.config = config;
    }
}
