package cn.ucloud.udisk.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * @description: 克隆快照 参数类
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2018/9/25 18:46
 */
public class CloneUDiskSnapshotParam extends BaseRequestParam {
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
     * require name 实例名称
     */
    @NotEmpty(message = "name can not be empty")
    @UcloudParam("Name")
    private String name;

    /**
     * require sourceId 克隆父Snapshot的Id
     */
    @NotEmpty(message = "sourceId can not be empty")
    @UcloudParam("SourceId")
    private String sourceId;

    /**
     * require size 购买UDisk大小,单位:GB,范围[1~2000], 权限位控制可达8T,若需要请申请开通相关权限。
     */
    @NotNull(message = "size can not be empty")
    @UcloudParam("Size")
    private Integer size = 1;

    /**
     * optional comment 快照描述
     */
    @UcloudParam("Comment")
    private String comment;

    /**
     * optional chargeType Year , Month, Dynamic 默认: Dynamic
     */
    @UcloudParam("ChargeType")
    private String chargeType;

    /**
     * optional quantity 购买时长 默认: 1
     */
    @UcloudParam("Quantity")
    private Integer quantity;

    /**
     * optional uDataArkMode 是否开启数据方舟 默认:No
     */
    @UcloudParam("UDataArkMode")
    private Integer uDataArkMode;

    /**
     * optional couponId 使用的代金券id
     */
    @UcloudParam("CouponId")
    private Integer couponId;

    public CloneUDiskSnapshotParam(@NotEmpty(message = "region can not be empty") String region,
                                   @NotEmpty(message = "zone can not be empty") String zone,
                                   @NotEmpty(message = "name can not be empty") String name,
                                   @NotEmpty(message = "sourceId can not be empty") String sourceId,
                                   @NotEmpty(message = "size can not be empty") Integer size) {
        super("CloneUDiskSnapshot");
        this.region = region;
        this.zone = zone;
        this.name = name;
        this.sourceId = sourceId;
        this.size = size;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
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

    public Integer getuDataArkMode() {
        return uDataArkMode;
    }

    public void setuDataArkMode(Integer uDataArkMode) {
        this.uDataArkMode = uDataArkMode;
    }

    public Integer getCouponId() {
        return couponId;
    }

    public void setCouponId(Integer couponId) {
        this.couponId = couponId;
    }
}
