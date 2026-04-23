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
package cn.ucloud.uclickhouse.models;

import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

import java.util.List;

public class CreateUClickhouseClusterRequest extends Request {

    /** 地域。 参见 [地域和可用区列表](https://docs.ucloud.cn/api/summary/regionlist) */
    @NotEmpty
    @UCloudParam("Region")
    private String region;

    /**
     * 项目ID。不填写为默认项目，子帐号必须填写。
     * 请参考[GetProjectList接口](https://docs.ucloud.cn/api/summary/get_project_list)
     */
    @UCloudParam("ProjectId")
    private String projectId;

    /** 集群机型，可通过GetUClickhouseClusterCreateOption接口获取具体值 */
    @NotEmpty
    @UCloudParam("ClickhouseMachineTypeId")
    private String clickhouseMachineTypeId;

    /** 数据盘类型，可通过GetUClickhouseClusterCreateOption接口获取具体值 */
    @NotEmpty
    @UCloudParam("DataDiskType")
    private String dataDiskType;

    /** Clickhouse版本，可通过GetUClickhouseClusterCreateOption接口获取具体版本 */
    @NotEmpty
    @UCloudParam("ClickhouseVersion")
    private String clickhouseVersion;

    /** VPC ID */
    @NotEmpty
    @UCloudParam("VPCId")
    private String vpcId;

    /** 子网ID */
    @NotEmpty
    @UCloudParam("SubnetId")
    private String subnetId;

    /**
     * 集群管理员密码，密码规则： 1.密码长度限8-32个字符 2.不能包含[A-Z],[a-z],[0-9]和[@#%^*+=_;:,?!&()-]之外的字符
     * 3.需要同时包含两项或以上（大写字母/小写字母/数字/特殊符号）
     */
    @NotEmpty
    @UCloudParam("AdminPassword")
    private String adminPassword;

    /** 分片数量，若传递，则至少1个分片,默认值为1 */
    @UCloudParam("ShardCount")
    private Integer shardCount;

    /** 副本数量，取值为1或2，1为单副本（非高可用），2为双副本（高可用），默认值为高可用（即为2） */
    @UCloudParam("ReplicateCount")
    private Integer replicateCount;

    /** 数据盘大小，最小100，步长为50，默认值为100，单位GB */
    @UCloudParam("DataDiskSize")
    private Integer dataDiskSize;

    /** 付费类型，枚举值：Year（年付），Month（月付），Dynamic（时付），默认值为Month,月付 */
    @UCloudParam("ChargeType")
    private String chargeType;

    /** 购买时长，默认值为1。月付时，此参数传0，代表购买至月末 */
    @UCloudParam("Quantity")
    private Integer quantity;

    /** 备份任务ID，从备份恢复时，该字段必传，此值为备份任务ID，可以从原集群备份任务列表（ListUClickhouseBackups）获取 */
    @UCloudParam("BackupId")
    private String backupId;

    /** 实例名称 名称规则： 1.长度为1-50位的字符 2.不能包含_,中文,[A-Z],[a-z],[0-9]之外的非法字符，集群名称默认为clickhouse */
    @UCloudParam("ClusterName")
    private String clusterName;

    /** 是否Zookeeper高可用，true为zookeeper高可用，false为非高可用，默认为true，高可用 */
    @UCloudParam("IsZookeeperHA")
    private Boolean isZookeeperHA;

    /** 是否开启安全组，true为开启，false为不开启，默认为false，不开启安全组 */
    @UCloudParam("IsSecGroup")
    private String isSecGroup;

    /** 是否多可用区，默认为false */
    @UCloudParam("IsMultiZone")
    private String isMultiZone;

    /** Zookeeper机型ID，IsZookeeperHA为true时，必传，可通过GetUClickhouseClusterCreateOption接口获取具体值 */
    @UCloudParam("ZookeeperMachineTypeId")
    private String zookeeperMachineTypeId;

    /** Zookeeper数据盘类型，IsZookeeperHA为true时，必传，可通过GetUClickhouseClusterCreateOption接口获取具体值 */
    @UCloudParam("ZookeeperDataDiskType")
    private String zookeeperDataDiskType;

