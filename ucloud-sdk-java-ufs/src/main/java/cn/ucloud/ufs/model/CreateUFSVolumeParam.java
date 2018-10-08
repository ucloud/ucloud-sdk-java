package cn.ucloud.ufs.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * @description: 创建文件系统 参数类
 * @author: codezhang
 * @date: 2018-10-08 16:07
 **/

public class CreateUFSVolumeParam extends BaseRequestParam {

    /**
     * require 地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @NotEmpty(message = "region can not be empty")
    @UcloudParam("Region")
    private String region;

    /**
     * optional 文件系统大小，大小1024G ~ 25600G (1T ~ 25T)，必须为1024的整数倍。
     */
    @UcloudParam("Size")
    @NotNull(message = "size can not be null")
    private Integer size;

    /**
     * optional 文件系统名称
     */
    @UcloudParam("VolumeName")
    private String volumeName;

    /**
     * optional 备注
     */
    @UcloudParam("Remark")
    private String remark;

    /**
     * optional 文件系统所属业务组
     */
    @UcloudParam("Tag")
    private String tag;

    /**
     * optional
     * 计费模式，枚举值为：
     * Year，按年付费；
     * Month，按月付费；
     * Dynamic，按需付费（需开启权限）；
     * Trial，试用（需开启权限）
     * 默认为Dynamic
     */
    @UcloudParam("ChargeType")
    private String chargeType;

    /**
     * optional 购买时长 默认: 1
     */
    @UcloudParam("Quantity")
    private Integer quantity;

    /**
     * optional 使用的代金券id
     */
    @UcloudParam("CouponId")
    private String couponId;

    public CreateUFSVolumeParam(@NotEmpty(message = "region can not be empty") String region,
                                @NotNull(message = "size can not be null") Integer size) {
        super("CreateUFSVolume");
        this.region = region;
        this.size = size;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getVolumeName() {
        return volumeName;
    }

    public void setVolumeName(String volumeName) {
        this.volumeName = volumeName;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }
}
