package cn.ucloud.model;

import cn.ucloud.annotation.UcloudParam;
import cn.ucloud.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @description:
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2018/9/25 16:05
 */
public class CloneUDiskParam extends BaseRequestParam {
    /**
     * region 地域，参见https://docs.ucloud.cn/api/summary/regionlist.html
     */
    @NotEmpty(message = "region can not be empty")
    @UcloudParam("Region")
    private String region;

    /**
     * zone 可用区，参见https://docs.ucloud.cn/api/summary/regionlist.html
     */
    @NotEmpty(message = "zone can not be empty")
    @UcloudParam("Zone")
    private String zone;

    /**
     * name 实例名称
     */
    @NotEmpty(message = "name can not be empty")
    @UcloudParam("Name")
    private String name;

    /**
     * sourceId 克隆父Disk的Id
     */
    @NotEmpty(message = "sourceId can not be empty")
    @UcloudParam("SourceId")
    private String sourceId;

    /**
     * uDataArkMode 是否打开数据方舟, 打开"Yes",关闭"No", 默认关闭
     */
    @UcloudParam("UDataArkMode")
    private String uDataArkMode;

    /**
     * quantity 购买时长 默认: 1
     */
    @UcloudParam("Quantity")
    private int quantity;

    /**
     * comment Disk注释
     */
    @UcloudParam("Comment")
    private int comment;

    /**
     * chargeType Year, Month, Dynamic, Trial 默认: Dynamic
     */
    @UcloudParam("ChargeType")
    private String chargeType;

    /**
     * couponId 使用的代金券id
     */
    @UcloudParam("CouponId")
    private String couponId;

    public CloneUDiskParam(@NotEmpty(message = "region can not be empty") String region,
                           @NotEmpty(message = "zone can not be empty") String zone,
                           @NotEmpty(message = "name can not be empty") String name,
                           @NotEmpty(message = "sourceId can not be empty") String sourceId) {
        super("CloneUDisk");
        this.region = region;
        this.zone = zone;
        this.name = name;
        this.sourceId = sourceId;
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

    public String getuDataArkMode() {
        return uDataArkMode;
    }

    public void setuDataArkMode(String uDataArkMode) {
        this.uDataArkMode = uDataArkMode;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getComment() {
        return comment;
    }

    public void setComment(int comment) {
        this.comment = comment;
    }

    public String getChargeType() {
        return chargeType;
    }

    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
    }

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }
}
