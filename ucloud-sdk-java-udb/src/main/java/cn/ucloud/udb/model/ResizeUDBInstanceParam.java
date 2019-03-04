package cn.ucloud.udb.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;
import cn.ucloud.common.pojo.Param;

import javax.validation.ValidationException;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description : 修改UDB实例的配置 参数类
 * 修改（升级和降级）UDB实例的配置，
 * 包括内存和磁盘的配置，对于内存升级无需关闭实例，其他场景需要事先关闭实例。
 * 两套参数可以配置升降机：
 * 1.配置UseSSD和SSDType
 * 2.配置InstanceType，不需要配置InstanceMode。
 * 这两套第二套参数的优先级更高
 * @Author : codezhang
 * @Date : 2019-03-04 19:00
 **/
public class ResizeUDBInstanceParam extends BaseRequestParam {

    /**
     * 目标库所在地域。 参见 [地域和可用区列表](../summary/regionlist.html)
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
     * DB实例ID
     */
    @NotEmpty(message = "dbId can not be empty")
    @UcloudParam("DBId")
    private String dbId;

    /**
     * 内存限制(MB)，目前支持以下几档
     * 1000M/2000M/4000M/
     * 6000M/8000M/
     * 12000M/16000M/
     * 24000M/32000M/
     * 48000M/64000M/96000M。
     */
    @NotNull(message = "memoryLimit can not be null")
    @UcloudParam("MemoryLimit")
    private Integer memoryLimit;

    /**
     * 磁盘空间(GB), 暂时支持20G-3000G
     */
    @NotNull(message = "diskSpace can not be null")
    @UcloudParam("DiskSpace")
    private Integer diskSpace;

    /**
     * 是否使用SSD，默认为false
     */
    @UcloudParam("UseSSD")
    private Boolean useSSD;

    /**
     * SSD类型，可选值为"SATA"、"PCI-E"，如果UseSSD为true ，则必选
     */
    private String ssdType;

    /**
     * 专区的ID，如果有值表示专区中的DB配置升降级
     */
    @UcloudParam("UDBCId")
    private String udbcId;

    /**
     * UDB数据库机型:
     * "Normal": "标准机型" ,
     * "SATA_SSD": "SSD机型" ,
     * "PCIE_SSD": "SSD高性能机型" ,
     * "Normal_Volume": "标准大容量机型",
     * "SATA_SSD_Volume": "SSD大容量机型" ,
     * "PCIE_SSD_Volume": "SSD高性能大容量机型"
     */
    @UcloudParam("InstanceType")
    private String instanceType;

    /**
     * UDB实例模式类型, 可选值如下:
     * "Normal": 普通版UDB实例
     * "HA": 高可用版UDB实例
     * 默认是"Normal"
     */
    @UcloudParam("InstanceMode")
    private String instanceMode;

    /**
     * DB关闭状态下升降级，升降级后是否启动DB，默认为false
     */
    @UcloudParam("StartAfterUpgrade")
    private Boolean startAfterUpgrade;

    /**
     * 使用的代金券id
     */
    @UcloudParam("CouponId")
    private String couponId;

    public ResizeUDBInstanceParam(@NotEmpty(message = "region can not be empty") String region,
                                  @NotEmpty(message = "dbId can not be empty") String dbId,
                                  @NotNull(message = "memoryLimit can not be null") Integer memoryLimit,
                                  @NotNull(message = "diskSpace can not be null") Integer diskSpace) {
        super("ResizeUDBInstance");
        this.region = region;
        this.dbId = dbId;
        this.memoryLimit = memoryLimit;
        this.diskSpace = diskSpace;
    }

    @UcloudParam("SSDType")
    public List<Param> checkSSDType() throws ValidationException {
        List<Param> list = new ArrayList<>();
        if (useSSD) {
            if (ssdType == null) {
                throw new ValidationException("ssdType can not be empty when useSSD is true");
            } else {
                Param param = new Param("SSDType", ssdType);
                list.add(param);
            }
        }
        return list;
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

    public Integer getMemoryLimit() {
        return memoryLimit;
    }

    public void setMemoryLimit(Integer memoryLimit) {
        this.memoryLimit = memoryLimit;
    }

    public Integer getDiskSpace() {
        return diskSpace;
    }

    public void setDiskSpace(Integer diskSpace) {
        this.diskSpace = diskSpace;
    }

    public Boolean getUseSSD() {
        return useSSD;
    }

    public void setUseSSD(Boolean useSSD) {
        this.useSSD = useSSD;
    }

    public String getSsdType() {
        return ssdType;
    }

    public void setSsdType(String ssdType) {
        this.ssdType = ssdType;
    }

    public String getUdbcId() {
        return udbcId;
    }

    public void setUdbcId(String udbcId) {
        this.udbcId = udbcId;
    }

    public String getInstanceType() {
        return instanceType;
    }

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    public String getInstanceMode() {
        return instanceMode;
    }

    public void setInstanceMode(String instanceMode) {
        this.instanceMode = instanceMode;
    }

    public Boolean getStartAfterUpgrade() {
        return startAfterUpgrade;
    }

    public void setStartAfterUpgrade(Boolean startAfterUpgrade) {
        this.startAfterUpgrade = startAfterUpgrade;
    }

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }

    @Override
    public String toString() {
        return "ResizeUDBInstanceParam{" +
                "region='" + region + '\'' +
                ", zone='" + zone + '\'' +
                ", dbId='" + dbId + '\'' +
                ", memoryLimit=" + memoryLimit +
                ", diskSpace=" + diskSpace +
                ", useSSD=" + useSSD +
                ", ssdType='" + ssdType + '\'' +
                ", udbcId='" + udbcId + '\'' +
                ", instanceType='" + instanceType + '\'' +
                ", instanceMode='" + instanceMode + '\'' +
                ", startAfterUpgrade=" + startAfterUpgrade +
                ", couponId='" + couponId + '\'' +
                ", action='" + action + '\'' +
                ", signature='" + signature + '\'' +
                ", publicKey='" + publicKey + '\'' +
                ", projectId='" + projectId + '\'' +
                '}';
    }
}
