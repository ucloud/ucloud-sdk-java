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

    /** 地域。 参见 [地域和可用区列表](../summary/regionlist.html): false */
    @NotEmpty
    @UCloudParam("Region")
    private String region;

    /** 可用区。参见 [可用区列表](../summary/regionlist.html): false */
    @NotEmpty
    @UCloudParam("Zone")
    private String zone;

    /** 项目ID。不填写为默认项目，子帐号必须填写。 请参考[GetProjectList接口](../summary/get_project_list.html): false */
    @UCloudParam("ProjectId")
    private String projectId;

    /** 实例名称，至少6位: false */
    @NotEmpty
    @UCloudParam("Name")
    private String name;

    /** 管理员密码: false */
    @NotEmpty
    @UCloudParam("AdminPassword")
    private String adminPassword;

    /**
     * DB类型id，mysql/mongodb/postgesql按版本细分
     * 1：mysql-5.1，2：mysql-5.5，3：percona-5.5，4：mysql-5.6，5：percona-5.6，6：mysql-5.7，7：percona-5.7，8：mariadb-10.0，9：mongodb-2.4，10：mongodb-2.6，11：mongodb-3.0，12：mongodb-3.2,13：postgresql-9.4，14：postgresql-9.6，14：postgresql-10.4:
     * false
     */
    @NotEmpty
    @UCloudParam("DBTypeId")
    private String dbTypeId;

    /** 端口号，mysql默认3306，mongodb默认27017，postgresql默认5432: false */
    @NotEmpty
    @UCloudParam("Port")
    private Integer port;

    /** 磁盘空间(GB), 暂时支持20G - 32T: false */
    @NotEmpty
    @UCloudParam("DiskSpace")
    private Integer diskSpace;

    /** DB实例使用的配置参数组id: false */
    @NotEmpty
    @UCloudParam("ParamGroupId")
    private Integer paramGroupId;

    /**
     * 内存限制(MB)，目前支持以下几档 1000M/2000M/4000M/ 6000M/8000M/12000M/16000M/ 24000M/32000M/48000M/
     * 64000M/96000M/128000M/192000M/256000M/320000M: false
     */
    @NotEmpty
    @UCloudParam("MemoryLimit")
    private Integer memoryLimit;

    /** Year， Month， Dynamic，Trial，默认: Month: false */
    @UCloudParam("ChargeType")
    private String chargeType;

    /** 购买时长，默认值1: false */
    @UCloudParam("Quantity")
    private Integer quantity;

    /** 管理员帐户名，默认root: false */
    @UCloudParam("AdminUser")
    private String adminUser;

    /** 备份策略，每周备份数量，默认7次: false */
    @UCloudParam("BackupCount")
    private Integer backupCount;

    /** 备份策略，备份开始时间，单位小时计，默认1点: false */
    @UCloudParam("BackupTime")
    private Integer backupTime;

    /** 备份策略，备份时间间隔，单位小时计，默认24小时: false */
    @UCloudParam("BackupDuration")
    private Integer backupDuration;

    /** 备份id，如果指定，则表明从备份恢复实例: false */
    @UCloudParam("BackupId")
    private Integer backupId;

    /** 是否使用SSD，默认为true。目前主要可用区、海外机房、新机房只提供SSD资源，非SSD资源不再提供。: false */
    @UCloudParam("UseSSD")
    private Boolean useSSD;

    /** SSD类型，可选值为"SATA"、“NVMe”，如果UseSSD为true ，则必选: false */
    @UCloudParam("SSDType")
    private String ssdType;

    /** UDB实例模式类型, 可选值如下: "Normal": 普通版UDB实例 "HA": 高可用版UDB实例 默认是"Normal": false */
    @UCloudParam("InstanceMode")
    private String instanceMode;

    /** 专区ID信息（如果这个参数存在这说明是在专区中创建DB）: false */
    @UCloudParam("UDBCId")
    private String udbcId;

    /** cpu核数: false */
    @UCloudParam("CPU")
    private Integer cpu;

    /** 跨可用区高可用备库所在可用区，参见 [可用区列表](../summary/regionlist.html): false */
    @UCloudParam("BackupZone")
    private String backupZone;

    /** 子网ID: false */
    @UCloudParam("SubnetId")
    private String subnetId;

    /** VPC的ID: false */
    @UCloudParam("VPCId")
    private String vpcId;

    /** 是否开启异步高可用，默认不填，可置为true: false */
    @UCloudParam("DisableSemisync")
    private Boolean disableSemisync;

    /** 当DB类型(DBTypeId)为mongodb时，需要指定mongo的角色，可选值为 configsrv (配置节点)，shardsrv (数据节点): false */
    @UCloudParam("ClusterRole")
    private String clusterRole;

    /** 高可用架构: 1） haproxy（默认）: 当前仅支持mysql。 2） sentinel: 基于vip和哨兵节点的架构，当前支持mysql和pg。: false */
    @UCloudParam("HAArch")
    private String haArch;

    /** 实例所在的业务组名称: false */
    @UCloudParam("Tag")
    private String tag;

    /** 是否创建使用ipv6 资源， 默认为false， 或者不填， 创建ipv6为true: false */
    @UCloudParam("EnableIpV6")
    private Boolean enableIpV6;

    /** 使用的代金券id: false */
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

    public Boolean getUseSSD() {
        return useSSD;
    }

    public void setUseSSD(Boolean useSSD) {
        this.useSSD = useSSD;
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

    public String getUDBCId() {
        return udbcId;
    }

    public void setUDBCId(String udbcId) {
        this.udbcId = udbcId;
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

    public String getHAArch() {
        return haArch;
    }

    public void setHAArch(String haArch) {
        this.haArch = haArch;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Boolean getEnableIpV6() {
        return enableIpV6;
    }

    public void setEnableIpV6(Boolean enableIpV6) {
        this.enableIpV6 = enableIpV6;
    }

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }
}
