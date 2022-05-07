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

public class CreateMongoDBReplicaSetRequest extends Request {

    /** 地域。 参见 [地域和可用区列表](../summary/regionlist.html) */
    @NotEmpty
    @UCloudParam("Region")
    private String region;

    /** 可用区。参见 [可用区列表](../summary/regionlist.html) */
    @NotEmpty
    @UCloudParam("Zone")
    private String zone;

    /** 项目ID。不填写为默认项目，子帐号必须填写。 请参考[GetProjectList接口](../summary/get_project_list.html) */
    @UCloudParam("ProjectId")
    private String projectId;

    /** PrimaryDB实例名称，至少6位 */
    @NotEmpty
    @UCloudParam("Name")
    private String name;

    /** 管理员密码 */
    @NotEmpty
    @UCloudParam("AdminPassword")
    private String adminPassword;

    /** DB类型id对应的字符串形式（例如：mongodb-2.6） 注意：当前仅支持mongodb */
    @NotEmpty
    @UCloudParam("DBTypeId")
    private String dbTypeId;

    /** 磁盘空间(GB), 暂时支持20G - 3000G */
    @NotEmpty
    @UCloudParam("DiskSpace")
    private Integer diskSpace;

    /** DB实例使用的配置参数组id */
    @NotEmpty
    @UCloudParam("ParamGroupId")
    private Integer paramGroupId;

    /**
     * 内存限制(MB)，目前支持以下几档 1000M/2000M/4000M/ 6000M/8000M/12000M/16000M/ 24000M/32000M/48000M/
     * 64000M/96000M
     */
    @NotEmpty
    @UCloudParam("MemoryLimit")
    private Integer memoryLimit;

    /** 端口号 */
    @NotEmpty
    @UCloudParam("Port")
    private Integer port;

    /** Year， Month， Dynamic，Trial，默认: Month */
    @UCloudParam("ChargeType")
    private String chargeType;

    /** 购买时长(N个月)，默认值1个月。如果为0，代表购买到月底。 */
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

    /** 是否使用SSD，默认为true */
    @UCloudParam("UseSSD")
    private Boolean useSSD;

    /** SSD类型，可选值为"SATA"、"PCI-E"，如果UseSSD为true ，则必选 */
    @UCloudParam("SSDType")
    private String ssdType;

    /** cpu核数 */
    @UCloudParam("CPU")
    private Integer cpu;

    /** UDB数据库机型 */
    @UCloudParam("InstanceType")
    private String instanceType;

    /** 子网ID */
    @UCloudParam("SubnetId")
    private String subnetId;

    /** VPC的ID */
    @UCloudParam("VPCId")
    private String vpcId;

    /** 所属分片集群的ID */
    @UCloudParam("ClusterId")
    private String clusterId;

    /** CouponId.0 代表第一个代金券id，对于传入多个代金券id，后面为 CouponId.1, CouponId.2 以此类推 */
    @UCloudParam("CouponId")
    private List<String> couponId;

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

    public String getSSDType() {
        return ssdType;
    }

    public void setSSDType(String ssdType) {
        this.ssdType = ssdType;
    }

    public Integer getCPU() {
        return cpu;
    }

    public void setCPU(Integer cpu) {
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

    public String getVPCId() {
        return vpcId;
    }

    public void setVPCId(String vpcId) {
        this.vpcId = vpcId;
    }

    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public List<String> getCouponId() {
        return couponId;
    }

    public void setCouponId(List<String> couponId) {
        this.couponId = couponId;
    }
}
