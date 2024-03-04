/**
 * Copyright 2021 UCloud Technology Co., Ltd.
 *
 * <p>Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a copy of the License at
 *
 * <p>http://www.apache.org/licenses/LICENSE-2.0
 *
 * <p>Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing permissions and
 * limitations under the License.
 */
package cn.ucloud.udb.models;


import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

public class CreateUDBInstanceRequest extends Request {

    /** 地域。 参见 [地域和可用区列表](https://docs.ucloud.cn/api/summary/regionlist) */
    @NotEmpty
    @UCloudParam("Region")
    private String region;

    /** 可用区。参见 [可用区列表](https://docs.ucloud.cn/api/summary/regionlist) */
    @NotEmpty
    @UCloudParam("Zone")
    private String zone;

    /**
     * 项目ID。不填写为默认项目，子帐号必须填写。
     * 请参考[GetProjectList接口](https://docs.ucloud.cn/api/summary/get_project_list)
     */
    @UCloudParam("ProjectId")
    private String projectId;

    /** 实例名称，至少6位 */
    @NotEmpty
    @UCloudParam("Name")
    private String name;

    /** 管理员密码 */
    @NotEmpty
    @UCloudParam("AdminPassword")
    private String adminPassword;

    /**
     * DB类型，mysql/mongodb/postgesql/sqlserver按版本细分 mysql-8.0, mysql-5.5, percona-5.5, mysql-5.6,
     * percona-5.6, mysql-5.7, percona-5.7, mariadb-10.0, postgresql-9.6, postgresql-10.4,
     * postgresql-12.8, postgresql-13.4，mongodb-2.6, mongodb-3.0, mongodb-3.6, mongodb-4.0,
     * sqlserver-2017
     */
    @NotEmpty
    @UCloudParam("DBTypeId")
    private String dbTypeId;

    /** 端口号，mysql默认3306，mongodb默认27017，postgresql默认5432 */
    @NotEmpty
    @UCloudParam("Port")
    private Integer port;

    /** 磁盘空间(GB), 暂时支持20G - 32T */
    @NotEmpty
    @UCloudParam("DiskSpace")
    private Integer diskSpace;

    /** DB实例使用的配置参数组id */
    @NotEmpty
    @UCloudParam("ParamGroupId")
    private Integer paramGroupId;

    /**
     * 内存限制(MB)，目前支持以下几档 2000M/4000M/ 6000M/8000M/12000M/16000M/ 24000M/32000M/48000M/
     * 64000M/96000M/128000M/192000M/256000M/320000M
     */
    @UCloudParam("MemoryLimit")
    private Integer memoryLimit;

    /** Year， Month， Dynamic，Trial，默认: Month */
    @UCloudParam("ChargeType")
    private String chargeType;

    /** 购买时长，默认值1 */
    @UCloudParam("Quantity")
    private Integer quantity;

    /** 管理员帐户名，默认root */
    @UCloudParam("AdminUser")
    private String adminUser;

    /** 备份策略，每周备份数量，默认7次 */
    @UCloudParam("BackupCount")
    private Integer backupCount;

    /** 备份策略，备份开始时间，单位小时计，默认1点 */
    @UCloudParam("BackupTime")
    private Integer backupTime;

    /** 备份策略，备份时间间隔，单位小时计，默认24小时 */
    @UCloudParam("BackupDuration")
    private Integer backupDuration;

    /** 备份id，如果指定，则表明从备份恢复实例 */
    @UCloudParam("BackupId")
    private Integer backupId;

    /** SSD类型，可选值为"SATA"、“NVMe”，默认为“SATA” */
    @UCloudParam("SSDType")
    private String ssdType;

    /** UDB实例模式类型, 可选值如下: "Normal": 普通版UDB实例 "HA": 高可用版UDB实例 默认是"Normal" */
    @UCloudParam("InstanceMode")
    private String instanceMode;

    /** cpu核数，如果db类型为sqlserver，必传参数 */
    @UCloudParam("CPU")
    private Integer cpu;

    /** 跨可用区高可用备库所在可用区，参见 [可用区列表](https://docs.ucloud.cn/api/summary/regionlist) */
    @UCloudParam("BackupZone")
    private String backupZone;

    /** 子网ID */
    @UCloudParam("SubnetId")
    private String subnetId;

    /** VPC的ID */
    @UCloudParam("VPCId")
    private String vpcId;

    /** 是否开启异步高可用，默认不填，可置为true */
    @UCloudParam("DisableSemisync")
    private Boolean disableSemisync;

    /** 当DB类型(DBTypeId)为mongodb时，需要指定mongo的角色，可选值为 configsrv (配置节点)，shardsrv (数据节点) */
    @UCloudParam("ClusterRole")
    private String clusterRole;

    /** 实例所在的业务组名称 */
    @UCloudParam("Tag")
    private String tag;

    /** mysql小版本号，支持指定小版本创建 */
    @UCloudParam("DBSubVersion")
    private String dbSubVersion;

    /** mysql大小写参数, 0 为大小写敏感, 1 为大小写不敏感, 目前只针对mysql8.0有效 */
    @UCloudParam("CaseSensitivityParam")
    private Integer caseSensitivityParam;

    /** 实例计算规格类型，0或不传代表使用内存方式购买，1代表使用内存-cpu可选配比方式购买，需要填写MachineType */
    @UCloudParam("SpecificationType")
    private String specificationType;

    /** 规格类型ID,当SpecificationType为1时有效 */
    @UCloudParam("MachineType")
    private String machineType;

    /** 使用的代金券id */
    @UCloudParam("CouponId")
    private String couponId;

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

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
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

    public String getDBTypeId() {
        return dbTypeId;
    }

    public void setDBTypeId(String dbTypeId) {
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

    public Integer getBackupId() {
        return backupId;
    }

    public void setBackupId(Integer backupId) {
        this.backupId = backupId;
    }

    public String getSSDType() {
        return ssdType;
    }

    public void setSSDType(String ssdType) {
        this.ssdType = ssdType;
    }

    public String getInstanceMode() {
        return instanceMode;
    }

    public void setInstanceMode(String instanceMode) {
        this.instanceMode = instanceMode;
    }

    public Integer getCPU() {
        return cpu;
    }

    public void setCPU(Integer cpu) {
        this.cpu = cpu;
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

    public String getVPCId() {
        return vpcId;
    }

    public void setVPCId(String vpcId) {
        this.vpcId = vpcId;
    }

    public Boolean getDisableSemisync() {
        return disableSemisync;
    }

    public void setDisableSemisync(Boolean disableSemisync) {
        this.disableSemisync = disableSemisync;
    }

    public String getClusterRole() {
        return clusterRole;
    }

    public void setClusterRole(String clusterRole) {
        this.clusterRole = clusterRole;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getDBSubVersion() {
        return dbSubVersion;
    }

    public void setDBSubVersion(String dbSubVersion) {
        this.dbSubVersion = dbSubVersion;
    }

    public Integer getCaseSensitivityParam() {
        return caseSensitivityParam;
    }

    public void setCaseSensitivityParam(Integer caseSensitivityParam) {
        this.caseSensitivityParam = caseSensitivityParam;
    }

    public String getSpecificationType() {
        return specificationType;
    }

    public void setSpecificationType(String specificationType) {
        this.specificationType = specificationType;
    }

    public String getMachineType() {
        return machineType;
    }

    public void setMachineType(String machineType) {
        this.machineType = machineType;
    }

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }
}
