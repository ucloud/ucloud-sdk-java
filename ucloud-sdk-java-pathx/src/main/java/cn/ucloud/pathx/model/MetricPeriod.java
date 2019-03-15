package cn.ucloud.pathx.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;


/**
 * @Description : 一段时间内的监控数据 模型类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 10:02
 **/
public class MetricPeriod {
    /**
     * 出口带宽
     */
    @SerializedName("NetworkOut")
    private List<MatricPoint> networkOut;
    /**
     * 入口带宽
     */
    @SerializedName("NetworkIn")
    private List<MatricPoint> networkIn;
    /**
     * 出口使用率
     */
    @SerializedName("NetworkOutUsage")
    private List<MatricPoint> networkOutUsage;
    /**
     * 入口使用率
     */
    @SerializedName("NetworkInUsage")
    private List<MatricPoint> networkInUsage;
    /**
     *
     */
    @SerializedName("BandIn")
    private List<MatricPoint> bandIn;
    /**
     *
     */
    @SerializedName("BandOut")
    private List<MatricPoint> bandOut;


    public List<MatricPoint> getNetworkOut() {
        return this.networkOut;
    }

    public void setNetworkOut(List<MatricPoint> networkOut) {
        this.networkOut = networkOut;
    }


    public List<MatricPoint> getNetworkIn() {
        return this.networkIn;
    }

    public void setNetworkIn(List<MatricPoint> networkIn) {
        this.networkIn = networkIn;
    }


    public List<MatricPoint> getNetworkOutUsage() {
        return this.networkOutUsage;
    }

    public void setNetworkOutUsage(List<MatricPoint> networkOutUsage) {
        this.networkOutUsage = networkOutUsage;
    }


    public List<MatricPoint> getNetworkInUsage() {
        return this.networkInUsage;
    }

    public void setNetworkInUsage(List<MatricPoint> networkInUsage) {
        this.networkInUsage = networkInUsage;
    }


    public List<MatricPoint> getBandIn() {
        return this.bandIn;
    }

    public void setBandIn(List<MatricPoint> bandIn) {
        this.bandIn = bandIn;
    }


    public List<MatricPoint> getBandOut() {
        return this.bandOut;
    }

    public void setBandOut(List<MatricPoint> bandOut) {
        this.bandOut = bandOut;
    }


}