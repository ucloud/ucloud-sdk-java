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
 * @Description : 创建DB副本集 参数类
 * @Author : codezhang
 * @Date : 2019-03-01 17:30
 **/
public class CreateMongoDBReplicaSetParam extends BaseRequestParam {

    /**
     * 地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @UcloudParam("Region")
    @NotEmpty(message = "region can not be empty")
    private String region;

    /**
     * 可用区。参见 [可用区列表](../summary/regionlist.html)
     */
    @NotEmpty(message = "zone can not be empty")
    @UcloudParam("Zone")
    private String zone;


    /**
     * PrimaryDB实例名称，至少6位
     */
    @UcloudParam("Name")
    @NotEmpty(message = "name can not be empty")
    private String name;

    /**
     * 管理员密码
     */
    @UcloudParam("AdminPassword")
    @NotEmpty(message = "adminPassword can not be empty")
    private String adminPassword;

    /**
     * DB类型id对应的字符串形式（例如：mongodb-2.6） 注意：当前仅支持mongodb
     */
    @NotEmpty(message = "dbTypeId can not be empty")
    @UcloudParam("DBTypeId")
    private String dbTypeId;

    /**
     * 磁盘空间(GB), 暂时支持20G - 3000G
     */
    @UcloudParam("DiskSpace")
    @NotNull(message = "diskSpace can not be null")
    private Integer diskSpace;

    /**
     * DB实例使用的配置参数组id
     */
    @UcloudParam("ParamGroupId")
    @NotNull(message = "paramGroupId can not be null")
    private Integer paramGroupId;

    /**
     * 内存限制(MB)，目前支持以下几档 1000M/2000M/4000M/
     * 6000M/8000M/12000M/16000M/
     * 24000M/32000M/48000M/
     * 64000M/96000M
     */
    @UcloudParam("MemoryLimit")
    @NotNull(message = "memoryLimit can not be null")
    private Integer memoryLimit;

    /**
     * 端口号
     */
    @NotNull(message = "port can not be null")
    @UcloudParam("Port")
    private Integer port;

    /**
     * Year， Month， Dynamic，Trial，默认: Month
     */
    @UcloudParam("ChargeType")
    private String chargeType;

    /**
     * 购买时长(N个月)，默认值1个月。如果为0，代表购买到月底。
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
     * 是否使用SSD，默认为false
     */
    @UcloudParam("UseSSD")
    private Boolean useSSD;

    /**
     * SSD类型，可选值为"SATA"、"PCI-E"，如果UseSSD为true ，则必选
     */
    private String ssdType;

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
     * 子网ID
     */
    @UcloudParam("SubnetId")
    private String subnetId;

    /**
     * VPC的ID
     */
    @UcloudParam("VPCId")
    private String vpcId;


    public CreateMongoDBReplicaSetParam(@NotEmpty(message = "region can not be empty") String region,
                                        @NotEmpty(message = "zone can not be empty") String zone,
                                        @NotEmpty(message = "name can not be empty") String name,
                                        @NotEmpty(message = "adminPassword can not be empty") String adminPassword,
                                        @NotEmpty(message = "dbTypeId can not be empty") String dbTypeId,
                                        @NotNull(message = "diskSpace can not be null") Integer diskSpace,
                                        @NotNull(message = "paramGroupId can not be null") Integer paramGroupId,
                                        @NotNull(message = "memoryLimit can not be null") Integer memoryLimit,
                                        @NotEmpty(message = "port can not be null") Integer port) {
        super("CreateMongoDBReplicaSet");
        this.region = region;
        this.zone = zone;
        this.name = name;
        this.adminPassword = adminPassword;
        this.dbTypeId = dbTypeId;
        this.diskSpace = diskSpace;
        this.paramGroupId = paramGroupId;
        this.memoryLimit = memoryLimit;
        this.port = port;
    }

    @UcloudParam("SSDType")
    public List<Param> checkSSDType() throws ValidationException {
        List<Param> list = new ArrayList<>();
        if (useSSD != null && useSSD) {
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

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
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

}
