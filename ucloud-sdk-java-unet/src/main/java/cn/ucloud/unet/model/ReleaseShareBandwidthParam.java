package cn.ucloud.unet.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * @description: 释放共享带宽 参数类
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2018/9/27 17:48
 */
public class ReleaseShareBandwidthParam extends BaseRequestParam {
    /**
     * require 地域
     */
    @NotEmpty(message = "region can not be empty")
    @UcloudParam("Region")
    private String region;

    /**
     * require 共享带宽ID
     */
    @NotEmpty(message = "shareBandwidthId can not be empty")
    @UcloudParam("ShareBandwidthId")
    private String shareBandwidthId;

    /**
     * require 关闭共享带宽后，各EIP恢复为的带宽值
     */
    @NotNull(message = "eIPBandwidth can not be empty")
    @UcloudParam("EIPBandwidth")
    private Integer eIPBandwidth;

    /**
     * optional Bandwidth 带宽计费, Traffic 转流量计费
     */
    @UcloudParam("PayMode")
    private String payMode;

    public ReleaseShareBandwidthParam(@NotEmpty(message = "region can not be empty") String region,
                                      @NotEmpty(message = "shareBandwidthId can not be empty") String shareBandwidthId,
                                      @NotNull(message = "eIPBandwidth can not be empty") Integer eIPBandwidth) {
        super("ReleaseShareBandwidth");
        this.region = region;
        this.shareBandwidthId = shareBandwidthId;
        this.eIPBandwidth = eIPBandwidth;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getShareBandwidthId() {
        return shareBandwidthId;
    }

    public void setShareBandwidthId(String shareBandwidthId) {
        this.shareBandwidthId = shareBandwidthId;
    }

    public Integer geteIPBandwidth() {
        return eIPBandwidth;
    }

    public void seteIPBandwidth(Integer eIPBandwidth) {
        this.eIPBandwidth = eIPBandwidth;
    }

    public String getPayMode() {
        return payMode;
    }

    public void setPayMode(String payMode) {
        this.payMode = payMode;
    }
}
