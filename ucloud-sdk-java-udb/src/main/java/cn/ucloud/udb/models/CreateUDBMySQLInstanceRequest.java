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

public class CreateUDBMySQLInstanceRequest extends Request {

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
     * DB类型，mysql按版本细分 mysql-8.4, mysql-8.0, mysql-5.7, percona-5.7, mysql-5.6,
     * percona-5.6、mysql-5.5
     */
    @NotEmpty
    @UCloudParam("DBTypeId")
    private String dbTypeId;

    /** 端口号，mysql默认3306 */
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

    /** 规格类型 ID，请通过 ListUDBMachineType 接口获取，返回体中的ID字段为MachineType的值。 */
    @NotEmpty
    @UCloudParam("MachineType")
    private String machineType;

    /**
     * 存储类型 CLOUD_RSSD: RSSD 云盘， CLOUD_SSD_ESSENTIAL: SSD Essential云盘
     * ，该字段和SpecificationClass组合使用，CLOUD_RSSD对应O型，CLOUD_SSD_ESSENTIAL对应OM型(北京2、乌兰察布支持)，注：圣保罗、丹佛、哈萨克斯坦地域仅支持O2机型，CLOUD_RSSD对应O2型
     */
    @NotEmpty
    @UCloudParam("StorageClass")
    private String storageClass;

    /** 规格类型 O: NVMe型, O2: O2 ,OM: 共享型 */
    @NotEmpty
    @UCloudParam("SpecificationClass")
    private String specificationClass;

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

    /** UDB实例模式类型, 可选值如下: "Normal": 普通版UDB实例 "HA": 高可用版UDB实例 默认是"Normal" */
    @UCloudParam("InstanceMode")
    private String instanceMode;

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

    /** 实例所在的业务组名称 */
    @UCloudParam("Tag")
    private String tag;

    /** MySQL 小版本号，支持指定小版本进行创建，请通过 DescribeUDBType 接口获取可用版本。 */
    @UCloudParam("DBSubVersion")
    private String dbSubVersion;

    /** mysql大小写参数, 0 为大小写敏感, 1 为大小写不敏感, 目前只针对mysql8.0有效 */
    @UCloudParam("CaseSensitivityParam")
    private Integer caseSensitivityParam;

    /** 告警模版id */
    @UCloudParam("AlarmTemplateId")
    private String alarmTemplateId;

    /** 备份文件的US3内网下载地址 */
    @UCloudParam("BackupURL")
    private String backupURL;

    /** 半同步开启开关 1：表示开启半同步，2：表示关闭半同步，0：表示默认值，默认也是开启半同步 */
    @UCloudParam("SemisyncFlag")
    private Integer semisyncFlag;

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

    public Integer getParamGroupId() {
        return paramGroupId;
    }

    public void setParamGroupId(Integer paramGroupId) {
        this.paramGroupId = paramGroupId;
    }

    public String getMachineType() {
        return machineType;
    }

    public void setMachineType(String machineType) {
        this.machineType = machineType;
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

    public String getInstanceMode() {
        return instanceMode;
    }

    public void setInstanceMode(String instanceMode) {
        this.instanceMode = instanceMode;
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

    public Integer getSemisyncFlag() {
        return semisyncFlag;
    }

    public void setSemisyncFlag(Integer semisyncFlag) {
        this.semisyncFlag = semisyncFlag;
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
