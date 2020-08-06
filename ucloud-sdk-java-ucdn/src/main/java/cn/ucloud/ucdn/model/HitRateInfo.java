package cn.ucloud.ucdn.model;

import com.google.gson.annotations.SerializedName;

/**
 * @description:
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2020/8/6 16:37
 */
public class HitRateInfo {
    /**
     * 带宽获取的时间点。格式：时间戳
     */
    @SerializedName("Time")
    private Long time;

    /**
     * 流量命中率，单位%
     */
    @SerializedName("FlowHitRate")
    private Float flowHitRate;

    /**
     * 请求数命中率，单位%
     */
    @SerializedName("RequestHitRate")
    private Float requestHitRate;

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public Float getFlowHitRate() {
        return flowHitRate;
    }

    public void setFlowHitRate(Float flowHitRate) {
        this.flowHitRate = flowHitRate;
    }

    public Float getRequestHitRate() {
        return requestHitRate;
    }

    public void setRequestHitRate(Float requestHitRate) {
        this.requestHitRate = requestHitRate;
    }
}
