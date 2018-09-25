package cn.ucloud.model;

import cn.ucloud.annotation.UcloudParam;
import cn.ucloud.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @description:
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2018/9/25 18:41
 */
public class CreateUDiskSnapshotParam extends BaseRequestParam {
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
     * uDiskId 快照的UDisk的Id
     */
    @NotEmpty(message = "uDiskId can not be empty")
    @UcloudParam("UDiskId")
    private String uDiskId;

    /**
     * name 快照名称
     */
    @NotEmpty(message = "name can not be empty")
    @UcloudParam("Name")
    private String name;

    /**
     * chargeType Year , Month, Dynamic 默认: Dynamic
     */
    @UcloudParam("ChargeType")
    private String chargeType;

    /**
     * quantity 购买时长 默认: 1
     */
    @UcloudParam("Quantity")
    private int quantity;

    /**
     * comment 快照描述
     */
    @UcloudParam("Comment")
    private String comment;

    public CreateUDiskSnapshotParam(@NotEmpty(message = "region can not be empty") String region,
                                    @NotEmpty(message = "zone can not be empty") String zone,
                                    @NotEmpty(message = "uDiskId can not be empty") String uDiskId,
                                    @NotEmpty(message = "name can not be empty") String name) {
        super("CreateUDiskSnapshot");
        this.region = region;
        this.zone = zone;
        this.uDiskId = uDiskId;
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

    public String getuDiskId() {
        return uDiskId;
    }

    public void setuDiskId(String uDiskId) {
        this.uDiskId = uDiskId;
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
