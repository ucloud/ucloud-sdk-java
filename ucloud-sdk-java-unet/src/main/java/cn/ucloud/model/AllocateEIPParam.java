package cn.ucloud.model;

import cn.ucloud.annotation.UcloudParam;
import cn.ucloud.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-27 10:10
 **/

public class AllocateEIPParam extends BaseRequestParam {
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
     * require 弹性IP的外网带宽, 单位为Mbps. 共享带宽模式必须指定0M带宽,
     * 非共享带宽模式必须指定非0Mbps带宽.
     * 各地域非共享带宽的带宽范围如下： 流量计费[1-200]，带宽计费[1-800]
     */
    @UcloudParam("Bandwidth")
    private Integer bandwidth;

    /**
     * optional 业务组名称, 默认为 "Default"
     */
    @UcloudParam("Tag")
    private String tag;

    /**
     * optional 付费方式, 枚举值为: Year, 按年付费; Month, 按月付费; Dynamic, 按需付费(需开启权限);
     * Trial, 试用(需开启权限) 默认为按月付费
     */
    @UcloudParam("ChargeType")
    private String chargeType;

    /**
     * optional 购买时长, 默认: 1
     */
    @UcloudParam("Quantity")
    private Integer quantity;

    /**
     * optional 弹性IP的计费模式. 枚举值: "Traffic", 流量计费;
     * "Bandwidth", 带宽计费; "ShareBandwidth",共享带宽模式.
     * 默认为 "Bandwidth".
     */
    @UcloudParam("PayMode")
    private String payMode;

    /**
     * optional 绑定的共享带宽Id，仅当PayMode为ShareBandwidth时有效
     */
    @UcloudParam("ShareBandwidthId")
    private String shareBandwidthId;

    /**
     * optional 弹性IP的名称, 默认为 "EIP"
     */
    @UcloudParam("Name")
    private String name;

    /**
     * optional 弹性IP的备注, 默认为空
     */
    @UcloudParam("Remark")
    private String remark;

    /**
     * optional 代金券ID, 默认不使用
     */
    @UcloudParam("CouponId")
    private String couponId;

    public AllocateEIPParam(@NotEmpty(message = "region can not be empty") String region,
                            @NotEmpty(message = "operatorName can not be empty") String operatorName,
                            Integer bandwidth) {
        super("AllocateEIP");
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

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getChargeType() {
        return chargeType;
    }

    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getPayMode() {
        return payMode;
    }

    public void setPayMode(String payMode) {
        this.payMode = payMode;
    }

    public String getShareBandwidthId() {
        return shareBandwidthId;
    }

    public void setShareBandwidthId(String shareBandwidthId) {
        this.shareBandwidthId = shareBandwidthId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }
}
