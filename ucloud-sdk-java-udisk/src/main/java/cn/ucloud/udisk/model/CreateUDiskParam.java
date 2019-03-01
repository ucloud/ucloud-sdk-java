package cn.ucloud.udisk.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * @description: 创建云硬盘 参数类
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2018/9/25 14:35
 */
public class CreateUDiskParam extends BaseRequestParam {
    /**
     * require region 地域，参见https://docs.ucloud.cn/api/summary/regionlist.html
     */
    @NotEmpty(message = "region can not be empty")
    @UcloudParam("Region")
    private String region;

    /**
     * require zone 可用区，参见https://docs.ucloud.cn/api/summary/regionlist.html
     */
    @NotEmpty(message = "zone can not be empty")
    @UcloudParam("Zone")
    private String zone;

    /**
     * require size 购买UDisk大小,单位:GB,普通盘: 范围[1~2000], 权限位控制可达8T,若需要请申请开通相关权限;SSD盘： 范围[1~4000]。
     */
    @NotNull(message = "size can not be null")
    @UcloudParam("Size")
    private Integer size = 1;

    /**
     * require name 实例名称
     */
    @NotEmpty(message = "name can not be empty")
    @UcloudParam("Name")
    private String name;

    /**
     * require chargeType Year, Month, Dynamic, Trial 默认: Dynamic
     */
    @UcloudParam("ChargeType")
    private String chargeType;

    /**
     * optional quantity 购买时长 默认: 1
     */
    @UcloudParam("Quantity")
    private Integer quantity;

    /**
     * optional uDataArkMode 是否开启数据方舟
     */
    @UcloudParam("UDataArkMode")
    private String uDataArkMode = "No";

    /**
     * optional tag 业务组 默认：Default
     */
    @UcloudParam("Tag")
    private String tag;

    /**
     * optional diskType UDisk 类型: DataDisk（普通数据盘），SSDDataDisk（SSD数据盘），默认值（DataDisk）
     */
    @UcloudParam("DiskType")
    private String diskType;

    /**
     * optional couponId 使用的代金券id
     */
    @UcloudParam("CouponId")
    private String couponId;



    public CreateUDiskParam(@NotEmpty(message = "region can not be empty") String region,
                            @NotEmpty(message = "zone can not be empty") String zone,
                            @NotEmpty(message = "size can not be empty") Integer size,
                            @NotEmpty(message = "name can not be empty") String name) {
        super("CreateUDisk");
        this.region = region;
        this.zone = zone;
        this.size = size;
        this.name = name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
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

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getuDataArkMode() {
        return uDataArkMode;
    }

    public void setuDataArkMode(String uDataArkMode) {
        this.uDataArkMode = uDataArkMode;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getDiskType() {
        return diskType;
    }

    public void setDiskType(String diskType) {
        this.diskType = diskType;
    }

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }
}
