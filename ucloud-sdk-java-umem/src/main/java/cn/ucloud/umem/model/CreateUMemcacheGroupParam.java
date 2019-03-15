package cn.ucloud.umem.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;


/**
 * @Description : 创建单机Memcache 参数类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-15 10:00
 **/
public class CreateUMemcacheGroupParam extends BaseRequestParam {
    /**
     * 地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @UcloudParam("Region")
    @NotEmpty(message = "region can not be empty")
    private String region;
    /**
     * 可用区。参见 [可用区列表](../summary/regionlist.html)
     */
    @NotEmpty(message = "zone can not be empty")
    @UcloudParam("Zone")
    private String zone;
    /**
     * 请求创建组的名称 范围[6-60]
     */
    @UcloudParam("Name")
    @NotEmpty(message = "name can not be empty")
    private String name;
    /**
     * 每个节点的内存大小,单位GB,默认1GB 目前仅支持1/2/4/8/16/32这几档
     */
    @UcloudParam("Size")
    private Integer size;
    /**
     * 配置ID,目前仅支持默认配置id 默认配置id:"9a891891-c245-4b66-bce8-67e59430d67c"
     */
    @UcloudParam("ConfigId")
    private String configId;
    /**
     * Memcache版本信息,默认为1.4.31
     */
    @UcloudParam("Version")
    private String version;
    /**
     * 计费模式，Year , Month, Dynamic 默认: Month
     */
    @UcloudParam("ChargeType")
    private String chargeType;
    /**
     * 购买时长，默认为1
     */
    @UcloudParam("Quantity")
    private Integer quantity;
    /**
     * 业务组 默认：Default
     */
    @UcloudParam("Tag")
    private String tag;
    /**
     *
     */
    @UcloudParam("Protocol")
    private String protocol;
    /**
     * 代金券ID
     */
    @UcloudParam("CouponId")
    private String couponId;


    public CreateUMemcacheGroupParam(String region
            , String name,String zone
    ) {
        super("CreateUMemcacheGroup");
        this.region = region;
        this.name = name;
        this.zone = zone;
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

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSize() {
        return this.size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getConfigId() {
        return this.configId;
    }

    public void setConfigId(String configId) {
        this.configId = configId;
    }

    public String getVersion() {
        return this.version;
    }

    public void setVersion(String version) {
        this.version = version;
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

    public String getTag() {
        return this.tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
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