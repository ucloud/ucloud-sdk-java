package cn.ucloud.ucdn.model;

import com.google.gson.annotations.SerializedName;

/**
 * @description:
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2020/8/6 17:41
 */
public class RequestInfo {
    /**
     * 带宽获取的时间点。格式：时间戳
     */
    @SerializedName("Time")
    private Long time;

    /**
     * 返回值返回指定时间区间内的cdn收到的请求次数之和
     */
    @SerializedName("CdnRequest")
    private Float cdnRequest;

    /**
     * 返回值返回指定时间区间内的cdn回源的请求次数之和
     */
    @SerializedName("OriginRequest")
    private Float originRequest;

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public Float getCdnRequest() {
        return cdnRequest;
    }

    public void setCdnRequest(Float cdnRequest) {
        this.cdnRequest = cdnRequest;
    }

    public Float getOriginRequest() {
        return originRequest;
    }

    public void setOriginRequest(Float originRequest) {
        this.originRequest = originRequest;
    }
}
