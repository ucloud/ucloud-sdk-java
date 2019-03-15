package cn.ucloud.umem.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


/**
 * @Description : 创建高性能umem内存空间 参数类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-15 10:00
 **/
public class CreateUDredisSpaceParam extends BaseRequestParam {
    /**
     * 地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @UcloudParam("Region")
    @NotEmpty(message = "region can not be empty")
    private String region;
    /**
     * 可用区。参见 [可用区列表](../summary/regionlist.html)
     */
    @UcloudParam("Zone")
    @NotEmpty(message = "zone can not be empty")
    private String zone;
    /**
     * 内存大小, 单位:GB, 范围[1~1024]
     */
    @UcloudParam("Size")
    @NotNull(message = "size can not be null")
    private Integer size;
    /**
     * 空间名称,长度(6<=size<=63)
     */
    @UcloudParam("Name")
    @NotEmpty(message = "name can not be empty")
    private String name;
    /**
     * Year , Month, Dynamic, Trial 默认: Month
     */
    @UcloudParam("ChargeType")
    private String chargeType;
    /**
     * 购买时长 默认: 1
     */
    @UcloudParam("Quantity")
    private Integer quantity;
    /**
     * 协议
     */
    @UcloudParam("Protocol")
    private String protocol;
    /**
     * 使用的代金券id
     */
    @UcloudParam("CouponId")
    private String couponId;


    public CreateUDredisSpaceParam(String region
            , String zone
            , Integer size
            , String name
    ) {
        super("CreateUDredisSpace");
        this.region = region;
        this.zone = zone;
        this.size = size;
        this.name = name;
    }


    public String getRegion() {
        return this.region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getZone() {
        return this.zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public Integer getSize() {
        return this.size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getChargeType() {
        return this.chargeType;
    }

    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
    }

    public Integer getQuantity() {
        return this.quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getProtocol() {
        return this.protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getCouponId() {
        return this.couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }


}