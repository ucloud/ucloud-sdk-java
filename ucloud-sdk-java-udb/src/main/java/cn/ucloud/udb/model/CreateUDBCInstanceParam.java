package cn.ucloud.udb.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @Description : 创建一个可以创建UDB的用户专享的区域 参数类
 * @Author : codezhang
 * @Date : 2019-03-01 18:45
 **/
public class CreateUDBCInstanceParam extends BaseRequestParam {

    /**
     * 地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @NotEmpty(message = "region can not be empty")
    @UcloudParam("Region")
    private String region;

    /**
     * 可用区。参见 [可用区列表](../summary/regionlist.html)
     */
    @NotEmpty(message = "zone can not be empty")
    @UcloudParam("Zone")
    private String zone;

    /**
     * 专区名称
     */
    @NotEmpty(message = "udbcName can not be empty")
    @UcloudParam("UDBCName")
    private String udbcName;

    /**
     * 创建专区的类型
     */
    @UcloudParam("Type")
    @NotEmpty(message = "type can not be empty")
    private String type;

    /**
     * 业务组
     */
    @NotEmpty(message = "tag can not be empty")
    @UcloudParam("Tag")
    private String tag;

    /**
     * 购买时长，默认值1
     */
    @UcloudParam("Quantity")
    private Integer quantity;

    /**
     * Year， Month 默认: Month
     */
    @UcloudParam("ChargeType")
    private String chargeType;

    /**
     * 备注名称
     */
    @UcloudParam("Remark")
    private String remark;

    /**
     * 使用的代金券id
     */
    @UcloudParam("CouponId")
    private String couponId;

    public CreateUDBCInstanceParam(@NotEmpty(message = "region can not be empty") String region,
                                   @NotEmpty(message = "zone can not be empty") String zone,
                                   @NotEmpty(message = "udbcName can not be empty") String udbcName,
                                   @NotEmpty(message = "type can not be empty") String type,
                                   @NotEmpty(message = "tag can not be empty") String tag) {
        super("CreateUDBCInstance");
        this.region = region;
        this.zone = zone;
        this.udbcName = udbcName;
        this.type = type;
        this.tag = tag;
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

    public String getUdbCName() {
        return udbcName;
    }

    public void setUdbcName(String udbcName) {
        this.udbcName = udbcName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getChargeType() {
        return chargeType;
    }

    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
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
