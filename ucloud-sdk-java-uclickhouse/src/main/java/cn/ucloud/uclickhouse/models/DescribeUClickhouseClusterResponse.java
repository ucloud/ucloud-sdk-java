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

public class DescribeUClickhouseClusterResponse extends Response {

    /** 返回数据 */
    @SerializedName("Data")
    private DescribeUClickhouseClusterResponseData data;

    public DescribeUClickhouseClusterResponseData getData() {
        return data;
    }

    public void setData(DescribeUClickhouseClusterResponseData data) {
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

    public static class ClickhouseNode extends Response {

        /** 可用区名称 */
        @SerializedName("Zone")
        private String zone;

        /** 节点ID */
        @SerializedName("NodeId")
        private String nodeId;

        /** 集群ID */
        @SerializedName("ClusterId")
        private String clusterId;

        /** 节点名称 */
        @SerializedName("NodeName")
        private String nodeName;

        /** CPU大小 */
        @SerializedName("CPU")
        private Integer cpu;

        /** 内存，GB */
        @SerializedName("Memory")
        private Integer memory;

        /** 系统盘大小,GB */
        @SerializedName("SysDiskSize")
        private Integer sysDiskSize;

        /** 系统盘类型 */
        @SerializedName("SysDiskType")
        private String sysDiskType;

        /** 数据盘大小,GB */
        @SerializedName("DataDiskSize")
        private Integer dataDiskSize;

        /** 数据盘类型 */
        @SerializedName("DataDiskType")
        private String dataDiskType;

        /** ipv4 */
        @SerializedName("IPv4")
        private String iPv4;

        /** 创建时间 */
        @SerializedName("CreateTimestamp")
        private Integer createTimestamp;

        /** 机型 */
        @SerializedName("MachineType")
        private String machineType;

        /** 分片组 */
        @SerializedName("ShardGroup")
        private String shardGroup;

        /** 服务状态： RUNNING（运行中）、 STARTING（启动中）、 STOPPED（已停止）、 RESTARTING（重启中） */
        @SerializedName("ServiceStatus")
        private String serviceStatus;

        /** 资源ID */
        @SerializedName("ResourceId")
        private String resourceId;

        public String getZone() {
            return zone;
        }

        public void setZone(String zone) {
            this.zone = zone;
        }

        public String getNodeId() {
            return nodeId;
        }

        public void setNodeId(String nodeId) {
            this.nodeId = nodeId;
        }

        public String getClusterId() {
            return clusterId;
        }

        public void setClusterId(String clusterId) {
            this.clusterId = clusterId;
        }

        public String getNodeName() {
            return nodeName;
        }

        public void setNodeName(String nodeName) {
            this.nodeName = nodeName;
        }

        public Integer getCPU() {
            return cpu;
        }

        public void setCPU(Integer cpu) {
            this.cpu = cpu;
        }

        public Integer getMemory() {
            return memory;
        }

        public void setMemory(Integer memory) {
            this.memory = memory;
        }

        public Integer getSysDiskSize() {
            return sysDiskSize;
        }

        public void setSysDiskSize(Integer sysDiskSize) {
            this.sysDiskSize = sysDiskSize;
        }

        public String getSysDiskType() {
            return sysDiskType;
        }

        public void setSysDiskType(String sysDiskType) {
            this.sysDiskType = sysDiskType;
        }

        public Integer getDataDiskSize() {
            return dataDiskSize;
        }

        public void setDataDiskSize(Integer dataDiskSize) {
            this.dataDiskSize = dataDiskSize;
        }

        public String getDataDiskType() {
            return dataDiskType;
        }

        public void setDataDiskType(String dataDiskType) {
            this.dataDiskType = dataDiskType;
        }

        public String getIPv4() {
            return iPv4;
        }

        public void setIPv4(String iPv4) {
            this.iPv4 = iPv4;
        }

        public Integer getCreateTimestamp() {
            return createTimestamp;
        }

        public void setCreateTimestamp(Integer createTimestamp) {
            this.createTimestamp = createTimestamp;
        }

        public String getMachineType() {
            return machineType;
        }

        public void setMachineType(String machineType) {
            this.machineType = machineType;
        }

        public String getShardGroup() {
            return shardGroup;
        }

        public void setShardGroup(String shardGroup) {
            this.shardGroup = shardGroup;
        }

        public String getServiceStatus() {
            return serviceStatus;
        }

        public void setServiceStatus(String serviceStatus) {
            this.serviceStatus = serviceStatus;
        }

        public String getResourceId() {
            return resourceId;
        }

        public void setResourceId(String resourceId) {
            this.resourceId = resourceId;
        }
    }

    public static class DescribeUClickhouseClusterResponseData extends Response {

        /** Zookeeper节点列表，为空时，说明该集群没有zookeeper集群 */
        @SerializedName("ZookeeperNodes")
        private List<ZookeeperNode> zookeeperNodes;

        /** Clickhouse节点列表 */
        @SerializedName("ClickhouseNodes")
        private List<ClickhouseNode> clickhouseNodes;

        /** 支付信息 */
        @SerializedName("Payment")
        private Payment payment;

        /** 集群信息 */
        @SerializedName("Cluster")
        private ClickhouseCluster cluster;

        public List<ZookeeperNode> getZookeeperNodes() {
            return zookeeperNodes;
        }

        public void setZookeeperNodes(List<ZookeeperNode> zookeeperNodes) {
            this.zookeeperNodes = zookeeperNodes;
        }

        public List<ClickhouseNode> getClickhouseNodes() {
            return clickhouseNodes;
        }

        public void setClickhouseNodes(List<ClickhouseNode> clickhouseNodes) {
            this.clickhouseNodes = clickhouseNodes;
        }

        public Payment getPayment() {
            return payment;
        }

        public void setPayment(Payment payment) {
            this.payment = payment;
        }

        public ClickhouseCluster getCluster() {
            return cluster;
        }

        public void setCluster(ClickhouseCluster cluster) {
            this.cluster = cluster;
        }
    }

    public static class Payment extends Response {

        /** 创建时间 */
        @SerializedName("CreateTimestamp")
        private Integer createTimestamp;

        /** 过期时间 */
        @SerializedName("ExpireTimestamp")
        private Integer expireTimestamp;

        /** 支付类型 */
        @SerializedName("ChargeType")
        private String chargeType;

        /** 价格 */
        @SerializedName("Price")
        private Integer price;

        /** 原始价格 */
        @SerializedName("OriginalPrice")
        private Integer originalPrice;

        /** 资源ID */
        @SerializedName("ResourceId")
        private String resourceId;

        public Integer getCreateTimestamp() {
            return createTimestamp;
        }

        public void setCreateTimestamp(Integer createTimestamp) {
            this.createTimestamp = createTimestamp;
        }

        public Integer getExpireTimestamp() {
            return expireTimestamp;
        }

        public void setExpireTimestamp(Integer expireTimestamp) {
            this.expireTimestamp = expireTimestamp;
        }

        public String getChargeType() {
            return chargeType;
        }

        public void setChargeType(String chargeType) {
            this.chargeType = chargeType;
        }

        public Integer getPrice() {
            return price;
        }

        public void setPrice(Integer price) {
            this.price = price;
        }

        public Integer getOriginalPrice() {
            return originalPrice;
        }

        public void setOriginalPrice(Integer originalPrice) {
            this.originalPrice = originalPrice;
        }

        public String getResourceId() {
            return resourceId;
        }

        public void setResourceId(String resourceId) {
            this.resourceId = resourceId;
        }
    }

    public static class ZookeeperNode extends Response {

        /** 可用区名称 */
        @SerializedName("Zone")
        private String zone;

        /** 节点ID */
        @SerializedName("NodeId")
        private String nodeId;

        /** 集群ID */
        @SerializedName("ClusterId")
        private String clusterId;

        /** 节点名称 */
        @SerializedName("NodeName")
        private String nodeName;

        /** CPU */
        @SerializedName("CPU")
        private Integer cpu;

        /** 内存 */
        @SerializedName("Memory")
        private Integer memory;

        /** 系统盘大小 */
        @SerializedName("SysDiskSize")
        private Integer sysDiskSize;

        /** 系统盘类型 */
        @SerializedName("SysDiskType")
        private String sysDiskType;

        /** 数据盘大小 */
        @SerializedName("DataDiskSize")
        private Integer dataDiskSize;

        /** 数据盘类型 */
        @SerializedName("DataDiskType")
        private String dataDiskType;

        /** 创建时间 */
        @SerializedName("CreateTimestamp")
        private Integer createTimestamp;

        /** 机型 */
        @SerializedName("MachineType")
        private String machineType;

        /** zookeeper的myid */
        @SerializedName("ZookeeperMyId")
        private String zookeeperMyId;

        /** 服务状态： RUNNING（运行中）、 STARTING（启动中）、 STOPPED（已停止）、 RESTARTING（重启中） */
        @SerializedName("ServiceStatus")
        private String serviceStatus;

        /** 资源ID */
        @SerializedName("ResourceId")
        private String resourceId;

        public String getZone() {
            return zone;
        }

        public void setZone(String zone) {
            this.zone = zone;
        }

        public String getNodeId() {
            return nodeId;
        }

        public void setNodeId(String nodeId) {
            this.nodeId = nodeId;
        }

        public String getClusterId() {
            return clusterId;
        }

        public void setClusterId(String clusterId) {
            this.clusterId = clusterId;
        }

        public String getNodeName() {
            return nodeName;
        }

        public void setNodeName(String nodeName) {
            this.nodeName = nodeName;
        }

        public Integer getCPU() {
            return cpu;
        }

        public void setCPU(Integer cpu) {
            this.cpu = cpu;
        }

        public Integer getMemory() {
            return memory;
        }

        public void setMemory(Integer memory) {
            this.memory = memory;
        }

        public Integer getSysDiskSize() {
            return sysDiskSize;
        }

        public void setSysDiskSize(Integer sysDiskSize) {
            this.sysDiskSize = sysDiskSize;
        }

        public String getSysDiskType() {
            return sysDiskType;
        }

        public void setSysDiskType(String sysDiskType) {
            this.sysDiskType = sysDiskType;
        }

        public Integer getDataDiskSize() {
            return dataDiskSize;
        }

        public void setDataDiskSize(Integer dataDiskSize) {
            this.dataDiskSize = dataDiskSize;
        }

        public String getDataDiskType() {
            return dataDiskType;
        }

        public void setDataDiskType(String dataDiskType) {
            this.dataDiskType = dataDiskType;
        }

        public Integer getCreateTimestamp() {
            return createTimestamp;
        }

        public void setCreateTimestamp(Integer createTimestamp) {
            this.createTimestamp = createTimestamp;
        }

        public String getMachineType() {
            return machineType;
        }

        public void setMachineType(String machineType) {
            this.machineType = machineType;
        }

        public String getZookeeperMyId() {
            return zookeeperMyId;
        }

        public void setZookeeperMyId(String zookeeperMyId) {
            this.zookeeperMyId = zookeeperMyId;
        }

        public String getServiceStatus() {
            return serviceStatus;
        }

        public void setServiceStatus(String serviceStatus) {
            this.serviceStatus = serviceStatus;
        }

        public String getResourceId() {
            return resourceId;
        }

        public void setResourceId(String resourceId) {
            this.resourceId = resourceId;
        }
    }
}
