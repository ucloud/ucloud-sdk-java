package cn.ucloud.ucdn.model;

import com.google.gson.annotations.SerializedName;

/**
 * @description:
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2020/8/12 12:34
 */
public class UcdnDomainTrafficInfo {
    /**
     * 流量获取的时间点，格式为Unix Timestamp
     */
    @SerializedName("Time")
    private Long time;

    /**
     * 查询每日流量总值，单位：GB
     */
    @SerializedName("Value")
    private Float value;

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public Float getValue() {
        return value;
    }

    public void setValue(Float value) {
        this.value = value;
    }
}
