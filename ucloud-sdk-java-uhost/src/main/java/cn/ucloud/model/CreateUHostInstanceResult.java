package cn.ucloud.model;

import cn.ucloud.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @description: 创建云主机结果类
 * @author: codezhang
 * @date: 2018-09-17 17:29
 **/

public class CreateUHostInstanceResult extends BaseResponseResult {
    /**
     * UHost实例Id集合；实际上只会有一个
     */
    @SerializedName("UHostIds")
    private List<String> uhostIds;

    /**
     * IP信息
     */
    @SerializedName("IPs")
    private List<String> ips;

    public List<String> getUhostIds() {
        return uhostIds;
    }

    public void setUhostIds(List<String> uhostIds) {
        this.uhostIds = uhostIds;
    }

    public List<String> getIps() {
        return ips;
    }

    public void setIps(List<String> ips) {
        this.ips = ips;
    }

    @Override
    public String toString() {
        return "CreateUHostInstanceResult{" +
                "uhostIds=" + uhostIds +
                ", ips=" + ips +
                ", retCode=" + retCode +
                ", action='" + action + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
