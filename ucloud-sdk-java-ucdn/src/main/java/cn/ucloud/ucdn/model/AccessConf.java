package cn.ucloud.ucdn.model;

import com.google.gson.annotations.SerializedName;

/**
 * @description:
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2020/8/6 14:18
 */
public class AccessConf {
    /**
     * 多个ip用逗号隔开
     */
    @SerializedName("IpBlacklist")
    private String ipBlackList;

    public String getIpBlackList() {
        return ipBlackList;
    }

    public void setIpBlackList(String ipBlackList) {
        this.ipBlackList = ipBlackList;
    }
}
