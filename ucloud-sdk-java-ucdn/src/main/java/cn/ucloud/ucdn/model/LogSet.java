package cn.ucloud.ucdn.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @description:
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2020/8/12 12:14
 */
public class LogSet {
    /**
     * 域名
     */
    @SerializedName("Domain")
    private String domain;

    /**
     * 域名信息列表，参考{@link LogSetInfo}
     */
    @SerializedName("Logs")
    private List<LogInfo> logs;

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public List<LogInfo> getLogs() {
        return logs;
    }

    public void setLogs(List<LogInfo> logs) {
        this.logs = logs;
    }
}
