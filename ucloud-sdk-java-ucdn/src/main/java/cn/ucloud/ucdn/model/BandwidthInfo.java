package cn.ucloud.ucdn.model;

import com.google.gson.annotations.SerializedName;

/**
 * @description:
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2020/8/6 15:48
 */
public class BandwidthInfo {
    /**
     * 带宽获取的时间点。格式：时间戳
     */
    @SerializedName("Time")
    private Long time;

    /**
     * 返回值返回指定时间区间内CDN的带宽峰值，单位Mbps
     * （如果请求参数Type为0，则Value是五分钟粒度的带宽值，如果Type为1，则Value是1小时的带宽峰值，如果Type为2，则Value是一天内的带宽峰值）
     */
    @SerializedName("CdnBandwidth")
    private Float cdnBandwidth;

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public Float getCdnBandwidth() {
        return cdnBandwidth;
    }

    public void setCdnBandwidth(Float cdnBandwidth) {
        this.cdnBandwidth = cdnBandwidth;
    }
}