    /** Zookeeper数据盘大小，IsZookeeperHA为true时，必传，最小100，步长为50 */
    @UCloudParam("ZookeeperDataDiskSize")
    private String zookeeperDataDiskSize;

    /** 安全组ID，IsSecGroup为true时，必传 */
    @UCloudParam("SecGroupIds")
    private String secGroupIds;

    /** 【数组】可用区名称，IsMultiZone为true时，必传，可通过ListUClickhouseAvailableZone获取支持的可用区 */
    @UCloudParam("MultiZones")
    private List<String> multiZones;

    /** */
    @UCloudParam("Labels")
    private List<Labels> labels;

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getClickhouseMachineTypeId() {
        return clickhouseMachineTypeId;
    }

    public void setClickhouseMachineTypeId(String clickhouseMachineTypeId) {
        this.clickhouseMachineTypeId = clickhouseMachineTypeId;
    }

    public String getDataDiskType() {
        return dataDiskType;
    }

    public void setDataDiskType(String dataDiskType) {
        this.dataDiskType = dataDiskType;
    }

    public String getClickhouseVersion() {
        return clickhouseVersion;
    }

    public void setClickhouseVersion(String clickhouseVersion) {
        this.clickhouseVersion = clickhouseVersion;
    }

    public String getVPCId() {
        return vpcId;
    }

    public void setVPCId(String vpcId) {
        this.vpcId = vpcId;
    }

    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    public Integer getShardCount() {
        return shardCount;
    }

    public void setShardCount(Integer shardCount) {
        this.shardCount = shardCount;
    }

    public Integer getReplicateCount() {
        return replicateCount;
    }

    public void setReplicateCount(Integer replicateCount) {
        this.replicateCount = replicateCount;
    }

    public Integer getDataDiskSize() {
        return dataDiskSize;
    }

    public void setDataDiskSize(Integer dataDiskSize) {
        this.dataDiskSize = dataDiskSize;
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

    public String getBackupId() {
        return backupId;
    }

    public void setBackupId(String backupId) {
        this.backupId = backupId;
    }

    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    public Boolean getIsZookeeperHA() {
        return isZookeeperHA;
    }

    public void setIsZookeeperHA(Boolean isZookeeperHA) {
        this.isZookeeperHA = isZookeeperHA;
    }

    public String getIsSecGroup() {
        return isSecGroup;
    }

    public void setIsSecGroup(String isSecGroup) {
        this.isSecGroup = isSecGroup;
    }

    public String getIsMultiZone() {
        return isMultiZone;
    }

    public void setIsMultiZone(String isMultiZone) {
        this.isMultiZone = isMultiZone;
    }

    public String getZookeeperMachineTypeId() {
        return zookeeperMachineTypeId;
    }

    public void setZookeeperMachineTypeId(String zookeeperMachineTypeId) {
        this.zookeeperMachineTypeId = zookeeperMachineTypeId;
    }

    public String getZookeeperDataDiskType() {
        return zookeeperDataDiskType;
    }

    public void setZookeeperDataDiskType(String zookeeperDataDiskType) {
        this.zookeeperDataDiskType = zookeeperDataDiskType;
    }

    public String getZookeeperDataDiskSize() {
        return zookeeperDataDiskSize;
    }

    public void setZookeeperDataDiskSize(String zookeeperDataDiskSize) {
        this.zookeeperDataDiskSize = zookeeperDataDiskSize;
    }

    public String getSecGroupIds() {
        return secGroupIds;
    }

    public void setSecGroupIds(String secGroupIds) {
        this.secGroupIds = secGroupIds;
    }

    public List<String> getMultiZones() {
        return multiZones;
    }

    public void setMultiZones(List<String> multiZones) {
        this.multiZones = multiZones;
    }

    public List<Labels> getLabels() {
        return labels;
    }

    public void setLabels(List<Labels> labels) {
        this.labels = labels;
    }

    public static class Labels extends Request {

        /** 标签的key */
        @UCloudParam("Key")
        private String key;

        /** 标签的value */
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
