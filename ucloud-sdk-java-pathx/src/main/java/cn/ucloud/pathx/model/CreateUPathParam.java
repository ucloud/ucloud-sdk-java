package cn.ucloud.pathx.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


/**
 * @Description : 创建UPath 参数类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-08 04:06
 **/
public class CreateUPathParam extends BaseRequestParam {
    /**
     * UPath名字
     */
    @UcloudParam("Name")
    @NotEmpty(message = "name can not be empty")
    private String name;
    /**
     * 线路Id
     */
    @UcloudParam("LineId")
    @NotEmpty(message = "lineId can not be empty")
    private String lineId;
    /**
     * UPath带宽
     */
    @UcloudParam("Bandwidth")
    @NotNull(message = "bandwidth can not be null")
    private Integer bandwidth;
    /**
     * 计费模式
     */
    @UcloudParam("ChargeType")
    @NotEmpty(message = "chargeType can not be empty")
    private String chargeType;
    /**
     * 购买周期
     */
    @UcloudParam("Quantity")
    @NotEmpty(message = "quantity can not be empty")
    private String quantity;
    /**
     * 代金券Id
     */
    @UcloudParam("CouponId")
    private String couponId;


    public CreateUPathParam(String projectId
            , String name
            , String lineId
            , Integer bandwidth
            , String chargeType
            , String quantity
    ) {
        super("CreateUPath");
        this.projectId = projectId;
        this.name = name;
        this.lineId = lineId;
        this.bandwidth = bandwidth;
        this.chargeType = chargeType;
        this.quantity = quantity;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLineId() {
        return this.lineId;
    }

    public void setLineId(String lineId) {
        this.lineId = lineId;
    }

    public Integer getBandwidth() {
        return this.bandwidth;
    }

    public void setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
    }

    public String getChargeType() {
        return this.chargeType;
    }

    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
    }

    public String getQuantity() {
        return this.quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getCouponId() {
        return this.couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }


}