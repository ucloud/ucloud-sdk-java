package cn.ucloud.udb.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @Description : 普通UDB切换为高可用 参数类
 * 普通UDB切换为高可用，原db状态为WaitForSwitch时，调用该api
 * @Author : codezhang
 * @Date : 2019-03-04 19:38
 **/
public class SwitchUDBInstanceToHAParam extends BaseRequestParam {

    /**
     * 目标库所在地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @NotEmpty(message = "region can not be empty")
    @UcloudParam("Region")
    private String region;

    /**
     * 目标库所在可用区。参见 [可用区列表](../summary/regionlist.html)
     */
    @UcloudParam("Zone")
    private String zone;

    /**
     * 实例的Id,该值可以通过DescribeUDBInstance获取
     */
    @NotEmpty(message = "dbId can not be empty")
    @UcloudParam("DBId")
    private String dbId;

    /**
     * Year， Month， Dynamic，Trial，不填则按现在单点计费执行
     */
    @UcloudParam("ChargeType")
    private String chargeType;

    /**
     * 购买时长，需要和 ChargeType 搭配使用，否则使用单点计费策略的值
     */
    @UcloudParam("Quantity")
    private Integer quantity;

    /**
     * 业务组
     */
    @UcloudParam("Tag")
    private String tag;

    public SwitchUDBInstanceToHAParam(@NotEmpty(message = "region can not be empty") String region,
                                      @NotEmpty(message = "dbId can not be empty") String dbId) {
        super("SwitchUDBInstanceToHA");
        this.region = region;
        this.dbId = dbId;
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

    public String getDbId() {
        return dbId;
    }

    public void setDbId(String dbId) {
        this.dbId = dbId;
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

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

}
