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
package cn.ucloud.umem.models;


import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

public class CreateURedisGroupRequest extends Request {

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

    /** 请求创建组的名称 (范围[6-63],只能包含英文、数字以及符号-和_) */
    @NotEmpty
    @UCloudParam("Name")
    private String name;

    /** 是否开启高可用,enable或disable */
    @NotEmpty
    @UCloudParam("HighAvailability")
    private String highAvailability;

    /** 每个节点的内存大小,单位GB,默认1GB,目前仅支持1/2/4/8/16/32,六种 */
    @UCloudParam("Size")
    private Integer size;

    /** 是否自动备份,enable或disable，默认disable */
    @UCloudParam("AutoBackup")
    private String autoBackup;

    /** 自动备份开始时间,范围[0-23],默认3点 */
    @UCloudParam("BackupTime")
    private Integer backupTime;

    /**
     * 配置ID,目前支持 4.0版本配置ID:"6c9298a3-9d7f-428c-b1d0-e87ab3b8a1ea",
     * 5.0版本配置ID:"3cdeeb90-dcbf-46e8-95cd-a05d8860a22c",6.0版本配置ID:"1d990520-aac8-4e0f-9384-f58611e8eb28",7.0版本配置ID:"48dcf534-db41-11ec-a1a6-52670028d520",默认版本4.0,从备份创建为必传项
     */
    @UCloudParam("ConfigId")
    private String configId;

    /** Redis版本信息(详见DescribeURedisVersion返回结果),默认版本4.0 */
    @UCloudParam("Version")
    private String version;

    /** 计费模式，Year , Month, Dynamic 默认: Month */
    @UCloudParam("ChargeType")
    private String chargeType;

    /** 购买时长，默认为1 */
    @UCloudParam("Quantity")
    private Integer quantity;

    /** 业务组名称 */
    @UCloudParam("Tag")
    private String tag;

    /** 初始化密码,需要 base64 编码 */
    @UCloudParam("Password")
    private String password;

    /** 有此项代表从备份中创建，无代表正常创建 */
    @UCloudParam("BackupId")
    private String backupId;

    /** 跨机房URedis，slave所在可用区（必须和Zone在同一Region，且不可相同） */
    @UCloudParam("SlaveZone")
    private String slaveZone;

    /** Master Redis Group的ID，创建只读Slave时，必须填写 */
    @UCloudParam("MasterGroupId")
    private String masterGroupId;

    /** 【即将下线,请勿使用】是否创建使用ipv6 资源， 默认为false， 或者不填， 创建ipv6为true */
    @UCloudParam("EnableIpV6")
    private Boolean enableIpV6;

    /** 子网ID */
    @UCloudParam("SubnetId")
    private String subnetId;

    /** VPC的ID */
    @UCloudParam("VPCId")
    private String vpcId;

    /** 是否创建高性能Redis， 默认为false， 或者不填， 创建高性能为true */
    @UCloudParam("HighPerformance")
    private Boolean highPerformance;

    /** 端口 */
    @UCloudParam("Port")
    private Integer port;

    /** 如果是通过回档创建实例，需要传回档实例的GroupId */
    @UCloudParam("RollbackGroupId")
    private String rollbackGroupId;

    /** 回档的AOF文件ID */
    @UCloudParam("AOFID")
    private String aofid;

    /** 回档时间点 */
    @UCloudParam("RollbackTime")
    private Integer rollbackTime;

    /** 代金券ID */
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

    public String getHighAvailability() {
        return highAvailability;
    }

    public void setHighAvailability(String highAvailability) {
        this.highAvailability = highAvailability;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getAutoBackup() {
        return autoBackup;
    }

    public void setAutoBackup(String autoBackup) {
        this.autoBackup = autoBackup;
    }

    public Integer getBackupTime() {
        return backupTime;
    }

    public void setBackupTime(Integer backupTime) {
        this.backupTime = backupTime;
    }

    public String getConfigId() {
        return configId;
    }

    public void setConfigId(String configId) {
        this.configId = configId;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
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

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBackupId() {
        return backupId;
    }

    public void setBackupId(String backupId) {
        this.backupId = backupId;
    }

    public String getSlaveZone() {
        return slaveZone;
    }

    public void setSlaveZone(String slaveZone) {
        this.slaveZone = slaveZone;
    }

    public String getMasterGroupId() {
        return masterGroupId;
    }

    public void setMasterGroupId(String masterGroupId) {
        this.masterGroupId = masterGroupId;
    }

    public Boolean getEnableIpV6() {
        return enableIpV6;
    }

    public void setEnableIpV6(Boolean enableIpV6) {
        this.enableIpV6 = enableIpV6;
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

    public Boolean getHighPerformance() {
        return highPerformance;
    }

    public void setHighPerformance(Boolean highPerformance) {
        this.highPerformance = highPerformance;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public String getRollbackGroupId() {
        return rollbackGroupId;
    }

    public void setRollbackGroupId(String rollbackGroupId) {
        this.rollbackGroupId = rollbackGroupId;
    }

    public String getAOFID() {
        return aofid;
    }

    public void setAOFID(String aofid) {
        this.aofid = aofid;
    }

    public Integer getRollbackTime() {
        return rollbackTime;
    }

    public void setRollbackTime(Integer rollbackTime) {
        this.rollbackTime = rollbackTime;
    }

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }
}
