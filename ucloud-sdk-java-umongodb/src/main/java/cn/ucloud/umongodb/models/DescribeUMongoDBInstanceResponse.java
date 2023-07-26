/**
 * Copyright 2021 UCloud Technology Co., Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package cn.ucloud.umongodb.models;

import java.util.List;


import com.google.gson.annotations.SerializedName;

import cn.ucloud.common.response.Response;

public class DescribeUMongoDBInstanceResponse extends Response {

    
        
    /**
     * 副本集信息
     */
    @SerializedName("ClusterInfo")
    private ClusterInfo clusterInfo;
        
    
    public ClusterInfo getClusterInfo() {
        return clusterInfo;
    }

    public void setClusterInfo(ClusterInfo clusterInfo) {
        this.clusterInfo = clusterInfo;
    }
    
        public static class ClusterInfo extends Response {
            
        
    /**
     * 可用区
     */
    @SerializedName("Zone")
    private String zone;
        
    
        
    /**
     * 
     */
    @SerializedName("ZoneId")
    private Integer zoneId;
        
    
        
    /**
     * 集群类型，ReplicaSet :副本集，SharedCluster：分片集
     */
    @SerializedName("ClusterType")
    private String clusterType;
        
    
        
    /**
     * 集群ID
     */
    @SerializedName("ClusterId")
    private String clusterId;
        
    
        
    /**
     * 实例名称
     */
    @SerializedName("InstanceName")
    private String instanceName;
        
    
        
    /**
     * 副本集/分片集群状态标记 Initing：初始化中，InitFailed：安装失败，Starting：启动中，StartFailed：启动失败，Running：运行，Stopping：关闭中，Stopped：已关闭, StopFailed：关闭失败，Deleting：删除中，Deleted：已删除，DeleteFailed：删除失败，Restarting：重启中，RestartFailed：重启失败。
     */
    @SerializedName("State")
    private String state;
        
    
        
    /**
     * 副本集的Mongodb的版本
     */
    @SerializedName("DBVersion")
    private String dbVersion;
        
    
        
    /**
     * 磁盘空间(GB), 默认根据配置机型
     */
    @SerializedName("DiskSpace")
    private Integer diskSpace;
        
    
        
    /**
     * 计算规格
     */
    @SerializedName("MachineTypeId")
    private String machineTypeId;
        
    
        
    /**
     * DB实例创建时间
     */
    @SerializedName("CreateTime")
    private Integer createTime;
        
    
        
    /**
     * ConfigSrv信息
     */
    @SerializedName("ConfigReplicaInfo")
    private ReplicaInfo configReplicaInfo;
        
    
        
    /**
     * 数据副本信息 
     */
    @SerializedName("DataReplicaInfos")
    private List<ReplicaInfo> dataReplicaInfos;
        
    
        
    /**
     * Mongos节点信息
     */
    @SerializedName("MongosInfo")
    private List<NodeInfo> mongosInfo;
        
    
        
    /**
     * 副本集的访问地址
     */
    @SerializedName("ConnectURL")
    private String connectURL;
        
    
        
    /**
     * DB实例删除时间
     */
    @SerializedName("DeleteTime")
    private Integer deleteTime;
        
    
        
    /**
     * 子网ID
     */
    @SerializedName("SubnetId")
    private String subnetId;
        
    
        
    /**
     * VPC的ID
     */
    @SerializedName("VPCId")
    private String vpcId;
        
    
        
    /**
     * 分片数量，分片集有效
     */
    @SerializedName("ShardCount")
    private Integer shardCount;
        
    
        
    /**
     * 每分片节点数量，分片集有效
     */
    @SerializedName("ShardNodeCount")
    private Integer shardNodeCount;
        
    
        
    /**
     * Mongos节点数量，分片集有效
     */
    @SerializedName("MongosCount")
    private Integer mongosCount;
        
    
        
    /**
     * Config配置集群节点数量，分片集有效
     */
    @SerializedName("ConfigNodeCount")
    private Integer configNodeCount;
        
    
        
    /**
     * Config配置集群节点配置，分片集有效
     */
    @SerializedName("ConfigMachineType")
    private String configMachineType;
        
    
        
    /**
     * 实例业务组
     */
    @SerializedName("Tag")
    private String tag;
        
    
    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }
    
    public Integer getZoneId() {
        return zoneId;
    }

    public void setZoneId(Integer zoneId) {
        this.zoneId = zoneId;
    }
    
    public String getClusterType() {
        return clusterType;
    }

    public void setClusterType(String clusterType) {
        this.clusterType = clusterType;
    }
    
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }
    
    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }
    
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    
    public String getDBVersion() {
        return dbVersion;
    }

    public void setDBVersion(String dbVersion) {
        this.dbVersion = dbVersion;
    }
    
    public Integer getDiskSpace() {
        return diskSpace;
    }

    public void setDiskSpace(Integer diskSpace) {
        this.diskSpace = diskSpace;
    }
    
    public String getMachineTypeId() {
        return machineTypeId;
    }

    public void setMachineTypeId(String machineTypeId) {
        this.machineTypeId = machineTypeId;
    }
    
    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }
    
    public ReplicaInfo getConfigReplicaInfo() {
        return configReplicaInfo;
    }

    public void setConfigReplicaInfo(ReplicaInfo configReplicaInfo) {
        this.configReplicaInfo = configReplicaInfo;
    }
    
    public List<ReplicaInfo> getDataReplicaInfos() {
        return dataReplicaInfos;
    }

    public void setDataReplicaInfos(List<ReplicaInfo> dataReplicaInfos) {
        this.dataReplicaInfos = dataReplicaInfos;
    }
    
    public List<NodeInfo> getMongosInfo() {
        return mongosInfo;
    }

    public void setMongosInfo(List<NodeInfo> mongosInfo) {
        this.mongosInfo = mongosInfo;
    }
    
    public String getConnectURL() {
        return connectURL;
    }

    public void setConnectURL(String connectURL) {
        this.connectURL = connectURL;
    }
    
    public Integer getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(Integer deleteTime) {
        this.deleteTime = deleteTime;
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
    
    public Integer getShardCount() {
        return shardCount;
    }

    public void setShardCount(Integer shardCount) {
        this.shardCount = shardCount;
    }
    
    public Integer getShardNodeCount() {
        return shardNodeCount;
    }

    public void setShardNodeCount(Integer shardNodeCount) {
        this.shardNodeCount = shardNodeCount;
    }
    
    public Integer getMongosCount() {
        return mongosCount;
    }

    public void setMongosCount(Integer mongosCount) {
        this.mongosCount = mongosCount;
    }
    
    public Integer getConfigNodeCount() {
        return configNodeCount;
    }

    public void setConfigNodeCount(Integer configNodeCount) {
        this.configNodeCount = configNodeCount;
    }
    
    public String getConfigMachineType() {
        return configMachineType;
    }

    public void setConfigMachineType(String configMachineType) {
        this.configMachineType = configMachineType;
    }
    
    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
    
        }
        public static class DiskInfo extends Response {
            
        
    /**
     * 磁盘id
     */
    @SerializedName("DiskId")
    private String diskId;
        
    
        
    /**
     * 磁盘容量单位GB
     */
    @SerializedName("DiskSize")
    private Integer diskSize;
        
    
    public String getDiskId() {
        return diskId;
    }

    public void setDiskId(String diskId) {
        this.diskId = diskId;
    }
    
    public Integer getDiskSize() {
        return diskSize;
    }

    public void setDiskSize(Integer diskSize) {
        this.diskSize = diskSize;
    }
    
        }
        public static class NodeInfo extends Response {
            
        
    /**
     * 可用区
     */
    @SerializedName("Zone")
    private String zone;
        
    
        
    /**
     * 可用区ID
     */
    @SerializedName("ZoneId")
    private Integer zoneId;
        
    
        
    /**
     * 节点ID
     */
    @SerializedName("NodeId")
    private String nodeId;
        
    
        
    /**
     * 节点角色，Primary/Secondary/Arbiter/Startup等等
     */
    @SerializedName("NodeRole")
    private String nodeRole;
        
    
        
    /**
     * 节点类型
     */
    @SerializedName("NodeType")
    private String nodeType;
        
    
        
    /**
     * 副本集/分片集群状态标记 Initing：初始化中，InitFailed：安装失败，Starting：启动中，StartFailed：启动失败，Running：运行，Stopping：关闭中，Stopped：已关闭, StopFailed：关闭失败，Deleting：删除中，Deleted：已删除，DeleteFailed：删除失败，Restarting：重启中，RestartFailed：重启失败。
     */
    @SerializedName("State")
    private String state;
        
    
        
    /**
     * 副本集的Mongodb的版本
     */
    @SerializedName("DBVersion")
    private String dbVersion;
        
    
        
    /**
     * 节点所属副本集ID
     */
    @SerializedName("ClusterId")
    private String clusterId;
        
    
        
    /**
     * 虚拟节点ID
     */
    @SerializedName("VirtualClusterId")
    private String virtualClusterId;
        
    
        
    /**
     * 机型信息
     */
    @SerializedName("MachineType")
    private String machineType;
        
    
        
    /**
     * 机型信息ID
     */
    @SerializedName("MachineTypeId")
    private String machineTypeId;
        
    
        
    /**
     * DB实例创建时间
     */
    @SerializedName("CreateTime")
    private Integer createTime;
        
    
        
    /**
     * 数据盘信息
     */
    @SerializedName("DataDisk")
    private DiskInfo dataDisk;
        
    
        
    /**
     * 系统盘信息
     */
    @SerializedName("SysDisk")
    private DiskInfo sysDisk;
        
    
    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }
    
    public Integer getZoneId() {
        return zoneId;
    }

    public void setZoneId(Integer zoneId) {
        this.zoneId = zoneId;
    }
    
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }
    
    public String getNodeRole() {
        return nodeRole;
    }

    public void setNodeRole(String nodeRole) {
        this.nodeRole = nodeRole;
    }
    
    public String getNodeType() {
        return nodeType;
    }

    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }
    
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    
    public String getDBVersion() {
        return dbVersion;
    }

    public void setDBVersion(String dbVersion) {
        this.dbVersion = dbVersion;
    }
    
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }
    
    public String getVirtualClusterId() {
        return virtualClusterId;
    }

    public void setVirtualClusterId(String virtualClusterId) {
        this.virtualClusterId = virtualClusterId;
    }
    
    public String getMachineType() {
        return machineType;
    }

    public void setMachineType(String machineType) {
        this.machineType = machineType;
    }
    
    public String getMachineTypeId() {
        return machineTypeId;
    }

    public void setMachineTypeId(String machineTypeId) {
        this.machineTypeId = machineTypeId;
    }
    
    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }
    
    public DiskInfo getDataDisk() {
        return dataDisk;
    }

    public void setDataDisk(DiskInfo dataDisk) {
        this.dataDisk = dataDisk;
    }
    
    public DiskInfo getSysDisk() {
        return sysDisk;
    }

    public void setSysDisk(DiskInfo sysDisk) {
        this.sysDisk = sysDisk;
    }
    
        }
        public static class ReplicaInfo extends Response {
            
        
    /**
     * 副本集ID
     */
    @SerializedName("ReplicaId")
    private String replicaId;
        
    
        
    /**
     * 集群ID
     */
    @SerializedName("ClusterId")
    private String clusterId;
        
    
        
    /**
     * 副本类型,ConfigRepl或者DataRepl
     */
    @SerializedName("ReplicaType")
    private String replicaType;
        
    
        
    /**
     * 副本集/分片集群状态标记 Initing：初始化中，InitFailed：安装失败，Starting：启动中，StartFailed：启动失败，Running：运行，Stopping：关闭中，Stopped：已关闭, StopFailed：关闭失败，Deleting：删除中，Deleted：已删除，DeleteFailed：删除失败，Restarting：重启中，RestartFailed：重启失败。
     */
    @SerializedName("State")
    private String state;
        
    
        
    /**
     * 机器类型
     */
    @SerializedName("MachineType")
    private String machineType;
        
    
        
    /**
     * 机器类型Id
     */
    @SerializedName("MachineTypeId")
    private String machineTypeId;
        
    
        
    /**
     * 隔离组ID
     */
    @SerializedName("IsolationGroupId")
    private String isolationGroupId;
        
    
        
    /**
     * 副本集下的节点信息
     */
    @SerializedName("NodeInfos")
    private List<NodeInfo> nodeInfos;
        
    
        
    /**
     * 副本集下的节点数量
     */
    @SerializedName("NodeCount")
    private Integer nodeCount;
        
    
        
    /**
     * 副本集创建时间
     */
    @SerializedName("CreateTime")
    private Integer createTime;
        
    
        
    /**
     * 副本集删除时间
     */
    @SerializedName("DeleteTime")
    private Integer deleteTime;
        
    
        
    /**
     * 副本集修改时间
     */
    @SerializedName("ModifyTime")
    private Integer modifyTime;
        
    
    public String getReplicaId() {
        return replicaId;
    }

    public void setReplicaId(String replicaId) {
        this.replicaId = replicaId;
    }
    
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }
    
    public String getReplicaType() {
        return replicaType;
    }

    public void setReplicaType(String replicaType) {
        this.replicaType = replicaType;
    }
    
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    
    public String getMachineType() {
        return machineType;
    }

    public void setMachineType(String machineType) {
        this.machineType = machineType;
    }
    
    public String getMachineTypeId() {
        return machineTypeId;
    }

    public void setMachineTypeId(String machineTypeId) {
        this.machineTypeId = machineTypeId;
    }
    
    public String getIsolationGroupId() {
        return isolationGroupId;
    }

    public void setIsolationGroupId(String isolationGroupId) {
        this.isolationGroupId = isolationGroupId;
    }
    
    public List<NodeInfo> getNodeInfos() {
        return nodeInfos;
    }

    public void setNodeInfos(List<NodeInfo> nodeInfos) {
        this.nodeInfos = nodeInfos;
    }
    
    public Integer getNodeCount() {
        return nodeCount;
    }

    public void setNodeCount(Integer nodeCount) {
        this.nodeCount = nodeCount;
    }
    
    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }
    
    public Integer getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(Integer deleteTime) {
        this.deleteTime = deleteTime;
    }
    
    public Integer getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Integer modifyTime) {
        this.modifyTime = modifyTime;
    }
    
        }
}









