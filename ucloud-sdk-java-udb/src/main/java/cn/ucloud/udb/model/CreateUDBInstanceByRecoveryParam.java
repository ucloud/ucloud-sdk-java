package cn.ucloud.udb.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * @Description : 将新建的db恢复到指定db某个指定时间点 参数类
 * @Author : codezhang
 * @Date : 2019-03-01 22:13
 **/
public class CreateUDBInstanceByRecoveryParam extends BaseRequestParam {

    /**
     * 地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @NotEmpty(message = "region can not be empty")
    @UcloudParam("Region")
    private String region;

    /**
     * 可用区。参见 [可用区列表](../summary/regionlist.html)
     */
    @UcloudParam("Zone")
    private String zone;

    /**
     * 实例名称，至少6位
     */
    @NotEmpty(message = "name can not be empty")
    @UcloudParam("Name")
    private String name;

    /**
     * 源实例的Id
     */
    @NotEmpty(message = "srcDBId can not be empty")
    @UcloudParam("SrcDBId")
    private String srcDBId;

    /**
     * 恢复到某个时间点的时间戳(UTC时间格式，默认单位秒)
     */
    @NotNull(message = "recoveryTime can not be null")
    @UcloudParam("RecoveryTime")
    private Integer recoveryTime;


    /**
     * 指定是否是否使用SSD，默认使用主库的配置
     */
    @UcloudParam("UseSSD")
    private Boolean useSSD;

    /**
     * Year， Month， Dynamic，Trial，默认: Dynamic
     */
    @UcloudParam("ChargeType")
    private String chargeType;

    /**
     * 购买时长，默认值1
     */
    @UcloudParam("Quantity")
    private Integer quantity;

    /**
     * 专区的Id
     */
    @UcloudParam("UDBCId")
    private String udbcId;

    /**
     * 使用的代金券id
     */
    @UcloudParam("CouponId")
    private String couponId;

    public CreateUDBInstanceByRecoveryParam(@NotEmpty(message = "region can not be empty") String region,
                                            @NotEmpty(message = "name can not be empty") String name,
                                            @NotEmpty(message = "srcDBId can not be empty") String srcDBId,
                                            @NotNull(message = "recoveryTime can not be null") Integer recoveryTime) {
        super("CreateUDBInstanceByRecovery");
        this.region = region;
        this.name = name;
        this.srcDBId = srcDBId;
        this.recoveryTime = recoveryTime;
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

    public String getSrcDBId() {
        return srcDBId;
    }

    public void setSrcDBId(String srcDBId) {
        this.srcDBId = srcDBId;
    }

    public Integer getRecoveryTime() {
        return recoveryTime;
    }

    public void setRecoveryTime(Integer recoveryTime) {
        this.recoveryTime = recoveryTime;
    }

    public Boolean getUseSSD() {
        return useSSD;
    }

    public void setUseSSD(Boolean useSSD) {
        this.useSSD = useSSD;
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

    public String getUdbcId() {
        return udbcId;
    }

    public void setUdbcId(String udbcId) {
        this.udbcId = udbcId;
    }

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }

    @Override
    public String toString() {
        return "CreateUDBInstanceByRecoveryParam{" +
                "region='" + region + '\'' +
                ", zone='" + zone + '\'' +
                ", name='" + name + '\'' +
                ", srcDBId='" + srcDBId + '\'' +
                ", recoveryTime=" + recoveryTime +
                ", useSSD=" + useSSD +
                ", chargeType='" + chargeType + '\'' +
                ", quantity=" + quantity +
                ", udbcId='" + udbcId + '\'' +
                ", couponId='" + couponId + '\'' +
                ", action='" + action + '\'' +
                ", signature='" + signature + '\'' +
                ", publicKey='" + publicKey + '\'' +
                ", projectId='" + projectId + '\'' +
                '}';
    }
}
