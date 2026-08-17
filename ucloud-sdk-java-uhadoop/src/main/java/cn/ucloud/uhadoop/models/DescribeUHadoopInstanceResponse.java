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
package cn.ucloud.uhadoop.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DescribeUHadoopInstanceResponse extends Response {

    /** 集群信息 */
    @SerializedName("ClusterSet")
    private List<ClusterInfo> clusterSet;

    public List<ClusterInfo> getClusterSet() {
        return clusterSet;
    }

    public void setClusterSet(List<ClusterInfo> clusterSet) {
        this.clusterSet = clusterSet;
    }

    public static class AppConfig extends Response {

        /** 需要安装的应用如：Hive,HBase, Spark,Hue,Pig等其他组件 */
        @SerializedName("AppName")
        private String appName;

        /** 应用的版本号(0.13.1,0.98.6 等等) */
        @SerializedName("AppVersion")
        private String appVersion;

        /**
         * 应用的状态(运行中)'Running'｜(已停止)'Stopped'｜(启动中)'Starting'｜(停止中)'Stopping'|(启动失败)'StartFailed'|(停止失败)'StopFailed'|(安装中)'Installing'|(安装失败)'InstallFailed'|(未安装)'NotInstalled',
         */
        @SerializedName("AppStatus")
        private String appStatus;

        public String getAppName() {
            return appName;
        }

        public void setAppName(String appName) {
            this.appName = appName;
        }

        public String getAppVersion() {
            return appVersion;
        }

        public void setAppVersion(String appVersion) {
            this.appVersion = appVersion;
        }

        public String getAppStatus() {
            return appStatus;
        }

        public void setAppStatus(String appStatus) {
            this.appStatus = appStatus;
        }
    }

    public static class ClusterInfo extends Response {

        /** 可用区 */
        @SerializedName("Zone")
        private String zone;

        /** 集群Tag */
        @SerializedName("Tag")
        private String tag;

        /** 实例ID */
        @SerializedName("InstanceId")
        private String instanceId;

        /** 实例名称 */
        @SerializedName("InstanceName")
        private String instanceName;

        /**
         * 框架，值为'Hadoop'|'HDFS'|'MR'|'StarRocks'之一,框架，例如Hadoop|MR|HDFS|StarRocks Hadoop框架包含存储与计算服务
         * MR集群包含计算服务 HDFS只包含存储服务,StarRocks为StarRocks集群
         */
        @SerializedName("Framework")
        private String framework;

        /** VPC ID */
        @SerializedName("VPCId")
        private String vpcId;

        /** 子网ID */
        @SerializedName("SubnetId")
        private String subnetId;

        /** 业务组ID */
        @SerializedName("BusinessId")
        private String businessId;

        /** Uhadoop版本，值为 uhadoop 3.0|uhadoop 2.2|uhadoop 3.1 */
        @SerializedName("ReleaseVersion")
        private String releaseVersion;

        /** Hadoop版本，值为 hadoop3.2.1-udh3.0|hadoop3.3.4-udh3.1 |hadoop2.8.5-udh2.2 */
        @SerializedName("HadoopVersion")
        private String hadoopVersion;

        /** 创建时间 */
        @SerializedName("CreateTime")
        private String createTime;

        /** 付费类型 */
        @SerializedName("ChargeType")
        private String chargeType;

        /** 到期时间 */
        @SerializedName("ExpireTime")
        private String expireTime;

        /**
         * 状态，值为以下其中之一，Running(运行中)|Creating(创建中)|CreateFailed(创建失败)|Deploying(部署中)|Updating(变更中)
         */
        @SerializedName("State")
        private String state;

        /** Master节点数量 */
        @SerializedName("MasterCount")
        private String masterCount;

        /** core节点数量 */
        @SerializedName("CoreCount")
        private String coreCount;

        /** Task节点数量 */
        @SerializedName("TaskCount")
        private String taskCount;

        /** 运行时间 */
        @SerializedName("RunningTime")
        private String runningTime;

        /** 组件集合 */
        @SerializedName("AppConfigSet")
        private List<AppConfig> appConfigSet;

        /** 组件数量 */
        @SerializedName("AppConfigCount")
        private String appConfigCount;

        /** 是否开启安全组 */
        @SerializedName("IsOpenSecGroup")
        private String isOpenSecGroup;

        /** 节点集合 */
        @SerializedName("NodeSet")
        private List<NodeDetail> nodeSet;

        /** 节点数量 */
        @SerializedName("NodeCount")
        private String nodeCount;

        /** 集群磁盘加密密钥ID */
        @SerializedName("DataDiskKmsKeyId")
        private String dataDiskKmsKeyId;

        public String getZone() {
            return zone;
        }

        public void setZone(String zone) {
            this.zone = zone;
        }

        public String getTag() {
            return tag;
        }

        public void setTag(String tag) {
            this.tag = tag;
        }

        public String getInstanceId() {
            return instanceId;
        }

        public void setInstanceId(String instanceId) {
            this.instanceId = instanceId;
        }

        public String getInstanceName() {
            return instanceName;
        }

        public void setInstanceName(String instanceName) {
            this.instanceName = instanceName;
        }

        public String getFramework() {
            return framework;
        }

        public void setFramework(String framework) {
            this.framework = framework;
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

        public String getBusinessId() {
            return businessId;
        }

        public void setBusinessId(String businessId) {
            this.businessId = businessId;
        }

        public String getReleaseVersion() {
            return releaseVersion;
        }

        public void setReleaseVersion(String releaseVersion) {
            this.releaseVersion = releaseVersion;
        }

        public String getHadoopVersion() {
            return hadoopVersion;
        }

        public void setHadoopVersion(String hadoopVersion) {
            this.hadoopVersion = hadoopVersion;
        }

        public String getCreateTime() {
            return createTime;
        }

        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        public String getChargeType() {
            return chargeType;
        }

        public void setChargeType(String chargeType) {
            this.chargeType = chargeType;
        }

        public String getExpireTime() {
            return expireTime;
        }

        public void setExpireTime(String expireTime) {
            this.expireTime = expireTime;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public String getMasterCount() {
            return masterCount;
        }

        public void setMasterCount(String masterCount) {
            this.masterCount = masterCount;
        }

        public String getCoreCount() {
            return coreCount;
        }

        public void setCoreCount(String coreCount) {
            this.coreCount = coreCount;
        }

        public String getTaskCount() {
            return taskCount;
        }

        public void setTaskCount(String taskCount) {
            this.taskCount = taskCount;
        }

        public String getRunningTime() {
            return runningTime;
        }

        public void setRunningTime(String runningTime) {
            this.runningTime = runningTime;
        }

        public List<AppConfig> getAppConfigSet() {
            return appConfigSet;
        }

        public void setAppConfigSet(List<AppConfig> appConfigSet) {
            this.appConfigSet = appConfigSet;
        }

        public String getAppConfigCount() {
            return appConfigCount;
        }

        public void setAppConfigCount(String appConfigCount) {
            this.appConfigCount = appConfigCount;
        }

        public String getIsOpenSecGroup() {
            return isOpenSecGroup;
        }

        public void setIsOpenSecGroup(String isOpenSecGroup) {
            this.isOpenSecGroup = isOpenSecGroup;
        }

        public List<NodeDetail> getNodeSet() {
            return nodeSet;
        }

        public void setNodeSet(List<NodeDetail> nodeSet) {
            this.nodeSet = nodeSet;
        }

        public String getNodeCount() {
            return nodeCount;
        }

        public void setNodeCount(String nodeCount) {
            this.nodeCount = nodeCount;
        }

        public String getDataDiskKmsKeyId() {
            return dataDiskKmsKeyId;
        }

        public void setDataDiskKmsKeyId(String dataDiskKmsKeyId) {
            this.dataDiskKmsKeyId = dataDiskKmsKeyId;
        }
    }

    public static class DiskInfo extends Response {

        /** 磁盘数量 */
        @SerializedName("DiskNum")
        private Integer diskNum;

        /** 磁盘角色，一般分Boot和Data两种 */
        @SerializedName("DiskRole")
        private String diskRole;

        /** 磁盘大小，单位为GB */
        @SerializedName("DiskSize")
        private Integer diskSize;

        /**
         * 磁盘类型，分为CLOUD_RSSD(云盘RSSD)、CLOUD_SSD(云盘SSD)、LOCAL_SSD（本地SSD盘）、LOCAL_NORMAL（本地普通盘）、SATA（SATA盘）
         */
        @SerializedName("DiskType")
        private String diskType;

        public Integer getDiskNum() {
            return diskNum;
        }

        public void setDiskNum(Integer diskNum) {
            this.diskNum = diskNum;
        }

        public String getDiskRole() {
            return diskRole;
        }

        public void setDiskRole(String diskRole) {
            this.diskRole = diskRole;
        }

        public Integer getDiskSize() {
            return diskSize;
        }

        public void setDiskSize(Integer diskSize) {
            this.diskSize = diskSize;
        }

        public String getDiskType() {
            return diskType;
        }

        public void setDiskType(String diskType) {
            this.diskType = diskType;
        }
    }

    public static class IPSet extends Response {

        /** 类别 */
        @SerializedName("Type")
        private String type;

        /** IP */
        @SerializedName("IP")
        private String ip;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getIP() {
            return ip;
        }

        public void setIP(String ip) {
            this.ip = ip;
        }
    }

    public static class NodeDetail extends Response {

        /** 节点ID */
        @SerializedName("NodeId")
        private String nodeId;

        /** 机型种类，可选OutStanding(快杰机型)|Genenal(普通机型)|BareMetal(裸金属机型)三种类型 */
        @SerializedName("HostType")
        private String hostType;

        /** 磁盘信息集合 */
        @SerializedName("DiskSet")
        private List<DiskInfo> diskSet;

        /** CPU数量 */
        @SerializedName("CPU")
        private Integer cpu;

        /** 资源ID */
        @SerializedName("ResourceId")
        private String resourceId;

        /** 实例ID */
        @SerializedName("InstanceId")
        private String instanceId;

        /** 创建时间戳 */
        @SerializedName("CreateTime")
        private Integer createTime;

        /** 是否是新机型,快杰机型，GPU机型，云盘裸金属机型为新机型 */
        @SerializedName("IsNewType")
        private Boolean isNewType;

        /** 内存大小，单位为MB */
        @SerializedName("Memory")
        private Integer memory;

        /** 节点在集群中的⻆色(有Master,Core,Task 3种) */
        @SerializedName("NodeRole")
        private String nodeRole;

        /** 节点名称 */
        @SerializedName("NodeName")
        private String nodeName;

        /** 备注 */
        @SerializedName("Remark")
        private String remark;

        /** 节点的到期时间(下次扣款时间) */
        @SerializedName("ExpireTime")
        private Integer expireTime;

        /** 机型 */
        @SerializedName("NodeType")
        private String nodeType;

        /** 防火墙 信息 */
        @SerializedName("FirewallGroupConfig")
        private List<SecurityGroupConfig> firewallGroupConfig;

        /**
         * 运行：Running； 创建中：Creating； 删除中：Deleting； 创建失败：CreateFailed； 不可用：Unavailable；
         * 删除失败：DeleteFailed； 已删除：Deleted； 部署中： Deploying
         */
        @SerializedName("State")
        private String state;

        /** IP 信息 */
        @SerializedName("IPSet")
        private List<IPSet> ipSet;

        /** 是否是弹性伸缩节点 */
        @SerializedName("Scaling")
        private Boolean scaling;

        public String getNodeId() {
            return nodeId;
        }

        public void setNodeId(String nodeId) {
            this.nodeId = nodeId;
        }

        public String getHostType() {
            return hostType;
        }

        public void setHostType(String hostType) {
            this.hostType = hostType;
        }

        public List<DiskInfo> getDiskSet() {
            return diskSet;
        }

        public void setDiskSet(List<DiskInfo> diskSet) {
            this.diskSet = diskSet;
        }

        public Integer getCPU() {
            return cpu;
        }

        public void setCPU(Integer cpu) {
            this.cpu = cpu;
        }

        public String getResourceId() {
            return resourceId;
        }

        public void setResourceId(String resourceId) {
            this.resourceId = resourceId;
        }

        public String getInstanceId() {
            return instanceId;
        }

        public void setInstanceId(String instanceId) {
            this.instanceId = instanceId;
        }

        public Integer getCreateTime() {
            return createTime;
        }

        public void setCreateTime(Integer createTime) {
            this.createTime = createTime;
        }

        public Boolean getIsNewType() {
            return isNewType;
        }

        public void setIsNewType(Boolean isNewType) {
            this.isNewType = isNewType;
        }

        public Integer getMemory() {
            return memory;
        }

        public void setMemory(Integer memory) {
            this.memory = memory;
        }

        public String getNodeRole() {
            return nodeRole;
        }

        public void setNodeRole(String nodeRole) {
            this.nodeRole = nodeRole;
        }

        public String getNodeName() {
            return nodeName;
        }

        public void setNodeName(String nodeName) {
            this.nodeName = nodeName;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }

        public Integer getExpireTime() {
            return expireTime;
        }

        public void setExpireTime(Integer expireTime) {
            this.expireTime = expireTime;
        }

        public String getNodeType() {
            return nodeType;
        }

        public void setNodeType(String nodeType) {
            this.nodeType = nodeType;
        }

        public List<SecurityGroupConfig> getFirewallGroupConfig() {
            return firewallGroupConfig;
        }

        public void setFirewallGroupConfig(List<SecurityGroupConfig> firewallGroupConfig) {
            this.firewallGroupConfig = firewallGroupConfig;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public List<IPSet> getIPSet() {
            return ipSet;
        }

        public void setIPSet(List<IPSet> ipSet) {
            this.ipSet = ipSet;
        }

        public Boolean getScaling() {
            return scaling;
        }

        public void setScaling(Boolean scaling) {
            this.scaling = scaling;
        }
    }

    public static class SecurityGroupConfig extends Response {

        /** 防火墙ID */
        @SerializedName("GroupId")
        private String groupId;

        /** 防火墙组的名称 */
        @SerializedName("GroupName")
        private String groupName;

        /** 放火墙组创建时间，格式为Unix Timestamp */
        @SerializedName("CreateTime")
        private Integer createTime;

        /** 防火墙组类型，枚举值为： 0：用户自定义防火墙； 1：默认 Web防火墙； 2：默认非Web防火墙 */
        @SerializedName("Type")
        private String type;

        public String getGroupId() {
            return groupId;
        }

        public void setGroupId(String groupId) {
            this.groupId = groupId;
        }

        public String getGroupName() {
            return groupName;
        }

        public void setGroupName(String groupName) {
            this.groupName = groupName;
        }

        public Integer getCreateTime() {
            return createTime;
        }

        public void setCreateTime(Integer createTime) {
            this.createTime = createTime;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }
    }
}
