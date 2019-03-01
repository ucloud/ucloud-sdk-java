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
 * @Description : 创建数据库 参数类
 * 创建UDB实例（包括创建mysql master节点、mongodb primary/configsvr节点和从备份恢复实例）
 * 提示信息: 创建跨可用区的高可用注意项:
 * 1. 需要参数 BackupZone：值为高可用容灾的ZoneId
 * 2. 参数ParamGroupId: 值为跨可用区的配置文件，可以通过DescribeUDBParamGroup获得
 * @Author : codezhang
 * @Date : 2019-03-01 19:16
 **/
public class CreateUDBInstanceParam extends BaseRequestParam {

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
    @NotEmpty(message = "zone can not be empty")
    private String zone;

    /**
     * 实例名称，至少6位
     */
    @NotEmpty(message = "name can not be null")
    @UcloudParam("Name")
    private String name;

    /**
     * 管理员密码
     */
    @UcloudParam("AdminPassword")
    @NotEmpty(message = "adminPassword can not be empty")
    private String adminPassword;

    /**
     * DB类型id，mysql/mongodb/postgesql按版本细分
     * 1：mysql-5.1，2：mysql-5.5，
     * 3：percona-5.5，4：mysql-5.6，
     * 5：percona-5.6，6：mysql-5.7，
     * 7：percona-5.7，8：mariadb-10.0，
     * 9：mongodb-2.4，10：mongodb-2.6，
     * 11：mongodb-3.0，12：mongodb-3.2,
     * 13：postgresql-9.4，14：postgresql-9.6，
     * 14：postgresql-10.4
     */
    @NotEmpty(message = "dbTypeId can not be empty")
    @UcloudParam("DBTypeId")
    private String dbTypeId;

    /**
     * 端口号，mysql默认3306，mongodb默认27017，postgresql默认5432
     */
    @NotNull(message = "port can not be null")
    @UcloudParam("Port")
    private Integer port;

    /**
     * 磁盘空间(GB), 暂时支持20G - 3000G
     */
    @NotNull(message = "diskSpace can not be null")
    @UcloudParam("DiskSpace")
    private Integer diskSpace;

    /**
     * DB实例使用的配置参数组id
     */
    @NotNull(message = "paramGroupId can not be null")
    @UcloudParam("ParamGroupId")
    private Integer paramGroupId;

    /**
     * 内存限制(MB)，目前支持以下几档
     * 1000M/2000M/4000M/
     * 6000M/8000M/12000M/16000M/
     * 24000M/32000M/48000M/
     * 64000M/96000M
     */
    @NotNull(message = "memoryLimit can not be null")
    @UcloudParam("MemoryLimit")
    private Integer memoryLimit;

    /**
     * 当DB类型(DBTypeId)为mongodb时，需要指定mongo的角色，
     * 可选值为 configsrv (配置节点)，shardsrv (数据节点)
     */
    @UcloudParam("ClusterRole")
    private String clusterRole;

    /**
     * Year， Month， Dynamic，Trial，默认: Month
     */
    @UcloudParam("ChargeType")
    private String chargeType;

    /**
     * 购买时长，默认值1
     */
    @UcloudParam("Quantity")
    private Integer quantity;

    /**
     * 管理员帐户名，默认root
     */
    @UcloudParam("AdminUser")
    private String adminUser;

    /**
     * 备份策略，每周备份数量，默认7次
     */
    @UcloudParam("BackupCount")
    private Integer backupCount;

    /**
     * 备份策略，备份开始时间，单位小时计，默认1点
     */
    @UcloudParam("BackupTime")
    private Integer backupTime;

    /**
     * 备份策略，备份时间间隔，单位小时计，默认24小时
     */
    @UcloudParam("BackupDuration")
    private Integer backupDuration;

    /**
     * 备份id，如果指定，则表明从备份恢复实例
     */
    @UcloudParam("BackupId")
    private Integer backupId;

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
     * UDB实例模式类型, 可选值如下:
     * "Normal": 普通版UDB实例
     * "HA": 高可用版UDB实例
     * 默认是"Normal"
     */
    @UcloudParam("InstanceMode")
    private String instanceMode;

    /**
     * 专区ID信息（如果这个参数存在这说明是在专区中创建DB）
     */
    @UcloudParam("UDBCId")
    private String udbcId;

    /**
     * cpu核数
     */
    @UcloudParam("CPU")
    private Integer cpu;

    /**
     * UDB数据库机型
     */
    @UcloudParam("InstanceType")
    private String instanceType;

    /**
     * 跨可用区高可用备库所在可用区，参见 [可用区列表](../summary/regionlist.html)
     */
    @UcloudParam("BackupZone")
    private String backupZone;

    /**
     * 子网ID
     */
    @UcloudParam("SubnetId")
    private String subnetId;

    /**
     * VPC的ID
     */
    @UcloudParam("VPCId")
    private String vpcId;

    /**
     * 是否开启异步高可用，默认不填，可置为true
     */
    @UcloudParam("DisableSemisync")
    private Boolean disableSemisync;
    /**
     * 使用的代金券id
     */
    @UcloudParam("CouponId")
    private String couponId;

