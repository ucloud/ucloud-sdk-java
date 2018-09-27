package cn.ucloud.udisk.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @description:
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2018/9/25 15:50
 */
public class RecoverUDiskParam extends BaseRequestParam {

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
     * uDiskId 云硬盘资源ID
     */
    @NotEmpty(message = "uDiskId can not be empty")
    @UcloudParam("UDiskId")
    private String uDiskId;

    /**
     * chargeType Year, Month, Dynamic, Trial 默认: Dynamic
     */
    @UcloudParam("ChargeType")
    private String chargeType;

    /**
     * quantity 购买时长 默认: 1
     */
    @UcloudParam("Quantity")
    private int quantity;

    public RecoverUDiskParam(@NotEmpty(message = "region can not be empty") String region,
                             @NotEmpty(message = "zone can not be empty") String zone,
                             @NotEmpty(message = "uDiskId can not be empty") String uDiskId) {
        super("RecoverUDisk");
        this.region = region;
        this.zone = zone;
        this.uDiskId = uDiskId;
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

    public String getuDiskId() {
        return uDiskId;
    }

    public void setuDiskId(String uDiskId) {
        this.uDiskId = uDiskId;
    }

    public String getChargeType() {
        return chargeType;
    }

    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
