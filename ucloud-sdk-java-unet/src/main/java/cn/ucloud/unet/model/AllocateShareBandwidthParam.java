package cn.ucloud.unet.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * @description: 开通共享带宽 参数类
 * @author: codezhang
 * @date: 2018-09-27 16:40
 **/

public class AllocateShareBandwidthParam extends BaseRequestParam {

    /**
     * require 地域
     */
    @NotEmpty(message = "region can not be empty")
    @UcloudParam("Region")
    private String region;

    /**
     * require 共享带宽名字
     */
    @NotEmpty(message = "name can not be empty")
    @UcloudParam("Name")
    private String name;


    /**
     * require 付费方式:Year 按年,Month 按月,Dynamic 按时;
     */
    @NotEmpty(message = "chargeType can not be empty")
    @UcloudParam("ChargeType")
    private String chargeType;


    /**
     * require 共享带宽值
     */
    @NotNull(message = "shareBandwidth can not be null")
    @UcloudParam("ShareBandwidth")
    private Integer shareBandwidth;

    /**
     * optional 购买时长
     */
    @UcloudParam("Quantity")
    private Integer quantity;

    /**
     * optional 共享带宽保底值(后付费)
     */
    @UcloudParam("ShareBandwidthGuarantee")
    private Integer shareBandwidthGuarantee;

    public AllocateShareBandwidthParam(@NotEmpty(message = "region can not be empty") String region,
                                       @NotEmpty(message = "name can not be empty") String name,
                                       @NotEmpty(message = "chargeType can not be empty") String chargeType,
                                       @NotNull(message = "shareBandwidth can not be null") Integer shareBandwidth) {
        super("AllocateShareBandwidth");
        this.region = region;
        this.name = name;
        this.chargeType = chargeType;
        this.shareBandwidth = shareBandwidth;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getChargeType() {
        return chargeType;
    }

    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
    }

    public Integer getShareBandwidth() {
        return shareBandwidth;
    }

    public void setShareBandwidth(Integer shareBandwidth) {
        this.shareBandwidth = shareBandwidth;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getShareBandwidthGuarantee() {
        return shareBandwidthGuarantee;
    }

    public void setShareBandwidthGuarantee(Integer shareBandwidthGuarantee) {
        this.shareBandwidthGuarantee = shareBandwidthGuarantee;
    }
}