    public CreateUDBInstanceParam(@NotEmpty(message = "region can not be empty") String region,
                                  @NotEmpty(message = "zone can not be empty") String zone,
                                  @NotEmpty(message = "name can not be null") String name,
                                  @NotEmpty(message = "adminPassword can not be empty") String adminPassword,
                                  @NotEmpty(message = "dbTypeId can not be empty") String dbTypeId,
                                  @NotNull(message = "port can not be null") Integer port,
                                  @NotNull(message = "diskSpace can not be null") Integer diskSpace,
                                  @NotNull(message = "paramGroupId can not be null") Integer paramGroupId,
                                  @NotNull(message = "memoryLimit can not be null") Integer memoryLimit) {
        super("CreateUDBInstance");
        this.region = region;
        this.zone = zone;
        this.name = name;
        this.adminPassword = adminPassword;
        this.dbTypeId = dbTypeId;
        this.port = port;
        this.diskSpace = diskSpace;
        this.paramGroupId = paramGroupId;
        this.memoryLimit = memoryLimit;
    }

    @UcloudParam("SSDType")
    public List<Param> checkSSDType() throws Exception {
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

    public Integer getBackupId() {
        return backupId;
    }

    public void setBackupId(Integer backupId) {
        this.backupId = backupId;
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

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    public String getDbTypeId() {
        return dbTypeId;
    }

    public void setDbTypeId(String dbTypeId) {
        this.dbTypeId = dbTypeId;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public Integer getDiskSpace() {
        return diskSpace;
    }

    public void setDiskSpace(Integer diskSpace) {
        this.diskSpace = diskSpace;
    }

    public Integer getParamGroupId() {
        return paramGroupId;
    }

    public void setParamGroupId(Integer paramGroupId) {
        this.paramGroupId = paramGroupId;
    }

    public Integer getMemoryLimit() {
        return memoryLimit;
    }

    public void setMemoryLimit(Integer memoryLimit) {
        this.memoryLimit = memoryLimit;
    }

    public String getClusterRole() {
        return clusterRole;
    }

    public void setClusterRole(String clusterRole) {
        this.clusterRole = clusterRole;
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

    public String getAdminUser() {
        return adminUser;
    }

    public void setAdminUser(String adminUser) {
        this.adminUser = adminUser;
    }

    public Integer getBackupCount() {
        return backupCount;
    }

    public void setBackupCount(Integer backupCount) {
        this.backupCount = backupCount;
    }

    public Integer getBackupTime() {
        return backupTime;
    }

    public void setBackupTime(Integer backupTime) {
        this.backupTime = backupTime;
    }

    public Integer getBackupDuration() {
        return backupDuration;
    }

    public void setBackupDuration(Integer backupDuration) {
        this.backupDuration = backupDuration;
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

    public String getInstanceMode() {
        return instanceMode;
    }

    public void setInstanceMode(String instanceMode) {
        this.instanceMode = instanceMode;
    }

    public String getUdbcId() {
        return udbcId;
    }

    public void setUdbcId(String udbcId) {
        this.udbcId = udbcId;
    }

    public Integer getCpu() {
        return cpu;
    }

    public void setCpu(Integer cpu) {
        this.cpu = cpu;
    }

    public String getInstanceType() {
        return instanceType;
    }

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    public String getBackupZone() {
        return backupZone;
    }

    public void setBackupZone(String backupZone) {
        this.backupZone = backupZone;
    }

    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public Boolean getDisableSemisync() {
        return disableSemisync;
    }

    public void setDisableSemisync(Boolean disableSemisync) {
        this.disableSemisync = disableSemisync;
    }

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }

    @Override
    public String toString() {
        return "CreateUDBInstanceParam{" +
                "region='" + region + '\'' +
                ", zone='" + zone + '\'' +
                ", name='" + name + '\'' +
                ", adminPassword='" + adminPassword + '\'' +
                ", dbTypeId='" + dbTypeId + '\'' +
                ", port=" + port +
                ", diskSpace=" + diskSpace +
                ", paramGroupId=" + paramGroupId +
                ", memoryLimit=" + memoryLimit +
                ", clusterRole='" + clusterRole + '\'' +
                ", chargeType='" + chargeType + '\'' +
                ", quantity=" + quantity +
                ", adminUser='" + adminUser + '\'' +
                ", backupCount=" + backupCount +
                ", backupTime=" + backupTime +
                ", backupDuration=" + backupDuration +
                ", backupId=" + backupId +
                ", useSSD=" + useSSD +
                ", ssdType='" + ssdType + '\'' +
                ", instanceMode='" + instanceMode + '\'' +
                ", udbcId='" + udbcId + '\'' +
                ", cpu=" + cpu +
                ", instanceType='" + instanceType + '\'' +
                ", backupZone='" + backupZone + '\'' +
                ", subnetId='" + subnetId + '\'' +
                ", vpcId='" + vpcId + '\'' +
                ", disableSemisync=" + disableSemisync +
                ", couponId='" + couponId + '\'' +
                '}';
    }
}
