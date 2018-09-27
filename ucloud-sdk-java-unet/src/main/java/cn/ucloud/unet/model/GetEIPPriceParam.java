package cn.ucloud.unet.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * @description: 获取弹性IP价格 参数类
 * @author: codezhang
 * @date: 2018-09-27 12:30
 **/

public class GetEIPPriceParam extends BaseRequestParam {

    /**
     * require 地域
     */
    @NotEmpty(message = "region can not be empty")
    @UcloudParam("Region")
    private String region;

    /**
     * require
     * 弹性IP的线路如下:
     * 国际: International BGP:
     * Bgp 各地域允许的线路参数如下:
     * cn-sh1: Bgp
     * cn-sh2: Bgp
     * cn-gd: Bgp
     * cn-bj1:Bgp
     * cn-bj2: Bgp
     * hk: International
     * us-ca:International
     * th-bkk: International
     * kr-seoul:International
     * us-ws:International
     * ge-fra:International
     * sg:International
     * tw-kh:International.其他海外线路均为 International
     */
    @UcloudParam("OperatorName")
    @NotEmpty(message = "operatorName can not be empty")
    private String operatorName;

    /**
     * require 弹性IP的外网带宽, 单位为Mbps, 范围 [0-800]
     */
    @NotNull(message = "bandwidth can not be null")
    @UcloudParam("Bandwidth")
    private Integer bandwidth;


    /**
     * optional 付费方式, 枚举值为: Year, 按年付费; Month, 按月付费; Dynamic, 按需付费(需开启权限);
     * Trial, 试用(需开启权限) 默认为按月付费
     */
    @UcloudParam("ChargeType")
    private String chargeType;


    /**
     * optional 弹性IP的计费模式. 枚举值: "Traffic", 流量计费;
     * "Bandwidth", 带宽计费; "ShareBandwidth",共享带宽模式.
     * 默认为 "Bandwidth".
     */
    @UcloudParam("PayMode")
    private String payMode;

    public GetEIPPriceParam(@NotEmpty(message = "region can not be empty") String region,
                            @NotEmpty(message = "operatorName can not be empty") String operatorName,
                            @NotNull(message = "bandwidth can not be null") Integer bandwidth) {
        super("GetEIPPrice");
        this.region = region;
        this.operatorName = operatorName;
        this.bandwidth = bandwidth;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    public Integer getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
    }

    public String getChargeType() {
        return chargeType;
    }

    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
    }

    public String getPayMode() {
        return payMode;
    }

    public void setPayMode(String payMode) {
        this.payMode = payMode;
    }
}
