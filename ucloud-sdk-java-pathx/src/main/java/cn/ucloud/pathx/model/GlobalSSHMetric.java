package cn.ucloud.pathx.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;


/**
 * @Description : GlobalSSH一段时间内的带宽监控数据 模型类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 10:02
 **/
public class GlobalSSHMetric {
    /**
     * 出向带宽
     */
    @SerializedName("NetworkOut")
    private List<MatricPoint> networkOut;
    /**
     * 入向带宽
     */
    @SerializedName("NetworkIn")
    private List<MatricPoint> networkIn;


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


}