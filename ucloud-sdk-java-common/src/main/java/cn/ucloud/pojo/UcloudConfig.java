package cn.ucloud.pojo;

/**
 * @description: 环境配置参数对象
 * @author: codezhang
 * @date: 2018-09-13 19:19
 **/

public class UcloudConfig {

    /**
     * client的账户信息
     */
    private Account account;

    private String apiServerAddr ="https://api.ucloud.cn";

    public UcloudConfig(Account account) {
        this.account = account;
    }

    public Account getAccount() {
        return account;
    }

    public String getApiServerAddr() {
        return apiServerAddr;
    }
}
