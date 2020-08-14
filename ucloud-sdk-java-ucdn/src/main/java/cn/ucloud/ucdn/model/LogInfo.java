package cn.ucloud.ucdn.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @description:
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2020/8/12 12:15
 */
public class LogInfo {
    /**
     * 日志时间UnixTime
     */
    @SerializedName("Time")
    private Long time;

    /**
     * 国内日志url列表
     */
    @SerializedName("CnLog")
    private List<String> cnLog;

    /**
     * 国外日志url列表
     */
    @SerializedName("AbroadLog")
    private List<String> abroadLog;

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public List<String> getCnLog() {
        return cnLog;
    }

    public void setCnLog(List<String> cnLog) {
        this.cnLog = cnLog;
    }

    public List<String> getAbroadLog() {
        return abroadLog;
    }

    public void setAbroadLog(List<String> abroadLog) {
        this.abroadLog = abroadLog;
    }
}
