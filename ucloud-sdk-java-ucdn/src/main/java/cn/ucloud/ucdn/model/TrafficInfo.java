package cn.ucloud.ucdn.model;

import com.google.gson.annotations.SerializedName;

/**
 * @description:
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2020/8/12 12:47
 */
public class TrafficInfo {
    /**
     * 购买流量的区域, cn: 国内; abroad: 国外
     */
    @SerializedName("Areacode")
    private String areaCode;

    /**
     * Areacode区域内总购买流量, 单位GB
     */
    @SerializedName("TrafficTotal")
    private Float trafficTotal;

    /**
     * Areacode区域内总剩余流量, 单位GB
     */
    @SerializedName("TrafficLeft")
    private Float trafficLeft;

    /**
     * Areacode区域内总使用流量, 单位GB
     */
    @SerializedName("TrafficUsed")
    private Float trafficUsed;

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public Float getTrafficTotal() {
        return trafficTotal;
    }

    public void setTrafficTotal(Float trafficTotal) {
        this.trafficTotal = trafficTotal;
    }

    public Float getTrafficLeft() {
        return trafficLeft;
    }

    public void setTrafficLeft(Float trafficLeft) {
        this.trafficLeft = trafficLeft;
    }

    public Float getTrafficUsed() {
        return trafficUsed;
    }

    public void setTrafficUsed(Float trafficUsed) {
        this.trafficUsed = trafficUsed;
    }
}
