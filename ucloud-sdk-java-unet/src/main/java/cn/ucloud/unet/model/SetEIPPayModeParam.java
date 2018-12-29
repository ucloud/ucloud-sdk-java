package cn.ucloud.unet.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * @description: 设置弹性IP计费方式 参数类
 * 设置弹性IP计费模式, 切换时会涉及付费/退费.
 * @author: codezhang
 * @date: 2018-09-27 14:25
 **/

public class SetEIPPayModeParam extends BaseRequestParam {

    /**
     * require 地域
     */
    @NotEmpty(message = "region can not be empty")
    @UcloudParam("Region")
    private String region;

    /**
     * require EIP资源ID
     */
    @NotEmpty(message = "eipId can not be empty")
    @UcloudParam("EIPId")
    private String eipId;

    /**
     * require 弹性IP的计费模式. 枚举值: "Traffic", 流量计费;
     * "Bandwidth", 带宽计费; "ShareBandwidth",共享带宽模式.
     * 默认为 "Bandwidth".
     */
    @NotEmpty(message = "payMode can not be empty")
    @UcloudParam("PayMode")
    private String payMode;

    /**
     * require 弹性IP的外网带宽, 单位为Mbps. 共享带宽模式必须指定0M带宽,
     * 非共享带宽模式必须指定非0Mbps带宽.
     * 各地域非共享带宽的带宽范围如下： 流量计费[1-200]，带宽计费[1-800]
     */
    @NotNull(message = "bandwidth can not be null")
    @UcloudParam("Bandwidth")
    private Integer bandwidth;


    public SetEIPPayModeParam(@NotEmpty(message = "region can not be empty") String region,
                              @NotEmpty(message = "eipId can not be empty") String eipId,
                              @NotEmpty(message = "payMode can not be empty") String payMode,
                              @NotNull(message = "bandwidth can not be null") Integer bandwidth) {
        super("SetEIPPayMode");
        this.region = region;
        this.eipId = eipId;
        this.payMode = payMode;
        this.bandwidth = bandwidth;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getEipId() {
        return eipId;
    }

    public void setEipId(String eipId) {
        this.eipId = eipId;
    }

    public String getPayMode() {
        return payMode;
    }

    public void setPayMode(String payMode) {
        this.payMode = payMode;
    }

    public Integer getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
    }
}
