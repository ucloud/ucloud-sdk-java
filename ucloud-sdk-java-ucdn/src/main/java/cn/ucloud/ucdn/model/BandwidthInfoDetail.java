package cn.ucloud.ucdn.model;

import com.google.gson.annotations.SerializedName;

/**
 * @description:
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2020/8/6 15:48
 */
public class BandwidthInfoDetail {
    /**
     * 带宽获取的时间点。格式：时间戳
     */
    @SerializedName("Time")
    private Long time;

    /**
     * 返回值带宽值数据。
     */
    @SerializedName("Bandwidth")
    private Float bandwidth;

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public Float getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(Float bandwidth) {
        this.bandwidth = bandwidth;
    }
}
