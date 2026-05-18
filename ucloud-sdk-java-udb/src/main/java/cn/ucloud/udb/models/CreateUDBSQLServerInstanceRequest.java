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

import java.util.List;

public class CreateUDBSQLServerInstanceRequest extends Request {

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

    /** DB类型，SQL Server按版本细分 sqlserver-2017、sqlserver-2019、sqlserver-2022 */
    @NotEmpty
    @UCloudParam("DBTypeId")
    private String dbTypeId;

    /** 端口号，sqlserver默认1433 */
    @NotEmpty
    @UCloudParam("Port")
    private Integer port;

    /** 磁盘空间(GB), 暂时支持20G - 32T */
    @NotEmpty
    @UCloudParam("DiskSpace")
    private Integer diskSpace;

    /** 存储类型 CLOUD_RSSD: RSSD 云盘，该字段和SpecificationClass组合使用，CLOUD_RSSD对应O型 */
    @NotEmpty
    @UCloudParam("StorageClass")
    private String storageClass;

    /** 规格类型 O: NVMe型 */
    @NotEmpty
    @UCloudParam("SpecificationClass")
    private String specificationClass;

    /** UDB实例模式类型, 可选值如下: "Normal": SQL Server普通版实例 "HA": SQL Server集群版实例 默认是"Normal" */
    @UCloudParam("InstanceMode")
    private String instanceMode;

    /** 规格类型 ID，如果创建的是SQL Server集群版，该参数必填，请通过 ListUDBMachineType 接口获取，返回体中的ID字段为MachineType的值。 */
    @UCloudParam("MachineType")
    private String machineType;

    /** CPU核，如果是创建的SQL Server普通版，该参数必传，目前支持2/4/8/16/32/64 */
    @UCloudParam("CPU")
    private Integer cpu;

    /**
     * 内存限制(MB)，如果是创建的SQL Server普通版，该参数必传，目前支持以下几档 2000M/4000M/ 6000M/8000M/12000M/16000M/
     * 24000M/32000M/48000M/ 64000M/96000M/128000M/192000M/256000M/320000M
     */
    @UCloudParam("MemoryLimit")
    private Integer memoryLimit;

    /** Year， Month， Dynamic，Trial，默认: Month */
    @UCloudParam("ChargeType")
    private String chargeType;

    /** 购买时长，默认值1 */
    @UCloudParam("Quantity")
    private Integer quantity;

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

    /** 子网ID，如果创建的是SQL Server集群版，该参数必填 */
    @UCloudParam("SubnetId")
    private String subnetId;

    /** VPC的ID，如果创建的是SQL Server集群版，该参数必填 */
    @UCloudParam("VPCId")
    private String vpcId;

    /** 实例所在的业务组名称 */
    @UCloudParam("Tag")
    private String tag;

    /** 告警模版id */
    @UCloudParam("AlarmTemplateId")
    private String alarmTemplateId;

    /** 备份文件的US3内网下载地址 */
    @UCloudParam("BackupURL")
    private String backupURL;

    /** */
    @UCloudParam("Labels")
    private List<Labels> labels;

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

    public String getStorageClass() {
        return storageClass;
    }

    public void setStorageClass(String storageClass) {
        this.storageClass = storageClass;
    }

    public String getSpecificationClass() {
        return specificationClass;
    }

    public void setSpecificationClass(String specificationClass) {
        this.specificationClass = specificationClass;
    }

    public String getInstanceMode() {
        return instanceMode;
    }

    public void setInstanceMode(String instanceMode) {
        this.instanceMode = instanceMode;
    }

    public String getMachineType() {
        return machineType;
    }

    public void setMachineType(String machineType) {
        this.machineType = machineType;
    }

    public Integer getCPU() {
        return cpu;
    }

    public void setCPU(Integer cpu) {
        this.cpu = cpu;
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

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getAlarmTemplateId() {
        return alarmTemplateId;
    }

    public void setAlarmTemplateId(String alarmTemplateId) {
        this.alarmTemplateId = alarmTemplateId;
    }

    public String getBackupURL() {
        return backupURL;
    }

    public void setBackupURL(String backupURL) {
        this.backupURL = backupURL;
    }

    public List<Labels> getLabels() {
        return labels;
    }

    public void setLabels(List<Labels> labels) {
        this.labels = labels;
    }

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }

    public static class Labels extends Request {

        /** 用户资源标签的键值 */
        @UCloudParam("Key")
        private String key;

        /** 用户资源标签值 */
        @UCloudParam("Value")
        private String value;

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }
}
