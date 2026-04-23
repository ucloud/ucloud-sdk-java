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

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ListUClickhouseClusterResponse extends Response {

    /** 返回数据 */
    @SerializedName("Data")
    private ListUClickhouseClusterResponseData data;

    public ListUClickhouseClusterResponseData getData() {
        return data;
    }

    public void setData(ListUClickhouseClusterResponseData data) {
        this.data = data;
    }

    public static class ClickhouseCluster extends Response {

        /** 集群ID */
        @SerializedName("ClusterId")
        private String clusterId;

        /** 公司ID */
        @SerializedName("TopOrganizationId")
        private Integer topOrganizationId;

        /** 项目ID */
        @SerializedName("OrganizationId")
        private Integer organizationId;

        /** 集群名称 */
        @SerializedName("ClusterName")
        private String clusterName;

        /** VPCID */
        @SerializedName("VPCId")
        private String vpcId;

        /** 子网ID */
        @SerializedName("SubnetId")
        private String subnetId;

        /** 集群版本 */
        @SerializedName("ClickhouseVersion")
        private String clickhouseVersion;

        /** Zookeeper版本 */
        @SerializedName("ZookeeperVersion")
        private String zookeeperVersion;

        /** 机型 */
        @SerializedName("MachineType")
        private String machineType;

        /**
         * 集群状态： CREATING（创建中）、 RUNNING（运行中）、 RESIZING（变配中）、 RESTARTING（重启中）、 UPGRADING（升级中）、
         * DESTROYING（销毁中）、 DESTROYED（已删除）、 CREATE_FAILED（创建失败）、 RESTART_FAILED（重启失败）、
         * DESTROY_FAILED（删除失败）、 RESIZE_FAILED（变配失败）、 BACKUP_RESTORING（备份恢复中）、
         * BACKUP_RESTORE_FAILED（备份恢复失败）、 EXPANDING（扩容中）、 EXPAND_FAILED（扩容失败）
         */
        @SerializedName("Status")
        private String status;

        /** 分片数 */
        @SerializedName("ShardCount")
        private Integer shardCount;

        /** 副本数 */
        @SerializedName("ReplicateCount")
        private Integer replicateCount;

        /** 集群创建时间 */
        @SerializedName("CreateTimestamp")
        private Integer createTimestamp;

        /** Clickhouse机型ID */
        @SerializedName("ClickhouseMachineTypeId")
        private String clickhouseMachineTypeId;

        /** Clickhouse机型名称 */
        @SerializedName("ClickhouseMachineTypeName")
        private String clickhouseMachineTypeName;

        /** 地域ID */
        @SerializedName("RegionId")
        private Integer regionId;

        /** Zookeeper机型ID */
        @SerializedName("ZookeeperMachineTypeId")
        private String zookeeperMachineTypeId;

        /** Zookeeper机型名称 */
        @SerializedName("ZookeeperMachineTypeName")
        private String zookeeperMachineTypeName;

        /** Clickhouse数据盘类型 */
        @SerializedName("ClickhouseDataDiskType")
        private String clickhouseDataDiskType;

        /** Clickhouse数据盘大小 */
        @SerializedName("ClickhouseDataDiskSize")
        private Integer clickhouseDataDiskSize;

        /** Zookeeper数据盘类型 */
        @SerializedName("ZookeeperDataDiskType")
        private String zookeeperDataDiskType;

        /** Zookeeper数据盘大小 */
        @SerializedName("ZookeeperDataDiskSize")
        private Integer zookeeperDataDiskSize;

        /** Clickhouse节点CPU */
        @SerializedName("ClickhouseNodeCPU")
        private Integer clickhouseNodeCPU;

        /** Clickhouse内存 */
        @SerializedName("ClickhouseNodeMemory")
        private Integer clickhouseNodeMemory;

        /** Zookeeper节点CPU */
        @SerializedName("ZookeeperNodeCPU")
        private Integer zookeeperNodeCPU;

        /** Zookeeper节点内存 */
        @SerializedName("ZookeeperNodeMemory")
        private Integer zookeeperNodeMemory;

        /** Zookeeper是否高可用 */
        @SerializedName("IsZookeeperHA")
        private String isZookeeperHA;

        /** 实例是否开启安全组 */
        @SerializedName("IsSecgroup")
        private String isSecgroup;

        /** 实例是否开启备份 */
        @SerializedName("IsBackup")
        private String isBackup;

        /** 实例是否开启冷热分层 */
        @SerializedName("IsTieredStorage")
        private String isTieredStorage;

        /** 实例所在可用区 */
        @SerializedName("MultiZones")
        private List<String> multiZones;

        /** 实例过期时间 */
        @SerializedName("ExpireTimestamp")
        private Double expireTimestamp;

        public String getClusterId() {
            return clusterId;
        }

        public void setClusterId(String clusterId) {
            this.clusterId = clusterId;
        }

        public Integer getTopOrganizationId() {
            return topOrganizationId;
        }

        public void setTopOrganizationId(Integer topOrganizationId) {
            this.topOrganizationId = topOrganizationId;
        }

        public Integer getOrganizationId() {
            return organizationId;
        }

        public void setOrganizationId(Integer organizationId) {
            this.organizationId = organizationId;
        }

        public String getClusterName() {
            return clusterName;
        }

        public void setClusterName(String clusterName) {
            this.clusterName = clusterName;
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

        public String getClickhouseVersion() {
            return clickhouseVersion;
        }

        public void setClickhouseVersion(String clickhouseVersion) {
            this.clickhouseVersion = clickhouseVersion;
        }

        public String getZookeeperVersion() {
            return zookeeperVersion;
        }

        public void setZookeeperVersion(String zookeeperVersion) {
            this.zookeeperVersion = zookeeperVersion;
        }

        public String getMachineType() {
            return machineType;
        }

        public void setMachineType(String machineType) {
            this.machineType = machineType;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
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

        public Integer getCreateTimestamp() {
            return createTimestamp;
        }

        public void setCreateTimestamp(Integer createTimestamp) {
            this.createTimestamp = createTimestamp;
        }

        public String getClickhouseMachineTypeId() {
            return clickhouseMachineTypeId;
        }

        public void setClickhouseMachineTypeId(String clickhouseMachineTypeId) {
            this.clickhouseMachineTypeId = clickhouseMachineTypeId;
        }

        public String getClickhouseMachineTypeName() {
            return clickhouseMachineTypeName;
        }

        public void setClickhouseMachineTypeName(String clickhouseMachineTypeName) {
            this.clickhouseMachineTypeName = clickhouseMachineTypeName;
        }

        public Integer getRegionId() {
            return regionId;
        }

        public void setRegionId(Integer regionId) {
            this.regionId = regionId;
        }

        public String getZookeeperMachineTypeId() {
            return zookeeperMachineTypeId;
        }

        public void setZookeeperMachineTypeId(String zookeeperMachineTypeId) {
            this.zookeeperMachineTypeId = zookeeperMachineTypeId;
        }

        public String getZookeeperMachineTypeName() {
            return zookeeperMachineTypeName;
        }

        public void setZookeeperMachineTypeName(String zookeeperMachineTypeName) {
            this.zookeeperMachineTypeName = zookeeperMachineTypeName;
        }

        public String getClickhouseDataDiskType() {
            return clickhouseDataDiskType;
        }

        public void setClickhouseDataDiskType(String clickhouseDataDiskType) {
            this.clickhouseDataDiskType = clickhouseDataDiskType;
        }

        public Integer getClickhouseDataDiskSize() {
            return clickhouseDataDiskSize;
        }

        public void setClickhouseDataDiskSize(Integer clickhouseDataDiskSize) {
            this.clickhouseDataDiskSize = clickhouseDataDiskSize;
        }

        public String getZookeeperDataDiskType() {
            return zookeeperDataDiskType;
        }

        public void setZookeeperDataDiskType(String zookeeperDataDiskType) {
            this.zookeeperDataDiskType = zookeeperDataDiskType;
        }

        public Integer getZookeeperDataDiskSize() {
            return zookeeperDataDiskSize;
        }

        public void setZookeeperDataDiskSize(Integer zookeeperDataDiskSize) {
            this.zookeeperDataDiskSize = zookeeperDataDiskSize;
        }

        public Integer getClickhouseNodeCPU() {
            return clickhouseNodeCPU;
        }

        public void setClickhouseNodeCPU(Integer clickhouseNodeCPU) {
            this.clickhouseNodeCPU = clickhouseNodeCPU;
        }

        public Integer getClickhouseNodeMemory() {
            return clickhouseNodeMemory;
        }

        public void setClickhouseNodeMemory(Integer clickhouseNodeMemory) {
            this.clickhouseNodeMemory = clickhouseNodeMemory;
        }

        public Integer getZookeeperNodeCPU() {
            return zookeeperNodeCPU;
        }

        public void setZookeeperNodeCPU(Integer zookeeperNodeCPU) {
            this.zookeeperNodeCPU = zookeeperNodeCPU;
        }

        public Integer getZookeeperNodeMemory() {
            return zookeeperNodeMemory;
        }

        public void setZookeeperNodeMemory(Integer zookeeperNodeMemory) {
            this.zookeeperNodeMemory = zookeeperNodeMemory;
        }

        public String getIsZookeeperHA() {
            return isZookeeperHA;
        }

        public void setIsZookeeperHA(String isZookeeperHA) {
            this.isZookeeperHA = isZookeeperHA;
        }

        public String getIsSecgroup() {
            return isSecgroup;
        }

        public void setIsSecgroup(String isSecgroup) {
            this.isSecgroup = isSecgroup;
        }

        public String getIsBackup() {
            return isBackup;
        }

        public void setIsBackup(String isBackup) {
            this.isBackup = isBackup;
        }

        public String getIsTieredStorage() {
            return isTieredStorage;
        }

        public void setIsTieredStorage(String isTieredStorage) {
            this.isTieredStorage = isTieredStorage;
        }

        public List<String> getMultiZones() {
            return multiZones;
        }

        public void setMultiZones(List<String> multiZones) {
            this.multiZones = multiZones;
        }

        public Double getExpireTimestamp() {
            return expireTimestamp;
        }

        public void setExpireTimestamp(Double expireTimestamp) {
            this.expireTimestamp = expireTimestamp;
        }
    }

    public static class ListUClickhouseClusterResponseData extends Response {

        /** 集群列表 */
        @SerializedName("Clusters")
        private ClickhouseCluster clusters;

        /** 集群总数 */
        @SerializedName("TotalCount")
        private Integer totalCount;

        public ClickhouseCluster getClusters() {
            return clusters;
        }

        public void setClusters(ClickhouseCluster clusters) {
            this.clusters = clusters;
        }

        public Integer getTotalCount() {
            return totalCount;
        }

        public void setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
        }
    }
}
