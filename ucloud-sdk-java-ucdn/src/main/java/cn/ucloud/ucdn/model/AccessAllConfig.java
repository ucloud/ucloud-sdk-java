package cn.ucloud.ucdn.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @description:
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2020/8/6 18:08
 */
public class AccessAllConfig {
    /**
     * ip黑名单列表 ["1.1.1.1","2.2.2.2"]
     */
    @SerializedName("IpBlackList")
    private List<String> ipBlackList;

    /**
     * Refer配置,参考ReferConf结构
     */
    @SerializedName("ReferConf")
    private List<ReferConf> referConf;

    public List<String> getIpBlackList() {
        return ipBlackList;
    }

    public void setIpBlackList(List<String> ipBlackList) {
        this.ipBlackList = ipBlackList;
    }

    public List<ReferConf> getReferConf() {
        return referConf;
    }

    public void setReferConf(List<ReferConf> referConf) {
        this.referConf = referConf;
    }
}
